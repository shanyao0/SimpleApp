package shanyao.simpleapp.fragment.main.manager;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;
import shanyao.simpleapp.utils.ToastUtil;


/**
 * Created by zs on 2016/5/9.
 */
public class VipManagerFragment extends BaseFragment {
    @Override
    protected View getSuccessView() {
        TextView view = new TextView(getActivity());
        view.setClickable(true);
        view.setText("会员管理");
        view.setTextColor(Color.RED);
        view.setTextSize(50);
        view.setOnClickListener(this);
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2000);
                    pdLoading.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        return view;
    }

    @Override
    protected Object requestData() {

        return ConstantUtils.STATE_SUCCESSED;
    }


    @Override
    public void onClick(View v) {
        pdLoading.show();
        ToastUtil.show(getActivity(),"llll");
    }
}
