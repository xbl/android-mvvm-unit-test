package com.example.myapplication;

import com.example.myapplication.vm.ViewModel;

import java.util.Arrays;
import java.util.List;

public class Balancer {

    private List<String> symbolList = Arrays.asList("(", ")", "[", "]", "{", "}");

    public boolean isBalance(String str) {
        if (str == null || str.equals("")) {
            return true;
        }

        String newStr = filter(str);
        String replaced = newStr.replaceAll("\\(\\)", "");
        replaced = replaced.replaceAll("\\[\\]", "");
        replaced = replaced.replaceAll("\\{\\}", "");
        if (replaced.equals("")) {
            return true;
        }

        if (replaced.equals(str)) {
            return false;
        }
        return isBalance(replaced);
    }

    private String filter(String str) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if (symbolList.contains(currentChar.toString())) {
                newStringBuilder.append(currentChar);
            }
        }
        return newStringBuilder.toString();
    }

    public void onClick(ViewModel vm) {
        System.out.println(vm.getInput());
        vm.setResult(isBalance(vm.getInput()));
    }
}
