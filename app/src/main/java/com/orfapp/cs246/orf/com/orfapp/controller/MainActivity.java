package com.orfapp.cs246.orf.com.orfapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.orfapp.cs246.orf.R;


public class MainActivity extends AppCompatActivity {

    Button btnCreateRead;
    Spinner cmbClass;
    Spinner cmbStudent;
    Button btnBack;
    Button btnMain;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btnCreateRead = (Button) findViewById(R.id.btnCreateRead);
        cmbClass = (Spinner) findViewById(R.id.cmbClass);
        cmbStudent = (Spinner) findViewById(R.id.cmbStudent);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnMain = (Button) findViewById(R.id.btnMain);
    }

    public void newRead(View view){
        Intent intent= new Intent(this,NewRead.class);
        startActivity(intent);
    }
}
