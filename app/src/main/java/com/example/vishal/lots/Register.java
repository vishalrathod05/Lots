package com.example.vishal.lots;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.User;

public class Register extends AppCompatActivity {

    private EditText userNameText;
    private EditText emailText;
    private EditText passwordText;
    private EditText permitZoneText;
    private EditText userTypeText;
    private Button registerButton;
    private FirebaseAuth mAuth;

    private DatabaseReference lotsDatabase;
    private DatabaseReference dbReferenceUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userNameText = (EditText) findViewById(R.id.usernameText);
        emailText = (EditText)findViewById(R.id.emailText);
        passwordText = (EditText)findViewById(R.id.passwordText);
        permitZoneText = (EditText) findViewById(R.id.permitZoneText);
        userTypeText = (EditText) findViewById(R.id.userType);
        registerButton = (Button) findViewById(R.id.registerButton);

        /*
        Spinner userTypeSpinner = (Spinner)findViewById(R.id.userTypeSpinner);
        String[] userTypes = new String[]{"Student", "Faculty", "Visitor"};
        ArrayAdapter<String> userTypeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, userTypes);
        userTypeSpinner.setAdapter(userTypeAdapter);

        userTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userTypeSpinner.setAdapter(userTypeAdapter);

        userTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Whatever you want to happen when the first item gets selected
                        break;
                    case 1:
                        // Whatever you want to happen when the second item gets selected
                        break;
                    case 2:
                        // Whatever you want to happen when the thrid item gets selected
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner permitTypeSpinner = (Spinner)findViewById(R.id.userTypeSpinner);
        String[] permitTypes = new String[]{"Student", "Faculty", "Visitor"};
        ArrayAdapter<String> permitTypeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, permitTypes);
        userTypeSpinner.setAdapter(permitTypeAdapter);

        permitTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userTypeSpinner.setAdapter(permitTypeAdapter);

        userTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Whatever you want to happen when the first item gets selected
                        break;
                    case 1:
                        // Whatever you want to happen when the second item gets selected
                        break;
                    case 2:
                        // Whatever you want to happen when the thrid item gets selected
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        */
        mAuth = FirebaseAuth.getInstance();

        lotsDatabase = FirebaseDatabase.getInstance().getReference();
        dbReferenceUser = lotsDatabase.child("User");

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailId = emailText.getText().toString().toLowerCase();
                if(emailId!=null){

                    if(!emailId.contains("@umbc.edu")){
                        Toast.makeText(Register.this, "Provide valid university email address!", Toast.LENGTH_LONG).show();
                    } else{
                        mAuth.createUserWithEmailAndPassword(emailId,
                                passwordText.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_LONG).show();

                                    User user = new User(userNameText.getText().toString(), emailText.getText().toString(),
                                            passwordText.getText().toString(), permitZoneText.getText().toString(), userTypeText.getText().toString());

                                    String encodedEmail = encodeString(emailText.getText().toString());
                                    dbReferenceUser.child(encodedEmail).setValue(user);

                                    Intent i = new Intent(getApplicationContext(), UserInputActivity.class);
                                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    i.putExtra("userEmailId", emailText.getText().toString());
                                    i.putExtra("permitType", permitZoneText.getText().toString());
                                    startActivity(i);
                                    finish();
                                } else{
                                    Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }
                }
            }
        });

        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(),  LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });

    }

    public static String encodeString(String email) {
        return email.replace(".", ",");
    }

}
