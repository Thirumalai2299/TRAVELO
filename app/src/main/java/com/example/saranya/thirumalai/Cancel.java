package com.example.saranya.thirumalai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Cancel extends AppCompatActivity {

    Button btn2;
    RatingBar ratingBar;

    String rideid;
    Button btn;
    Button btn1;
    private FirebaseAuth mAuth;
    private FirebaseDatabase delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);
        mAuth=FirebaseAuth.getInstance();
        btn=(Button)findViewById(R.id.continuebtn);
        btn2=(Button)findViewById(R.id.cancelbtn);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
    }
    public void oncontinue(View view){
        startActivity(new Intent(this,TRAVELO.class));
    }

    public void oncancel(View view){
        float ratingvalue = ratingBar.getRating();
        Toast.makeText(this, "Rating is" + ratingvalue, Toast.LENGTH_SHORT).show();
    }
}
