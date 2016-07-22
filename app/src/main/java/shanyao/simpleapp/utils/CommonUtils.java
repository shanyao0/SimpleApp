package shanyao.simpleapp.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import java.util.regex.Pattern;

import shanyao.simpleapp.application.SYApplication;

public class CommonUtils {
    /**
     * dip转化成px
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px转化成dip
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * px转化成sp
     */
    public static int px2sp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * sp转化成px
     */
    public static int sp2px(Context context, float spValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (spValue * scale + 0.5f);
    }

    /**
     * 在主线程执行任务
     */
    public static void runOnUIThread(Runnable r) {
        SYApplication.getHandler().post(r);
    }

    /**
     * 获取Resource对象
     */
    public static Resources getResources() {
        return SYApplication.getContext().getResources();
    }

    /**
     * 获取Drawable资源
     */
    public static Drawable getDrawable(int resId) {
        return getResources().getDrawable(resId);
    }

    /**
     * 获取字符串资源
     */
    public static String getString(int resId) {
        return getResources().getString(resId);
    }

    /**
     * 获取color资源
     */
    public static int getColor(int resId) {
        return getResources().getColor(resId);
    }

    /**
     * 获取dimens资源
     */
    public static float getDimens(int resId) {
        return getResources().getDimension(resId);
    }

    /**
     * 获取字符串数组资源
     */
    public static String[] getStringArray(int resId) {
        return getResources().getStringArray(resId);
    }

    /**
     * 将自己从父容器中移除
     */
    public static void removeSelfFromParent(View child) {
        // 获取父view
        if (child != null) {
            ViewParent parent = child.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                // 将自己移除
                viewGroup.removeView(child);
            }
        }
    }

    public static boolean isCameraCanUse(){
        boolean bool = false;

        PackageManager pm = SYApplication.getContext().getPackageManager();
        bool = pm.hasSystemFeature(PackageManager.FEATURE_CAMERA) || pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);

        return bool;
    }

    /**
     * 验证车牌号码格式是否正确
     * @param plateNumber 车牌号码
     * @return ture正确 falise错误
     */
    public static boolean checkPlateNumber(String plateNumber) {
        String regex = "^[\u4e00-\u9fa5|WJ]{1}[A-Z0-9]{6}$";
        return Pattern.matches(regex, plateNumber);
    }


}


