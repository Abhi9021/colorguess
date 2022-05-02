package com.example.colorguess;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity2 extends AppCompatActivity {
EditText edt1obj;
Button checkobj,btnnextobj;
GifImageView img1obj;
Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1obj=findViewById(R.id.edtfst);
        img1obj=findViewById(R.id.img1);
        checkobj=findViewById(R.id.btncheck);
        btnnextobj=findViewById(R.id.btnnext);
        checkobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1obj.getText().toString().trim().equals("Red")||edt1obj.getText().toString().trim().equals("red"))
                {
                    dialog=new Dialog(MainActivity2.this);
                    dialog.setContentView(R.layout.demoi);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Intent q=new Intent(MainActivity2.this,MainActivity3.class);
                            startActivity(q);
                        }
                    });

                }
                else
                {
                    dialog=new Dialog(MainActivity2.this);
                    dialog.setContentView(R.layout.wrong1);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok1);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });
        btnnextobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(n);
            }
        });

    }
}