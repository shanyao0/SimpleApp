package shanyao.simpleapp.http;

import rx.Subscriber;
import shanyao.simpleapp.application.SYApplication;
import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;
import shanyao.simpleapp.utils.DeviceUtil;
import shanyao.simpleapp.utils.ToastUtil;

/**
 * Created by zs on 2016/8/5.
 *
 * 一般请求
 */
public abstract class ResponseSubscribe<T> extends Subscriber<T>{
    private BaseFragment fragment;

    public ResponseSubscribe(BaseFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void onCompleted() {
        fragment.refreshPage(ConstantUtils.STATE_SUCCESSED);
    }

    @Override
    public void onError(Throwable e) {
        if(!DeviceUtil.deviceConnect(SYApplication.getContext())){
            ToastUtil.show(SYApplication.getContext(), "当前无网络连接，请先设置网络!");
        }else{
            ToastUtil.show(SYApplication.getContext(), "请求失败，请稍后重试...");
        }
        fragment.refreshPage(ConstantUtils.STATE_FAILED);
    }
}
