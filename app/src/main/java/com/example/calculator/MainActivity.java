package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float f1,f2,f;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =findViewById(R.id.b1);
        Button b2 =findViewById(R.id.b2);
        Button b3 =findViewById(R.id.b3);
        Button b4 =findViewById(R.id.b4);
        Button b5 =findViewById(R.id.b5);
        Button b6 =findViewById(R.id.b6);
        Button b7 =findViewById(R.id.b7);
        Button b8 =findViewById(R.id.b8);
        Button b9 =findViewById(R.id.b9);
        Button b0 =findViewById(R.id.b0);
        Button badd =findViewById(R.id.badd);
        Button bsub =findViewById(R.id.bsub);
        Button bmulti =findViewById(R.id.bmulti);
        Button bdiv =findViewById(R.id.bdiv);
        Button bequal =findViewById(R.id.bequals);
        Button bdot =findViewById(R.id.bdot);
        Button bc =findViewById(R.id.bc);
        Button bac =findViewById(R.id.bac);

        EditText enter = findViewById(R.id.enter);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"1");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"0");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+"");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(enter.getText().toString());
                enter.setText("+");
                add = true;
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(enter.getText().toString());
                enter.setText("-");
                sub = true;
            }
        });

        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(enter.getText().toString());
                enter.setText("*");
                mul = true;
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1 = Float.parseFloat(enter.getText().toString());
                enter.setText("/");
                div = true;
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add == true) {
                    f2 = Float.parseFloat(enter.getText().toString());
                    f=f1+f2;
                    String myresult = String.valueOf(f);
                    enter.setText(myresult);
                    add = false;
                } else if (sub == true) {
                    f2 = Float.parseFloat(enter.getText().toString());
                    f=f1-f2;
                    String myresult = String.valueOf(f);
                    enter.setText(myresult);
                    sub = false;
                } else if (mul == true) {
                    f2 = Float.parseFloat(enter.getText().toString());
                    f=f1*f2;
                    String myresult = String.valueOf(f);
                    enter.setText(myresult);
                    mul = false;
                } else if (div == true) {
                    f2 = Float.parseFloat(enter.getText().toString());
                    f=f1/f2;
                    String myresult = String.valueOf(f);
                    enter.setText(myresult);
                    div = false;
                }
            }
        });
    }
}