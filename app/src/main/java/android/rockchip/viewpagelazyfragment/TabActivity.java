package android.rockchip.viewpagelazyfragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.rockchip.viewpagelazyfragment.adapter.MyPagerAdapter;
import android.rockchip.viewpagelazyfragment.viewpager.FlipViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private FlipViewPager mViewPager;

    private HomeFragment homefragment;
    private KnowledgeSystemFragment knowledgeSystemFragment;
    private ProgramsDetailsStrengthFragment programsDetailsStrengthFragment;
    private ProjectFragment projectFragment;
    private List<Fragment> mFragments;
    private MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);
        initView();
        initData();
        initEvent();
    }

    /**
     * 初始化视图
     */
    private void initView() {
        mTabLayout = findViewById(R.id.tl_tabs);
        mViewPager = findViewById(R.id.vp_tabs);

        mTabLayout.addTab(mTabLayout.newTab().setText("首页"));
        mTabLayout.addTab(mTabLayout.newTab().setText("知识体系"));
        mTabLayout.addTab(mTabLayout.newTab().setText("项目"));
    }

    /**
     * 初始化数据
     */
    private void initData() {
        mFragments = new ArrayList<>();
        homefragment = new HomeFragment();
        knowledgeSystemFragment = new KnowledgeSystemFragment();
        programsDetailsStrengthFragment = new ProgramsDetailsStrengthFragment();
        projectFragment = new ProjectFragment();
        mFragments.add(homefragment);
        mFragments.add(knowledgeSystemFragment);
        mFragments.add(projectFragment);
        mFragments.add(programsDetailsStrengthFragment);

        mAdapter = new MyPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
                mFragments);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(mFragments.size());

        mViewPager.setAnimationEnabled(true);
        mViewPager.setFadeEnabled(false);
        mViewPager.setPageMargin(mViewPager.dp2px(getResources(), 80));
        // 关联ViewPager
        mTabLayout.setupWithViewPager(mViewPager);
        // mTabLayout.setupWithViewPager方法内部会remove所有的tabs，这里重新设置一遍tabs的text，否则tabs的text不显示
        mTabLayout.getTabAt(0).setText("首页");
        mTabLayout.getTabAt(1).setText("知识体系");
        mTabLayout.getTabAt(2).setText("项目");
    }

    /**
     * 初始化事件
     */
    private void initEvent() {

    }
}