package shanyao.simpleapp.http;

import java.util.List;
import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import shanyao.simpleapp.application.SYApplication;
import shanyao.simpleapp.bean.BaseBean;
import shanyao.simpleapp.bean.ParkBean;

/**
 * Created by zs on 16/3/9.
 */
public class HttpApis {

    private Retrofit retrofit;

    public HttpApis() {
        retrofit = new Retrofit.Builder()
                .client(SYApplication.initOkHttpClient())
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
                .compose(HttpSchedulers.<BaseBean<List<ParkBean>>>io_main())
                .map(new HttpFunc<List<ParkBean>>())
                .subscribe(subscriber);
    }
}
