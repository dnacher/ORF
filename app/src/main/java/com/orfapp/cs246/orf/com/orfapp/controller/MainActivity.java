package com.orfapp.cs246.orf.com.orfapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.orfapp.cs246.orf.R;
import com.orfapp.cs246.orf.com.orfapp.model.DataBaseHelper;
import com.orfapp.cs246.orf.com.orfapp.model.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nacher on 20/6/2017.
 */

public class MainActivity extends OrmLiteBaseActivity<DataBaseHelper>{

    Button btnCreateRead;
    Spinner cmbClass;
    Spinner cmbStudent;
    Button btnBack;
    Button btnMain;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_student);

        btnCreateRead = (Button) findViewById(R.id.btnCreateRead);
        cmbStudent = (Spinner) findViewById(R.id.cmbStudent);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnMain = (Button) findViewById(R.id.btnMain);
        List<Student>students;
        DataBaseHelper dataBaseHelper = getHelper();


    }

    public void newRead(View view){
        Intent intent= new Intent(this,NewRead.class);
        startActivity(intent);
    }

    private OrmLiteBaseActivity<DataBaseHelper> getOrmLiteBaseActivity(){
        Activity activity = getParent();
        if( activity instanceof OrmLiteBaseActivity) return (OrmLiteBaseActivity<DataBaseHelper>) activity;
        return null;
    }

    @Override
    public void onResume(){
        super.onResume();
    }
}
