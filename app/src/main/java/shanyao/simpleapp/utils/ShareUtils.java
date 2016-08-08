package shanyao.simpleapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

import shanyao.simpleapp.application.SYApplication;


public class ShareUtils {

    private static final String NAME = "shanyao";
    private static SharedPreferences sp = null;
    private static Context context = SYApplication.getContext();
    /**
     * key值
     */
    // =============登陆=========================
    public static String PRE_PHONE_NUM = "pre_phone_num";
    public static String LOGIN_STATE = "login_state";// 登陆状态
    public static String MY_PHONE_NUM = "my_phone_num";// 我的手机号码
    public static String MY_BIND_CAR_NUM = "my_bind_car_num";// 我绑定的车位
    // =============找车场=========================
    public static String CURRENT_LAT= "current_lat";
    public static String CURRENT_LON= "current_lon";
    public static String UPDATE_ID= "update_id";
    public static String VERSION="version";
    /**
     * 存布尔值
     */
    public static void putBoolean(String key, boolean value) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * 去布尔值
     */
    public static boolean getBoolean(String key,
                                     boolean defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key, defValue);
    }

    /**
     * 存Strings
     */
    public static void putString(String key, String value) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        sp.edit().putString(key, value).commit();
    }

    /**
     * 取String
     */
    public static String getString(String key, String defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        return sp.getString(key, defValue);
    }

    /**
     * 存int
     */
    public static void putInt(String key, int value) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        sp.edit().putInt(key, value).commit();
    }

    /**
     * 取int
     */
    public static int getInt(String key, int defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        return sp.getInt(key, defValue);
    }

    /**
     * 存Float
     */
    public static void putFloat(String key, Float value) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        sp.edit().putFloat(key, value).commit();
    }

    /**
     * 取Float
     */
    public static Float getFloat(String key, Float defValue) {
        if (sp == null) {
            sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        }
        return sp.getFloat(key, defValue);
    }
}
