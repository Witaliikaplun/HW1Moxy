package com.example.hw1moxy.standart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hw1moxy.R;
import com.example.hw1moxy.standart.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {
    EditText et;
    Button btn;
    TextView tv;
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et_text_in);
        btn = findViewById(R.id.btn_concat_text);
        tv = findViewById(R.id.tv_text_out);

        mainPresenter = new MainPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.onButtonClick();
            }
        });
    }

    @Override
    public void setTextView(String text) {
        tv.setText(text);
    }

    @Override
    public String getTextET() {
        return et.getText().toString();
    }
}