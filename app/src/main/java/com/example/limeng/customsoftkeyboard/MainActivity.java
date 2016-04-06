package com.example.limeng.customsoftkeyboard;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;

    private Context ctx;
    private Activity act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et_01);
        this.ctx = this;
        this.act = this;

        et1.setInputType(InputType.TYPE_NULL);

        et1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                new KeyboardUtils(act, ctx, et1).showKeyboard();
                return false;
            }
        });
//        et2 = (EditText) findViewById(R.id.et_02);
//        et3 = (EditText) findViewById(R.id.et_03);
//        et4 = (EditText) findViewById(R.id.et_04);
//        et5 = (EditText) findViewById(R.id.et_05);
    }
}
