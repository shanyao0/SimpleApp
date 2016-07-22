package shanyao.simpleapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import shanyao.simpleapp.fragment.FragmentFactory;


/**
 * Created by zs on 2016/5/9.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.createForMain(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

}
