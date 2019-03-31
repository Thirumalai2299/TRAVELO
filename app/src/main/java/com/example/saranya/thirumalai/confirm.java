package com.example.saranya.thirumalai;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class confirm extends AppCompatActivity {
    TextView pickcon;
    TextView dropcon;
    TextView ridediscon;
    TextView ridefarecon;
    private FirebaseAuth mAuth;
    private FirebaseDatabase display;
    Button btn;
    String verification_code;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        pickcon=(TextView)findViewById(R.id.pickcon);
        dropcon=(TextView)findViewById(R.id.dropcon);
        ridediscon=(TextView)findViewById(R.id.ridediscon);
        ridefarecon=(TextView)findViewById(R.id.ridefarecon);
        btn=(Button)findViewById(R.id.bookcon);
        mAuth= FirebaseAuth.getInstance();

        display=FirebaseDatabase.getInstance();
        DatabaseReference databaseReference=display.getReference().child("rides");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ridesbase data =dataSnapshot.getValue(ridesbase.class);
                pickcon.setText(" "+data.getPickupLocation());
                dropcon.setText(" "+data.getDropLocation());
                ridediscon.setText(" "+data.getRide_Distance()+"Km");
                ridefarecon.setText(" Rs."+data.getRide_Fare());
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    public void bookconfirm(View view){
        String pichis =pickcon.getText().toString().trim();
        String drophis=dropcon.getText().toString().trim();
        String ridedistancehis=ridediscon.getText().toString().trim();
        String ridefarehis=ridefarecon.getText().toString().trim();
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference ride;
        ride = firebaseDatabase.getReference().child(mAuth.getUid()).child("rides");
        String riderid=ride.push().getKey();
         myridebase register=new myridebase(riderid,pichis,drophis,ridedistancehis,ridefarehis);
        ride.child(riderid).setValue(register);

        Toast.makeText(this, "BOOKING SUCCESSFUL", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,Cancel.class));
    }
    public void oncancel(View view){
        startActivity(new Intent(this,TRAVELO.class));
    }
}
