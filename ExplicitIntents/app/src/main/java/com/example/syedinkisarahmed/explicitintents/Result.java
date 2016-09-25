package com.example.syedinkisarahmed.explicitintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bndle = getIntent().getExtras();
        if(bndle!=null){
            TextView txt = (TextView) findViewById(R.id.txtv3);

            result = bndle.getString("bak");
            txt.setText(result);
        }
    }
}
