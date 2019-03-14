package com.duc.nguyentran.freakingmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
//                Bundle bundle = new Bundle();
//                int a= random.nextInt(20-1+1)+1;
//                int b= random.nextInt(20-1+1)+1;
//                int a1= random.nextInt(10-1+1)+1;
//                int b1= random.nextInt(10-1+1)+1;
//                int calcula = random.nextInt(3);
//
//                int c = random.nextInt((a+b)-((a+b)-2)+1)+((a+b)-2);
//                String s ="";
//                int d=0;
//                if(a<=b){
//                    if(b-a>1){
//                        d = 0 - (random.nextInt((b-a)-((b-a)-2)+1)+((b-a)-2));
//                    }
//                    if(b-a==1){
//                        d = 0 - (random.nextInt(3));
//                    }
//                    if(b-a==0){
//                        d= random.nextInt(2);
//                    }
//                }
//                else {
//                    if(a-b>1){
//                        d = random.nextInt((a-b)-((a-b)-2)+1)+((a-b)-2);
//                    }
//                    if(a-b==1){
//                        d = random.nextInt(3);
//                    }
//                }
//                int e = random.nextInt((a1*b1)-((a1*b1)-2)+1)+((a1*b1)-2);
//                switch (calcula) {
//                    case 0:
//                        s = a + "+" + b + "=" + c;
//                        break;
//                    case 1:
//                        s = a + "-" + b + "=" + d;
//                        break;
//                    case 2:
//                        s = a1 + "x" + b1 + "=" + e;
//                        break;
//                }
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
//                bundle.putString("AAA",s);
//                bundle.putInt("a",a);
//                bundle.putInt("a1",a1);
//                bundle.putInt("b1",b1);
//                bundle.putInt("b",b);
//                bundle.putInt("c",c);
//                bundle.putInt("d",d);
//                bundle.putInt("e",e);
//                bundle.putInt("cc",calcula);
//
//                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
