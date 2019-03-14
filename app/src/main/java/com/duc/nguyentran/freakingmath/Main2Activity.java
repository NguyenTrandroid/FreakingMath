package com.duc.nguyentran.freakingmath;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    TextView txt1, txtSc;
    ImageButton ibtnTrue, ibtnFalse;
    int a, b, c, d, e, a1, b1, calcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = (TextView) findViewById(R.id.txt1);
        txtSc = (TextView) findViewById(R.id.txtSc);
        ibtnTrue = (ImageButton) findViewById(R.id.btnTrue);
        ibtnFalse = (ImageButton) findViewById(R.id.btnFalse);
        final Random random = new Random();
        randomMath();

        ibtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calcula) {
                    case 0:
                        if (a + b == c) {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();
                        } else {
                            diaglogEnd();
                        }
                        break;
                    case 1:
                        if (a - b == d) {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();

                        } else {
                            diaglogEnd();
                        }
                        break;
                    case 2:
                        if (a1 * b1 == e) {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();
                        } else {
                            diaglogEnd();
                        }
                        break;
                }
            }
        });
        ibtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (calcula) {
                    case 0:
                        if (a + b == c) {
                            diaglogEnd();

                        } else {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();

                        }
                        break;
                    case 1:
                        if (a - b == d) {
                            diaglogEnd();

                        } else {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();
                        }
                        break;
                    case 2:
                        if (a1 * b1 == e) {
                            diaglogEnd();
                        } else {
                            int x = Integer.parseInt(txtSc.getText().toString()) + 1;
                            txtSc.setText(x + "");
                            randomMath();
                        }
                        break;
                }
            }
        });
    }

    private void randomMath() {
        Random random = new Random();
        a = random.nextInt(20 - 1 + 1) + 1;
        b = random.nextInt(20 - 1 + 1) + 1;
        a1 = random.nextInt(10 - 1 + 1) + 1;
        b1 = random.nextInt(10 - 1 + 1) + 1;
        c = random.nextInt((a + b) - ((a + b) - 2) + 1) + ((a + b) - 2);
        String s = "";
        d = 0;
        if (a <= b) {
            if (b - a > 1) {
                d = 0 - (random.nextInt((b - a) - ((b - a) - 2) + 1) + ((b - a) - 2));
            }
            if (b - a == 1) {
                d = 0 - (random.nextInt(3));
            }
            if (b - a == 0) {
                d = random.nextInt(2);
            }
        } else {
            if (a - b > 1) {
                d = random.nextInt((a - b) - ((a - b) - 2) + 1) + ((a - b) - 2);
            }
            if (a - b == 1) {
                d = random.nextInt(3);
            }
        }
        e = random.nextInt((a1 * b1) - ((a1 * b1) - 2) + 1) + ((a1 * b1) - 2);
        calcula = random.nextInt(3);
        switch (calcula) {
            case 0:
                s = a + "+" + b + "=" + c;
                break;
            case 1:
                s = a + "-" + b + "=" + d;
                break;
            case 2:
                s = a1 + "x" + b1 + "=" + e;
                break;
        }
        txt1.setText(s);
    }

    public void diaglogEnd() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_end);
        TextView txtScend = (TextView) dialog.findViewById(R.id.txtScend);
        ImageButton ibtnRs = (ImageButton) dialog.findViewById(R.id.ibtnRs);
        ImageButton ibtnHome = (ImageButton) dialog.findViewById(R.id.ibtnHome);
        ibtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        ibtnRs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSc.setText("0");
                dialog.dismiss();
            }
        });



        txtScend.setText(txtSc.getText());
        dialog.show();

    }
}
