package com.example.hw1moxy.standart.presenter;

import com.example.hw1moxy.standart.model.Model;
import com.example.hw1moxy.standart.view.IMainView;

public class MainPresenter {
    IMainView iMainView;
    Model model;

    public MainPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
        model = new Model();
    }

    private void addStr(){
        model.setStr(model.getStr() + iMainView.getTextET());
    }

    public void onButtonClick(){
        iMainView.setTextView("");
        addStr();
        iMainView.setTextView(model.getStr());
    }
}
