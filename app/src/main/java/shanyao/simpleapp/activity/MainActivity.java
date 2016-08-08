package shanyao.simpleapp.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import shanyao.simpleapp.R;
import shanyao.simpleapp.adapter.MainPagerAdapter;
import shanyao.simpleapp.widgets.NoScrollViewPager;

public class MainActivity extends BaseActivity {


    @Bind(R.id.bottom_main)
    RadioButton bottomMain;
    @Bind(R.id.bottom_park)
    RadioButton bottomPark;
    @Bind(R.id.bottom_me)
    RadioButton bottomMe;
    @Bind(R.id.radio_group)
    RadioGroup radioGroup;
    @Bind(R.id.viewpager)
    NoScrollViewPager viewpager;
    @Bind(R.id.home_title)
    TextView homeTitle;
    ImageView imageView;

    private MainPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        adapter = new MainPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(5);
        viewpager.setCurrentItem(0);
        homeTitle.setText("首页");
        bottomMain.setChecked(true);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bottom_main:
                        viewpager.setCurrentItem(0, false);
                        homeTitle.setText("首页");
                        break;
                    case R.id.bottom_park:
                        viewpager.setCurrentItem(1, false);
                        homeTitle.setText("停车场");
                        break;
                    case R.id.bottom_me:
                        viewpager.setCurrentItem(2, false);
                        homeTitle.setText("我");
                        break;
                }
            }
        });
    }
}
