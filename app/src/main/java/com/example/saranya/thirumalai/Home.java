package com.example.saranya.thirumalai;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
 private Button btn;
 Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        intent=new Intent(getActivity(),Book.class);
        btn=(Button)view.findViewById(R.id.bookbtn);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(intent);
            }
        });
        return view;

    }


    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        getActivity().setTitle("Home");
    }
}
