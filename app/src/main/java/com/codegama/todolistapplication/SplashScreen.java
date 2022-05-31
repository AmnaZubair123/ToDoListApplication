package com.codegama.todolistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread td= new Thread(){
            public void run()
            {
                try {
                    sleep(5000);

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

                finally {
                    Intent it= new Intent(SplashScreen.this, com.codegama.todolistapplication.activity.MainActivity.class);
                    startActivity(it);
                }
            }
        }; td.start();
    }
}