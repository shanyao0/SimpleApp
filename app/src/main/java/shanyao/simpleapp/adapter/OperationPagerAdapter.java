package shanyao.simpleapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import shanyao.simpleapp.fragment.FragmentFactory;


/**
 * Created by zhaoshuo on 2016/5/10.
 */
public class OperationPagerAdapter extends FragmentStatePagerAdapter{
    public OperationPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.createForOperation(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}
