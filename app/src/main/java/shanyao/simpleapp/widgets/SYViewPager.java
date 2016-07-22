package shanyao.simpleapp.widgets;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SYViewPager extends ViewPager {
    float preX;
    float preY;

    public SYViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SYViewPager(Context context) {
        super(context);
    }

    /**
     * 即判断如果移动距离超过一定数值则认为滑屏操作，ViewPager就直接进行截取处理，不再传递到子view去。
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean res = super.onInterceptTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            preX = event.getX();
            preY = event.getY();
        } else {
            if (Math.abs(event.getX() - preX) > Math.abs(event.getY() - preY)) {
                return true;
            } else {
                preX = event.getX();
                preY = event.getY();
            }
        }
        return res;
    }
}
