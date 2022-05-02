package com.example.colorguess;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity5 extends AppCompatActivity {
    EditText edtfrobj;
    Button next4obj,check4obj;
    GifImageView img4obj;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        edtfrobj=findViewById(R.id.edtfr);
        next4obj=findViewById(R.id.btnnext4);
        check4obj=findViewById(R.id.btncheck4);
        img4obj=findViewById(R.id.img4);


       check4obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtfrobj.getText().toString().trim().equals("Orange")||edtfrobj.getText().toString().trim().equals("orange"))
                {

                    dialog=new Dialog(MainActivity5.this);
                    dialog.setContentView(R.layout.demoi);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button btn=dialog.findViewById(R.id.btnok);
                    dialog.show();
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            Intent q=new Intent(MainActivity5.this,MainActivity6.class);
                            startActivity(q);
                        }
                    });




                }
                else
                {
                    dialog=new Dialog(MainActivity5.this);
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
                 Intent p=new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(p);
            }
        });
    }
}