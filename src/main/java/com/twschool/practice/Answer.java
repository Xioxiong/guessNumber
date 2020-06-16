package com.twschool.practice;

import java.util.List;

public class Answer {
    public String compare(String inputs,String num) {
        String[] str1 = num.split("");
        String[] str2 = inputs.split("");
        int numAndPos = 0;
        int pos = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str1.length;i++){
            for(int j = 0;j<str2.length;j++){
                if(i==j){
                    if(str2[j].equals(str1[i])){
                        numAndPos +=1;
                    }
                }else {
                    if(str2[j].equals(str1[i])){
                        pos += 1;
                    }
                }
            }
        }
        result.append(numAndPos);
        result.append("A");
        result.append(pos);
        result.append("B");
        return result.toString();
    }
}
