package com.meizu.dialer;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private ExampleFragment_top exampleFragment_top = null;
        private ExampleFragment_list exampleFragment_list = null;
        private ExampleFragment_fooler exampleFragment_fooler = null;



        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
            exampleFragment_top = new ExampleFragment_top();
            exampleFragment_list = new ExampleFragment_list();
            exampleFragment_fooler = new ExampleFragment_fooler();
        }

    @Override
        public int getCount() {
            int PAGER_COUNT = 4;
            return PAGER_COUNT;
        }

        @Override
        public Object instantiateItem(ViewGroup vg, int position) {
            return super.instantiateItem(vg, position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            System.out.println("position Destory" + position);
            super.destroyItem(container, position, object);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case MainActivity.PAGE_ONE:
                    fragment = exampleFragment_top;
                    break;
                case MainActivity.PAGE_TWO:
                    fragment = exampleFragment_list;
                    break;
                case MainActivity.PAGE_THREE:
                    fragment = exampleFragment_fooler;
                    break;

            }
            return fragment;
        }

}



