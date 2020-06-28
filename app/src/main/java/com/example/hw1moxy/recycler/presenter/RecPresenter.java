package com.example.hw1moxy.recycler.presenter;

import com.example.hw1moxy.recycler.data.MyCount;

public class RecPresenter {
    private MyCount myCount;

    public RecPresenter() {
        myCount = new MyCount();
    }

    public void incCount(){
        myCount.setCount(myCount.getCount()+1);
    }

    public int getNumberCount(){
        return myCount.getCount();
    }
}
