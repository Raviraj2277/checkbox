package com.example.checkboxdemo;

import android.content.Context;
import android.widget.Toast;

public class Message {
    public static  void message (Context content, String msg){
        Toast.makeText(content, msg , Toast.LENGTH_SHORT).show();
    }
}
