package com.example.syedinkisarahmed.explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int x,y,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText edt = (EditText) findViewById(R.id.ed1);
        try {
            x = Integer.parseInt(edt.getText().toString());
            edt= (EditText) findViewById(R.id.ed2);
            y=Integer.parseInt(edt.getText().toString());
            r=x+y;
            Intent intt = new Intent(MainActivity.this,Result.class);
            intt.putExtra("bak",String.valueOf(r));
            startActivity( intt);

        }
        catch (Exception ex){
            Toast.makeText(MainActivity.this, "Only type number", Toast.LENGTH_SHORT).show();
            edt.setText("");
        }
    }



    public void sub(View v){
        EditText edt = (EditText) findViewById(R.id.ed1);
        try {
            x = Integer.parseInt(edt.getText().toString());
            edt= (EditText) findViewById(R.id.ed2);
            y=Integer.parseInt(edt.getText().toString());
            r=x-y;
            Intent intt = new Intent(MainActivity.this,Result.class);
            intt.putExtra("bak", String.valueOf(r));
            startActivity( intt);

        }
        catch (Exception ex){
            Toast.makeText(MainActivity.this, "Only type number", Toast.LENGTH_SHORT).show();
            edt.setText("");
        }
    }
}
