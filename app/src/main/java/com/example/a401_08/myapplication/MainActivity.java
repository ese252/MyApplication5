package com.example.a401_08.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"salam",Toast.LENGTH_LONG).show();

        final Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView  tv=findViewById(R.id.txt_Msg);

                EditText et=findViewById(R.id.edt);
                String S=  et.getText().toString();
                tv.setText("samira:"+S);

            }
        });

    }


}
