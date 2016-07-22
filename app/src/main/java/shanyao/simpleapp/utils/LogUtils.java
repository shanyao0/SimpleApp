package shanyao.simpleapp.utils;

import android.util.Log;

public class LogUtils {
	// Log开关控制
	public static boolean isDebug = true;
	/**
	 * i级别的log输出
	 */
	public static void i(String tag,String msg){
		if(isDebug){
			Log.i(tag, msg);
		}
	}
	/**
	 * i级别的log输出
	 */
	public static void i(Object object,String msg){
		if(isDebug){
			Log.i(object.getClass().getSimpleName(), msg);
		}
	}
	/**
	 * e级别的log输出
	 */
	public static void e(String tag,String msg){
		if(isDebug){
			Log.e(tag, msg);
		}
	}
	/**
	 * e级别的log输出
	 */
	public static void e(Object object,String msg){
		if(isDebug){
			Log.e(object.getClass().getSimpleName(), msg);
		}
	}
}
