package com.example.vishal.lots;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    private EditText emailText;
    private EditText passwordText;
    private Button loginButton;
    private FirebaseAuth mAuth;
    private DatabaseReference lotsDatabase;
    private DatabaseReference dbReferenceUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailText = (EditText)findViewById(R.id.emaillogin);
        passwordText = (EditText)findViewById(R.id.passwordlogin);
        loginButton = (Button) findViewById(R.id.loginButton);
        mAuth = FirebaseAuth.getInstance();

        lotsDatabase = FirebaseDatabase.getInstance().getReference();
        dbReferenceUser = lotsDatabase.child("User");

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mAuth.signInWithEmailAndPassword(emailText.getText().toString(),
                        passwordText.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();

                            Intent i = new Intent(getApplicationContext(), UserInputActivity.class);
                            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            i.putExtra("userEmailId", emailText.getText().toString());
                            startActivity(i);
                            finish();

                        } else{
                            Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        TextView loginScreen = (TextView) findViewById(R.id.link_to_register);
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(),  Register.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }
}
