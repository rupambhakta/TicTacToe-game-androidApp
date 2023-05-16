package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int flag=0,count=0;
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,newGame;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn1.setText("");
                        btn2.setText("");
                        btn3.setText("");
                        btn4.setText("");
                        btn5.setText("");
                        btn6.setText("");
                        btn7.setText("");
                        btn8.setText("");
                        btn9.setText("");
                        count=0;
                        flag=0;
                    }
                },0);
            }
        });
    }
    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        newGame=findViewById(R.id.btnNewGame);
    }
    public void check(View view){
        Button butCurrent=(Button) view;
        if (butCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                butCurrent.setText("x");
                flag = 1;
            } else {
                butCurrent.setText("o");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                // Condition
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winer is " + b1, Toast.LENGTH_SHORT).show();
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                    btn5.setText("");
                    btn6.setText("");
                    btn7.setText("");
                    btn8.setText("");
                    btn9.setText("");
                    count=0;
                    flag=0;
                    // c1
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
//                    Toast.makeText(this, "Winer is "+b4, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b4);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c2
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
//                    Toast.makeText(this, "Winer is " + b7, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b7);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c3
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
//                    Toast.makeText(this, "Winer is " + b1, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b1);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c4
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
//                    Toast.makeText(this, "Winer is " + b2, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b2);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c5
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
//                    Toast.makeText(this, "Winer is " + b3, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b3);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c6
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
//                    Toast.makeText(this, "Winer is " + b1, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b1);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c7
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
//                    Toast.makeText(this, "Winer is " + b3, Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Winer is "+b3);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                    //c8
                } else if (count==9) {
//                    Toast.makeText(this, "Game is grawn", Toast.LENGTH_SHORT).show();
                    Toast toast=new Toast(getApplicationContext());
                    View view1=getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view_container));
                    toast.setView(view1);
                    @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg=view1.findViewById(R.id.txtMsg);
                    txtMsg.setText("Game is Draw!");
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.show();
                    newGame();
                }
            }
        }
    }



    public void newGame(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=0;
                flag=0;
            }
        },1000);
    }
}