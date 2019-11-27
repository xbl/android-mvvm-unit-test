package com.example.myapplication;

import com.example.myapplication.vm.ViewModel;

public class Balancer {

    public boolean isBalance(String str) {
        if (str.equals("")) {
            return true;
        }

        String replaced = str.replaceAll("\\(\\)", "");
        if (replaced.equals("")) {
            return true;
        }
        return false;
    }

    public void onClick(ViewModel vm) {
        System.out.println(vm.getInput());
        vm.setResult(isBalance(vm.getInput()));
    }
}
