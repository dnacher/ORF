package com.orfapp.cs246.orf.com.orfapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.orfapp.cs246.orf.R;
import com.orfapp.cs246.orf.com.orfapp.model.MainList;

/**
 * Created by Nacher on 20/6/2017.
 */

public class NewRead extends AppCompatActivity {

    Button btnCreateRead;
    Spinner cmbClass;
    Spinner cmbStudent;
    Button btnBack;
    Button btnMain;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // Bundle extras= getIntent().getExtras();
      //  String student= extras.getString("student");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_read);
     //   Toast.makeText(this, student, Toast.LENGTH_SHORT).show();
        btnCreateRead = (Button) findViewById(R.id.btnCreateRead);

        cmbStudent = (Spinner) findViewById(R.id.cmbStudent);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnMain = (Button) findViewById(R.id.btnMain);

    }


}
