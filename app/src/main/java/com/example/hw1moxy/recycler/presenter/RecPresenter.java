package com.example.hw1moxy.recycler.presenter;

import com.example.hw1moxy.recycler.data.MyCount;

public class RecPresenter implements IRecPresenter {
    private MyCount myCount;

    public RecPresenter() {
        myCount = new MyCount();
    }


    @Override
    public void incCount() {
        myCount.setCount(myCount.getCount()+1);
    }

    @Override
    public int getNumberCount() {
        return myCount.getCount();
    }
}
