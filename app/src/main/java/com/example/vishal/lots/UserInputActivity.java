package com.example.vishal.lots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserInputActivity extends AppCompatActivity {

    private Button parkingButton;
    private Button leavingButton;
    private String userEmailId;
    private String permitType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        parkingButton = (Button) findViewById(R.id.parkingInputButton);
        leavingButton = (Button) findViewById(R.id.leavingInputButton);

        Intent i = getIntent();
        if(i!=null){
            userEmailId = i.getStringExtra("userEmailId");
            permitType = i.getStringExtra("permitType");
        }

        parkingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.putExtra("userEmailId", userEmailId);
                i.putExtra("permitType", permitType);
                startActivity(i);
                finish();
            }
        });

        leavingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(UserInputActivity.this, "Parking is cleared!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }
}
