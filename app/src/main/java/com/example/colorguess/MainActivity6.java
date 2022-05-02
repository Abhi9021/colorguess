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

public class MainActivity6 extends AppCompatActivity {
    EditText edtfrobj;
    Button next4obj,check4obj;
    GifImageView img4obj;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        edtfrobj=findViewById(R.id.edtfive);
        next4obj=findViewById(R.id.btnnext5);
        check4obj=findViewById(R.id.btncheck5);
        img4obj=findViewById(R.id.img5);


        check4obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtfrobj.getText().toString().trim().equals("Maroon")||edtfrobj.getText().toString().trim().equals("maroon"))
                {

                    dialog=new Dialog(MainActivity6.this);
                    dialog.setContentView(R.layout.demoi);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Intent q=new Intent(MainActivity6.this,MainActivity7.class);
                            startActivity(q);
                        }
                    });




                }
                else
                {
                    dialog=new Dialog(MainActivity6.this);
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
        next4obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(p);
            }
        });
    }
}