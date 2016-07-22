package shanyao.simpleapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

import shanyao.simpleapp.R;
import shanyao.simpleapp.utils.ConstantUtils;


/**
 * Created by zs on 2015/12/21.
 */
public abstract class BaseListFragment<T> extends BaseFragment {
    public PullToRefreshListView refreshListView;
    public ListView listView;
    public ArrayList<T> list = new ArrayList<>();
    public Context mContext;
    public MyAdapter adapter;
    public  Handler handler;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPullToRefresh();
        setActionBar();
    }

    @Override
    protected View getSuccessView() {
        handler = new Handler();
//        list = (ArrayList<T>) requestData();
        adapter = new MyAdapter();
        listView.setAdapter(adapter);
        return refreshListView;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 列表适配器
     *
     */
    public class MyAdapter extends BaseAdapter {
        public MyAdapter() {
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return setView(position, convertView, parent);
        }
    }

    /**
     * 初始化PullToRefresh
     */
    public void initPullToRefresh() {
        /*
         * 1.初始化refresListView,设置状态改变监听
		 */
        refreshListView = (PullToRefreshListView) View.inflate(getActivity(),
                R.layout.ptr_listview, null);
        // 设置两边都可以啦，默认只有上拉
        if(list.size()>= ConstantUtils.MAX_ITEM_LOAD_MORE){
            refreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        }else{
            refreshListView.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        }
        refreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            /**
             * 上拉刷新和下拉加载更多都会执行该方法
             */
            @Override
            public void onRefresh(final PullToRefreshBase<ListView> refreshView) {
                // 下拉刷新
                if (refreshListView.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_START) {
                            setRefresh();// 下拉刷新
                }
                // 上拉加载更多
                else {
                    // 请求数据，并根据当前状态刷新列表，如果加载更多请求数据失败，可以显示加载失败页面
                    loadMore();
                }
            }
        });
        /*
         * 2. 获取普通的ListView设置adapter
		 */
        listView = refreshListView.getRefreshableView();
        // listview的优化设置
        listView.setDividerHeight(0);
        listView.setSelector(android.R.color.transparent);
        listView.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
    }

    protected abstract View setView(int position, View convertView, ViewGroup parent);
    protected abstract void setRefresh();
    protected abstract void loadMore();
    protected abstract void setActionBar();
}
