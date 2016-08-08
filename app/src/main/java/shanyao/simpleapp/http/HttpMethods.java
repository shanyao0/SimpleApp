package shanyao.simpleapp.http;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import shanyao.simpleapp.bean.BaseBean;
import shanyao.simpleapp.bean.ParkBean;

/**
 * Created by zs on 16/3/9.
 */
public class HttpMethods {


    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;

    //构造方法私有
    public HttpMethods() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(URLUtils.BASE_URL1)
                .build();
    }

    /**
     * 获取停车场的数据
     * @param map
     * @param subscriber
     */
    public void getPark(Map<String, String> map,Subscriber<List<ParkBean>> subscriber){
        retrofit.create(IService.IParking.class).getBean(map)
                .map(new HttpFunc<List<ParkBean>>())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    public class HttpFunc<T> implements Func1<BaseBean<T>,T>{
        @Override
        public T call(BaseBean<T> tBaseBean) {
            if(!tBaseBean.isResult()){

            }
            return tBaseBean.getData();
        }
    }
}
