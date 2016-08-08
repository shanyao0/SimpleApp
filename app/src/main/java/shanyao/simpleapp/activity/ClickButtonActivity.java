package shanyao.simpleapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import shanyao.simpleapp.R;
import shanyao.simpleapp.fragment.FragmentFactory;


/**
 * 所有能点击的按钮全部跳转到这个页面
 * Created by zs on 2015/11/3.
 */
public class ClickButtonActivity extends BaseActivity {

    FragmentManager fm;
    public Intent intent;
    public FragmentTransaction ft;
    @Bind(R.id.action_bar_back)
    public ImageView actionBarBack;
    @Bind(R.id.tv_title)
    public TextView tvTitle;
    @Bind(R.id.iv_right)
    public ImageView ivRight;
    @Bind(R.id.rl_actionbar)
    public RelativeLayout rlActionbar;
    @Bind(R.id.fl_click_button)
    public FrameLayout flClickButton;
    @Bind(R.id.tv_right)
    public TextView tvRight;

    public int resId;
    public String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_button);
        ButterKnife.bind(this);
        // 获取传递过来的资源id值
        intent = getIntent();

        resId = intent.getIntExtra("resId", 0);
        if (intent.getExtras() != null) {
            resId = intent.getExtras().getInt("resId");
        }
        // 这里需要传递其他值可以自己定义
        id = intent.getStringExtra("id");
        /**
         * 根据传递过来的不同的资源id值设置不同的fragment
         */
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fl_click_button, FragmentFactory.createById(resId));
        ft.commit();

        actionBarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickButtonActivity.this.finish();
            }
        });
    }
}
