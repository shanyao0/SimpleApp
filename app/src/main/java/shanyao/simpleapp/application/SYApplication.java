package shanyao.simpleapp.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

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
}
