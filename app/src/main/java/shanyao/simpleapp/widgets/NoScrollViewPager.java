package shanyao.simpleapp.widgets;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollViewPager extends ViewPager {

	public NoScrollViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public NoScrollViewPager(Context context) {
		super(context);
	}
	/**
	 * 事件不处理触摸事件，返回false
	 */
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		return false;
	}
	/**
	 * false：不拦截儿子的触摸事件
	 */
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return false;
	}
}
