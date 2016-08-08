package shanyao.simpleapp.fragment.park;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import shanyao.simpleapp.R;
import shanyao.simpleapp.bean.ParkBean;
import shanyao.simpleapp.fragment.BaseListFragment;
import shanyao.simpleapp.http.HttpMethods;
import shanyao.simpleapp.http.ResponseSubscribe;
import shanyao.simpleapp.utils.ConstantUtils;
import shanyao.simpleapp.utils.JsonParseUtil;
import shanyao.simpleapp.utils.LogUtils;


/**
 * Created by zs on 2016/5/9.
 */
public class ParkListFragment extends BaseListFragment<ParkBean> {

    @Override
    protected Object requestData() {
        final HashMap<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(1));
        params.put("sortType", String.valueOf(1));
        params.put("rows", String.valueOf(ConstantUtils.PAGER_ROWS));
        params.put("latitude", String.valueOf(39.861716));
        params.put("longitude", String.valueOf(116.426576));
        new HttpMethods().getPark(params,new ResponseSubscribe<List<ParkBean>>() {
            @Override
            public void onNext(List<ParkBean> parkBeen) {
                list = (ArrayList<ParkBean>) parkBeen;
                LogUtils.e("zs", JsonParseUtil.getJson(parkBeen));
                refreshPage(ConstantUtils.STATE_SUCCESSED);
            }
        });
        return ConstantUtils.STATE_LOADING;
    }

    @Override
    protected View setView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(getActivity(), R.layout.item_share_carport, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ParkBean bean = list.get(position);
//        ImageLoadUtil.displayImage(activity, bean.getPicture(), holder.ivPicture, ImageLoadUtil.getDefaultOptions());
        holder.tvPublicTime.setText(bean.getStatTime() + "--" + bean.getEndTime());
        holder.tvParkName.setText(bean.getParkName());
        holder.tvAddress.setText(bean.getAddress());
//        holder.tvDistance.setText(CommonUtils.getDistance(ShareUtils.getFloat(ShareUtils.CURRENT_LAT, 0.0f),
//                ShareUtils.getFloat(ShareUtils.CURRENT_LON, 0.0f), bean.getLatitude(), bean.getLongitude()));
        holder.tvPrice.setText(bean.getPrice() + "");
        int spaceType = bean.getSpaceType();
        if (spaceType == 2) {
            holder.ivStandardSmart.setSelected(false);
        } else {
            holder.ivStandardSmart.setSelected(true);
        }
        return convertView;
    }

    @Override
    protected void setRefresh() {

    }

    @Override
    protected void loadMore() {

    }

    @Override
    protected void setActionBar() {

    }

    @Override
    public void onClick(View v) {

    }
    static class ViewHolder {
        @Bind(R.id.iv_picture)
        ImageView ivPicture;
        @Bind(R.id.tv_public_time)
        TextView tvPublicTime;
        @Bind(R.id.tv_price_unit)
        TextView tvPriceUnit;
        @Bind(R.id.tv_price)
        TextView tvPrice;
        @Bind(R.id.tv_park_name)
        TextView tvParkName;
        @Bind(R.id.tv_address)
        TextView tvAddress;
        @Bind(R.id.tv_distance)
        TextView tvDistance;
        @Bind(R.id.iv_standard_smart)
        ImageView ivStandardSmart;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
