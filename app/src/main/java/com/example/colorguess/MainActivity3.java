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

import pl.droidsonroids.gif.GifImageView;

public class MainActivity3 extends AppCompatActivity {
EditText edtsecobj;
Button next1obj,check1obj;
GifImageView img2obj;
Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edtsecobj=findViewById(R.id.edtsec);
        check1obj=findViewById(R.id.btncheck2);
        next1obj=findViewById(R.id.btnnext2);
        img2obj=findViewById(R.id.img2);
        check1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtsecobj.getText().toString().trim().equals("Green")||edtsecobj.getText().toString().trim().equals("green"))
                {
                    dialog=new Dialog(MainActivity3.this);
                    dialog.setContentView(R.layout.demoi);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Intent q=new Intent(MainActivity3.this,MainActivity4.class);
                            startActivity(q);
                        }
                    });

                }
                else
                {
                    dialog=new Dialog(MainActivity3.this);
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
        next1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent o=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(o);
            }
        });
    }
}