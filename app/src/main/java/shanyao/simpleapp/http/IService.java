package shanyao.simpleapp.http;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;
import shanyao.simpleapp.bean.BaseBean;
import shanyao.simpleapp.bean.ParkBean;

/**
 * Created by zs on 2016/8/5.
 */
public class IService {
    public interface IParking{
        /**
         * 共享车位列表
         *
         * @return
         */
        @GET(URLUtils.SHARE_CARPORT1)
        Observable<BaseBean<List<ParkBean>>> getBean(@QueryMap Map<String,String> map);
    }
}
