package shanyao.simpleapp.http.httplibrary;

import rx.functions.Func1;
import shanyao.simpleapp.application.SYApplication;
import shanyao.simpleapp.utils.ToastUtil;

/**
 * Created by zs on 2016/8/12.
 */
public class HttpFunc<T> implements Func1<BaseBean<T>,T> {
    @Override
    public T call(BaseBean<T> tBaseBean) {
        if(!tBaseBean.isResult()){
            ToastUtil.show(SYApplication.getContext(),tBaseBean.getMsg());
            return null;
        }
        return tBaseBean.getData();
    }
}
