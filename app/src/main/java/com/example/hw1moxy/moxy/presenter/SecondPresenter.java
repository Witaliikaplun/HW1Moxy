package com.example.hw1moxy.moxy.presenter;

import android.app.Application;

import com.example.hw1moxy.moxy.model.SecondModel;
import com.example.hw1moxy.moxy.view.ISecondView;
import com.example.hw1moxy.moxy.view.SecondActivity;
import com.example.hw1moxy.standart.model.Model;
import com.example.hw1moxy.standart.view.IMainView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class SecondPresenter extends MvpPresenter<ISecondView> {
    SecondActivity secondActivity;
    SecondModel secondModel;

    public SecondPresenter() {
        secondModel = new SecondModel();
    }

    private void addStr(String str){
        secondModel.setStr(secondModel.getStr() + str);
    }

    public void onButtonClick(String etStr){
        getViewState().setTextView("");
        addStr(etStr);
        getViewState().setTextView(secondModel.getStr());
    }
}
