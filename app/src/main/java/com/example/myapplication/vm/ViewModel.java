package com.example.myapplication.vm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class ViewModel extends BaseObservable {

    private Boolean result;
    private String input;

    public void setResult(Boolean result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    @Bindable
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Bindable
    public Boolean getResult() {
        return result;
    }


    public ViewModel() {
    }
}
