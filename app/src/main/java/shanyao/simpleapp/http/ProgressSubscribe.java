package shanyao.simpleapp.http;

import rx.Subscriber;
import shanyao.simpleapp.fragment.BaseFragment;

/**
 * Created by zs on 2016/8/5.
 */
public abstract class ProgressSubscribe<T> extends Subscriber<T>{
    @Override
    public void onStart() {
        super.onStart();
        BaseFragment.pdLoading.show();
    }

    @Override
    public void onCompleted() {
        BaseFragment.pdLoading.dismiss();
    }

    @Override
    public void onError(Throwable e) {
        BaseFragment.pdLoading.dismiss();
    }
}
