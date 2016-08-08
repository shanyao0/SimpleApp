package shanyao.simpleapp.fragment.main.operation;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;


/**
 * Created by zs on 2016/5/9.
 */
public class OutInRecordFragment extends BaseFragment {
    @Override
    protected Object requestData() {
        return ConstantUtils.STATE_LOADING;
    }

    @Override
    protected View getSuccessView() {
        TextView view = new TextView(getActivity());
        view.setText("出入记录");
        view.setTextColor(Color.RED);
        view.setTextSize(50);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
