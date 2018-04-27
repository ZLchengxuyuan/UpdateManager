package com.example.frank.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button text;
    private UpdateManager mUpdateManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (Button) findViewById(R.id.btn);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mUpdateManager = new UpdateManager(MainActivity.this);
                mUpdateManager.showNoticeDialog();
            }
        });
    }
}
