package com.student.kevin.bottomnavigationbar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.student.kevin.bottomnavigationbar.Constants;
import com.student.kevin.bottomnavigationbar.R;

/**
 * Created by Kevin on 2016/11/20.
 * Blog:http://blog.csdn.net/student9128
 * Describe：the forth fragment
 */

public class FragmentFour extends BaseFragment {

    public static FragmentFour newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS,s);
        FragmentFour fragment = new FragmentFour();
        fragment.setArguments(bundle);
        return fragment;
    }

}
