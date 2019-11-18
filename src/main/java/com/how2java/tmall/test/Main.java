package com.how2java.tmall.test;

import com.how2java.tmall.util.Page;

import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String a[]){
       int a1[] = {3,2,1,1,1};
       String bb = PrintMinNumber(a1);
       System.out.println(bb);
   }
    public static String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) return "";
        int len = numbers.length;
        String[] str = new String[len];
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < len; i++){
            Integer s  = new Integer(numbers[i]);
            str[i] = s.toString();
        }

        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for(int i = 0; i < len; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }

}