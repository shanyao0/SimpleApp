package shanyao.simpleapp.http.httplibrary;

import android.app.ProgressDialog;
import android.content.Context;

import rx.Subscriber;
import shanyao.simpleapp.application.SYApplication;
import shanyao.simpleapp.utils.DeviceUtil;
import shanyao.simpleapp.utils.ToastUtil;

/**
 * Created by zs on 2016/8/5.
 *
 * 加载对话框的请求
 */
public abstract class SubscriberProgress<T> extends Subscriber<T>{
    private Context context;
    private ProgressDialog pdLoading;

    public SubscriberProgress(Context context) {
        this.context = context;
    }

    @Override
    public void onStart() {
        super.onStart();
        /**
         * 初始化pdLoading
         */
        pdLoading = new ProgressDialog(context);
        pdLoading.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pdLoading.setMessage("请稍后");
        pdLoading.setCanceledOnTouchOutside(false);
        pdLoading.setCancelable(true);
    }

    @Override
    public void onCompleted() {
        pdLoading.dismiss();
    }

    @Override
    public void onError(Throwable e) {
        if(!DeviceUtil.deviceConnect(context)){
            ToastUtil.show(SYApplication.getContext(), "当前无网络连接，请先设置网络!");
        }else{
            ToastUtil.show(SYApplication.getContext(), "请求失败，请稍后重试...");
        }
        pdLoading.dismiss();
    }
}
