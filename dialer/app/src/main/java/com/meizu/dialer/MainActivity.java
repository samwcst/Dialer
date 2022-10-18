package com.meizu.dialer;


import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener{

  //  private Button btn_recent,btn_dial,btn_contact;

    private FragmentPagerAdapter mAdapter;

    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 0;
            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                return null;
            }
        };


        Log.d(TAG, "onCreate: ");
    }

    private static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}