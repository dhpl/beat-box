package com.philong.beatbox;

import android.support.v4.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity{

    @Override
    protected Fragment getFragment() {
        return BeatBoxFragment.newInstance();
    }




}