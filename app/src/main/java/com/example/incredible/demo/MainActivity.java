package com.example.incredible.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView firstFirst,firstSecond,secondFirst,secondSecond,thirdFirst,thirdsecond,forthfirst,forthsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFirst=(CardView) findViewById(R.id.ff);
        firstSecond=(CardView) findViewById(R.id.fs);
        secondFirst=(CardView) findViewById(R.id.sf);
        secondSecond=(CardView) findViewById(R.id.ss);
        thirdFirst=(CardView) findViewById(R.id.tf);
        thirdsecond=(CardView) findViewById(R.id.ts);
        forthfirst=(CardView) findViewById(R.id.frthf);
        forthsecond=(CardView) findViewById(R.id.frths);


        firstFirst.setOnClickListener(this);
        firstSecond.setOnClickListener(this);
        secondFirst.setOnClickListener(this);
        secondSecond.setOnClickListener(this);
        thirdFirst.setOnClickListener(this);
        thirdsecond.setOnClickListener(this);
        forthfirst.setOnClickListener(this);
        forthsecond.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent i ;
        switch(v.getId()){

        case R.id.ff:i=new Intent(this,FF.class); startActivity(i); break;
            case R.id.fs:i= new Intent(this,FS.class);startActivity(i);break;
            case R.id.sf:i=new Intent(this,SF.class); startActivity(i);break;
            case R.id.ss:i=new Intent(this,SS.class);startActivity(i); break;
            case R.id.tf:i=new Intent(this,TF.class);startActivity(i); break;
            case R.id.ts:i=new Intent(this,TS.class);startActivity(i);break;
            case R.id.frthf:i=new Intent(this,Frthf.class);startActivity(i);break;
            case R.id.frths:i=new Intent(this,Frths.class);startActivity(i);break;

            default:break;

    }
 }
}
