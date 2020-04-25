package com.hautec.hiotcloud.ui.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

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
        fragment = EquipmentFragment.newInstance();
      switch (position){
          case Constans.MAIN_VIEWPAGE_INDEX_MESSAGE:
              //创建消息Frament todo
              fragment = MessageFragment.newInstance();
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_EQUIPMENT:
              //创建设备frament
            fragment = EquipmentFragment.newInstance();
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_SCENE:
              //创建场景frament
              fragment = SceneFragment.newInstance();
              break;
          case Constans.MAIN_VIEWPAGE_INDEX_MINE:
              //创建我的frament
              fragment = MineFragment.newInstance();
              break;
      }
      return fragment;
    }

    @Override
    public int getCount() {
        return Constans.MAIN_FRAGMENT_COUNT;
    }
}
