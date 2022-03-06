package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklasrasi variable untuk button
    Button btnlogin;

    //Deklasrasi variable untuk editText
    EditText edemail, edpassword;

    //Deklasrasi variable untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubukan variable btnlogin dengan componen button pada layout
        btnlogin = findViewById(R.id.btSingin);

        //Menghubukan variable edemail dengan componen editText pada layout
        edemail = findViewById(R.id.edEmail);

        //Menghubukan variable edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);
    }
}