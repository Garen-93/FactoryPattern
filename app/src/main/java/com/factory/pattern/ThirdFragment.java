package com.factory.pattern;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_3, container, false);
        if (getArguments() != null) {
            String msg = getArguments().getString("msg");
            TextView tv_msg = (TextView) view.findViewById(R.id.tv_msg);
            tv_msg.setText(msg);
        }

        return view;
    }


}
