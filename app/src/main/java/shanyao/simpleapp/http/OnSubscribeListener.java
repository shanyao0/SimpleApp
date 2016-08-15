package shanyao.simpleapp.http;

/**
 * Created by zs on 2016/8/15.
 */
public interface OnSubscribeListener<T> {
    void onNext(T t);
}
