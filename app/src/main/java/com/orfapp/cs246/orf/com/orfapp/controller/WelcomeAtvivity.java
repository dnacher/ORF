package com.orfapp.cs246.orf.com.orfapp.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.orfapp.cs246.orf.R;
import com.orfapp.cs246.orf.com.orfapp.constants.ConstantLogs;
import com.orfapp.cs246.orf.com.orfapp.model.MainList;
import com.orfapp.cs246.orf.com.orfapp.model.User;

/**
 * Created by Nacher on 20/6/2017.
 */

public class WelcomeAtvivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser;
    EditText txtPass;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(ConstantLogs.INFO, "onCreate Method");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    try {
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPass = (EditText) findViewById(R.id.txtPass);
        txtInfo = (TextView) findViewById(R.id.txtInfo);
    }catch(Exception ex){
        Log.v(ConstantLogs.ERROR, ex.getMessage());
    }
    }

    public void login(View view){
        try{
            Log.v(ConstantLogs.INFO, "Login Function");
            String user=txtUser.getText().toString();
            String pass=txtPass.getText().toString();
            Log.v("Exception ", user);
            Log.v("Exception ", pass);

            if(findUser(user, pass)){
                Intent intent= new Intent(this,MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }
        catch(Exception ex){
            Log.v(ConstantLogs.ERROR, ex.getMessage());
        }
    }

    public boolean findUser(String user, String pass){
        boolean ret=false;
        for (User us: MainList.getInstance().getUsers()){
            if(us.getName().equals(user) && us.getPassword().equals(pass)){
                ret=true;
            }
        }
        return ret;
    }
}
