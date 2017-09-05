package com.example.jurara.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    EditText ed;
    String m;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Intent intent=getIntent();
        btn=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editText);
        btn.setOnClickListener(this);
        txt=(TextView)findViewById(R.id.textView);

        String men;
        men=intent.getStringExtra("Mensaje");
        txt.setText(men);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        m=ed.getText().toString();
        i.putExtra("Mensaje",m);
        startActivity(i);
    }
}
