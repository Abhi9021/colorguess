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

public class MainActivity4 extends AppCompatActivity {
    EditText edtthrobj;
    Button next3obj,check3obj;
    GifImageView img3obj;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edtthrobj=findViewById(R.id.edtthr);
        next3obj=findViewById(R.id.btnnext3);
        check3obj=findViewById(R.id.btncheck3);
        img3obj=findViewById(R.id.img3);
        check3obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtthrobj.getText().toString().trim().equals("Blue")||edtthrobj.getText().toString().trim().equals("blue"))
                {
                    dialog=new Dialog(MainActivity4.this);
                    dialog.setContentView(R.layout.demoi);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Intent q=new Intent(MainActivity4.this,MainActivity5.class);
                            startActivity(q);
                        }
                    });

                }
                else
                {
                    dialog=new Dialog(MainActivity4.this);
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
        next3obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent p=new Intent(MainActivity4.this,MainActivity5.class);
               startActivity(p);
            }
        });
    }
}