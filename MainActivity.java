package com.example.complete_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edttxt;
    TextView tv,hide;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btntotal,btndot,btnzero,btnpercentage,btnclear,btnoneback;

    double op,total,num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edttxt = (EditText) findViewById(R.id.edttxt);
        tv = (TextView) findViewById(R.id.tv);
        hide = (TextView) findViewById(R.id.hide);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndot = (Button) findViewById(R.id.btndot);
        btnzero = (Button) findViewById(R.id.btnzero);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnpercentage = (Button) findViewById(R.id.btnpercentage);
        btntotal = (Button) findViewById(R.id.btntotal);
        btnclear = (Button) findViewById(R.id.btnclear);
        btnoneback = (Button) findViewById(R.id.btnoneback);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+".");
                btndot.setEnabled(false);
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"0");
            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edttxt.getText().toString().isEmpty()) {
                    edttxt.setText(null);

                }
                else {


                    num1 = Float.parseFloat(edttxt.getText()+"");
//                    num1 = Integer.parseInt(edttxt.getText()+"");

                    hide.setText(edttxt.getText()+"");
                    tv.setText(edttxt.getText()+"+");
                    edttxt.setText(null);
                    btndot.setEnabled(true);
                    op = 1;
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edttxt.getText().toString().isEmpty()) {
                    edttxt.setText(null);

                }
                else {
                    num1 = Float.parseFloat(edttxt.getText()+"");
//                    num1 = Integer.parseInt(edttxt.getText()+"");

                    hide.setText(edttxt.getText()+"");
                    tv.setText(edttxt.getText()+"-");
                    btndot.setEnabled(true);
                    edttxt.setText(null);
                    op = 2;
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edttxt.getText().toString().isEmpty()) {
                    edttxt.setText(null);

                }
                else {
                    num1 = Float.parseFloat(edttxt.getText()+"");
//                    num1 = Integer.parseInt(edttxt.getText()+"");

                    hide.setText(edttxt.getText()+"");
                    tv.setText(edttxt.getText()+"*");
                    edttxt.setText(null);
                    btndot.setEnabled(true);
                    op = 3;
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edttxt.getText().toString().isEmpty()) {
                    edttxt.setText(null);

                }
                else {
                    num1 = Float.parseFloat(edttxt.getText()+"");
//                    num1 = Integer.parseInt(edttxt.getText()+"");
                    tv.setText(edttxt.getText()+"/");
                    edttxt.setText(null);
                    btndot.setEnabled(true);
                    op = 4;
                }
            }
        });
        btnpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edttxt.getText().toString().isEmpty()) {
                    edttxt.setText(null);

                }
                else {
                    num1 = Float.parseFloat(edttxt.getText()+"");
//                    num1 = Integer.parseInt(edttxt.getText()+"");
                    tv.setText(edttxt.getText()+"%");
                    edttxt.setText(null);
                    btndot.setEnabled(true);
                    op = 5;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edttxt.setText(null);
                tv.setText(null);
                num1=0;
                num2=0;
                op=0;
                total=0;
                btndot.setEnabled(true);
            }
        });
        btnoneback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length = edttxt.getText().length();
                if (length > 0) {
                    edttxt.getText().delete(length - 1, length);
                    
                }                        }
        });
        btntotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edttxt.getText().toString().isEmpty() || String.valueOf(num1) == null) {
                    edttxt.setText(null);
                    tv.setText(null);
                }
                else {

                    num2 = Float.parseFloat(edttxt.getText().toString());
//                    num2 = Integer.parseInt(edttxt.getText().toString());
                    tv.setText(tv.getText().toString()+edttxt.getText()+"=");
                    if (op == 1) {
                        total = (num1 + num2);
                        if (hide.getText().toString().indexOf(".") != -1 || edttxt.getText().toString().indexOf(".") != -1 ) {

                            edttxt.setText(String.valueOf((float) total));
                        }
                        else {
                            edttxt.setText(String.valueOf((int)total));
                        }

                    }
                    if (op == 2) {
                        total = (num1 - num2);
                        if (hide.getText().toString().indexOf(".") != -1 || edttxt.getText().toString().indexOf(".") != -1 ) {

                            edttxt.setText(String.valueOf((float) total));
                        }
                        else {
                            edttxt.setText(String.valueOf((int)total));
                        }                    }
                    if (op == 3) {
                        total = (num1 * num2);
                        if (hide.getText().toString().indexOf(".") != -1 || edttxt.getText().toString().indexOf(".") != -1 ) {

                            edttxt.setText(String.valueOf((float) total));
                        }
                        else {
                            edttxt.setText(String.valueOf((int)total));
                        }                    }
                    if (op == 4) {
                        total = num1/num2;
                        edttxt.setText(String.valueOf(total));
                    }
                    if (op == 5) {
                        total = num1 * num2 / 100;
                        edttxt.setText(String.valueOf(total));
                    }
                    btndot.setEnabled(true);

                }
            }

        });

    }
}