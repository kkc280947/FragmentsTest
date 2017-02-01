package com.example.cbluser3.fragmentstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cbluser3 on 1/2/17.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
       textView=(TextView)view.findViewById(R.id.tvFirstFrag);
        textView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tvFirstFrag:{

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.flFrame,new SecondFragment(),"")
                        .addToBackStack("tag")
                        .commit();
                break;
            }

        }
    }
}
