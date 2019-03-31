package com.example.saranya.thirumalai;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class myridelist extends ArrayAdapter<myridebase>{
    private Activity context;
    private List<myridebase>myrides;

    public myridelist(Activity context, List<myridebase>myrides){
        super(context, R.layout.list_layout,myrides);
        this.context=context;
        this.myrides=myrides;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViiewItem = inflater.inflate(R.layout.list_layout,null,true);
        TextView picktxt=(TextView)listViiewItem.findViewById(R.id.picktxt);
        TextView droptxt=(TextView)listViiewItem.findViewById(R.id.droptxt);
        TextView ridedisttxt=(TextView)listViiewItem.findViewById(R.id.ridedisttxt);
        TextView ridefaretxt=(TextView)listViiewItem.findViewById(R.id.ridefaretxt);
        myridebase myridebase=myrides.get(position);

        picktxt.setText(myridebase.getPickupLocation());
        droptxt.setText(myridebase.getDropLocation());
        ridedisttxt.setText(myridebase.getRide_Distance());
        ridefaretxt.setText(myridebase.getRide_Fare());
        return listViiewItem;
    }
}
