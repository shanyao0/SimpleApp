package shanyao.simpleapp.fragment.main.manager;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;


/**
 * Created by zs on 2016/5/9.
 */
public class VipManagerFragment extends BaseFragment {
    @Override
    protected View getSuccessView() {
        TextView view = new TextView(getActivity());
        view.setText("会员管理");
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
