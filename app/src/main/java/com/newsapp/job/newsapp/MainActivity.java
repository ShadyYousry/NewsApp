package com.newsapp.job.newsapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bJoin ;
    EditText editText_email ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void join(View view) {
        SharedPreferences shard_email = getSharedPreferences("User", Context.MODE_PRIVATE);
        String get_email = shard_email.getString("email","blank");
        editText_email = (EditText) findViewById(R.id.editText_email);
        String email = editText_email.getText().toString();

        if (get_email.equals("blank")) {
            SharedPreferences.Editor editor = shard_email.edit();
            editor.putString("email", email);
            editor.putBoolean("First", true);
            editor.apply();
        }

        else if (get_email.equals(email)){
        }

        else {
            Toast.makeText(this.getApplicationContext(),"Wrong Email",Toast.LENGTH_SHORT).show();
            return;
        }

        Intent in = new Intent(this,Categoty.class);
        startActivity(in);

    }
}
