package shanyao.simpleapp.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SYApplication extends Application {
    private static Context mContext;
    private static Handler mHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        mHandler = new Handler();
    }
    /**
     * 获取全局的context
     */
    public static Context getContext() {
        return mContext;
    }

    /**
     * 获取全局的主线程的handler
     */
    public static Handler getHandler() {
        return mHandler;
    }

    /**
     * 设置OkHttpClient
     */
    public static OkHttpClient initOkHttpClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .writeTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
//                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                                .addHeader("Accept-Encoding", "gzip, deflate")
                                .addHeader("Connection", "keep-alive")
                                .build();
                        return chain.proceed(request);
                    }
                })
                .build();
        return client;
    }
}
