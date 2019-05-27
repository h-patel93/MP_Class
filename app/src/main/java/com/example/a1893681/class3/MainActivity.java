package com.example.a1893681.class3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      EditText edt_name,edt_pass,edt_email;
      Button btn_sub;
      static String TAG = "My Info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_pass = findViewById(R.id.edt_password);

        btn_sub=findViewById(R.id.btn_submit);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String name = edt_name.getText().toString();
                String email = edt_email.getText().toString();
                Log.v(TAG,name);
                Log.v(TAG,email);
                Log.v(TAG,edt_pass.getText().toString());*/
            Toast.makeText(getApplicationContext(),edt_name.getText().toString(),Toast.LENGTH_SHORT).show();


            }
        });
    }
}
