package com.example.hw1moxy.moxy.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface ISecondView extends MvpView {
    @StateStrategyType(value = AddToEndStrategy.class)
    void setTextView(String text);



}
