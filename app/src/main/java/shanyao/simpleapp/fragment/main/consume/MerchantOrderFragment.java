package shanyao.simpleapp.fragment.main.consume;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;


/**
 * Created by zs on 2016/5/9.
 */
public class MerchantOrderFragment extends BaseFragment {
    @Override
    protected View getSuccessView() {
        TextView view = new TextView(getActivity());
        view.setText("商家订单");
        view.setTextColor(Color.RED);
        view.setTextSize(50);
        return view;
    }

    @Override
    protected Object requestData() {
        return ConstantUtils.STATE_SUCCESSED;
    }

    @Override
    public void onClick(View v) {

    }
}
