package com.example.hw1moxy.moxy.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw1moxy.R;
import com.example.hw1moxy.moxy.presenter.SecondPresenter;
import com.example.hw1moxy.standart.presenter.MainPresenter;
import com.example.hw1moxy.standart.view.IMainView;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class SecondActivity extends MvpAppCompatActivity implements ISecondView {
    EditText et;
    Button btn;
    TextView tv;

    @InjectPresenter
    SecondPresenter secondPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);

        et = findViewById(R.id.et_text_in);
        btn = findViewById(R.id.btn_concat_text);
        tv = findViewById(R.id.tv_text_out);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondPresenter.onButtonClick(et.getText().toString());
            }
        });
    }

    @Override
    public void setTextView(String text) {
        tv.setText(text);
    }



}