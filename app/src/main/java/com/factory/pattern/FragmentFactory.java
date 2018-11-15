package com.factory.pattern;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class FragmentFactory {
    public static Fragment createById(int resId) {
        Fragment fragment = null;
        switch (resId) {
            case FragmentID.FIRST_FRAGMENT:
                fragment = new FirstFragment();
                break;
            case FragmentID.SECOND_FRAGMENT:
                fragment = new SecondFragment();
                break;
        }
        return fragment;
    }

    public static Fragment createById(int resId, Bundle bundle) {
        Fragment fragment = null;
        switch (resId) {
            case FragmentID.THIRD_FRAGMENT:
                fragment = new ThirdFragment();
                break;
        }
        fragment.setArguments(bundle);
        return fragment;
    }
}
