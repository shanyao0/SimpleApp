package shanyao.simpleapp.http;

import java.util.List;

import rx.Subscriber;
import shanyao.simpleapp.application.SYApplication;
import shanyao.simpleapp.fragment.BaseListFragment;
import shanyao.simpleapp.utils.DeviceUtil;
import shanyao.simpleapp.utils.ToastUtil;

/**
 * Created by zs on 2016/8/5.
 * <p/>
 * 刷新三种请求状态
 */
public class RefreshSubscribe<T> extends Subscriber<T> {
    private BaseListFragment fragment;
    private boolean isRefresh;
    private OnSubscribeListener<T> listener;

    public RefreshSubscribe(BaseListFragment fragment, boolean isRefresh, OnSubscribeListener<T> listener) {
        this.fragment = fragment;
        this.isRefresh = isRefresh;
        this.listener = listener;
    }

    @Override
    public void onCompleted() {
        fragment.setList(fragment.list);
        fragment.adapter.notifyDataSetChanged();
        fragment.refreshListView.onRefreshComplete();
    }

    @Override
    public void onError(Throwable e) {
        if (!DeviceUtil.deviceConnect(SYApplication.getContext())) {
            ToastUtil.show(SYApplication.getContext(), "当前无网络连接，请先设置网络!");
        } else {
            ToastUtil.show(SYApplication.getContext(), "请求失败，请稍后重试...");
        }
        fragment.refreshListView.onRefreshComplete();
    }

    @Override
    public void onNext(T t) {
        if (isRefresh) {
            ToastUtil.show(SYApplication.getContext(), "刷新成功");
        } else {
            if (t == null) {
                ToastUtil.show(SYApplication.getContext(), "没有更多数据了");
            } else if (t instanceof List && ((List) t).size() == 0) {
                ToastUtil.show(SYApplication.getContext(), "没有更多数据了");
            } else {
                ToastUtil.show(SYApplication.getContext(), "加载更多成功");
            }
        }
        listener.onNext(t);
    }
}
