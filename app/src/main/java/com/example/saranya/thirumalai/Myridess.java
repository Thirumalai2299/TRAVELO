package com.example.saranya.thirumalai;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Myridess extends AppCompatActivity {

    DatabaseReference ride;
    ListView listViewmyrides;
    List<myridebase> myridebaseList;
    private FirebaseAuth mAuth;
    private FirebaseDatabase display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myridess);
        mAuth=FirebaseAuth.getInstance();
        listViewmyrides=(ListView)findViewById(R.id.listviewmyrides);
        myridebaseList=new ArrayList<>();
        display=FirebaseDatabase.getInstance();
        ride=display.getReference().child(mAuth.getUid()).child("rides");
    }

    @Override
    public void onStart() {
        super.onStart();
        ride.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                myridebaseList.clear();
                for(DataSnapshot myrideSnapshot : dataSnapshot.getChildren()){

                    myridebase myride = myrideSnapshot.getValue(myridebase.class);
                    myridebaseList.add(myride);

                }

                myridelist adapter=new myridelist(Myridess.this, myridebaseList);
                listViewmyrides.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
