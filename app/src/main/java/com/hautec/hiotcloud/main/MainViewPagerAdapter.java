package com.hautec.hiotcloud.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.hautec.hiotcloud.utils.Constans;

/**
 * viewPager适配器
 */
class MainViewPagerAdapter extends FragmentPagerAdapter {
    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
      switch (position){
          case Constans.MAIN_VIEWPAGE_INDEX_MESSAGE:
              //创建消息Frament todo
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_EQUIPMENT:
              //创建设备frament
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_SCENE:
              //创建场景frament
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_MINE:
              //创建我的frament
              break;
      }
      return fragment;
    }

    @Override
    public int getCount() {
        return Constans.MAIN_FRAGMENT_COUNT;
    }
}
