package shanyao.simpleapp.http;

import rx.Subscriber;
import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.LogUtils;

/**
 * Created by zs on 2016/8/5.
 */
public abstract class ResponseSubscribe<T> extends Subscriber<T>{

    @Override
    public void onCompleted() {
        BaseFragment.pdLoading.dismiss();
    }

    @Override
    public void onError(Throwable e) {
        LogUtils.e("zs",e.toString());
    }
}
