package com.how2java.tmall.test;

import com.sun.scenario.effect.InvertMask;
class Dad{
    Dad()
    {
        System.out.println("父类构造方法");
        System.out.println("price=" + price +",amount=" );
    }


    {
        System.out.println("父类普通代码块");
    }

    int price = 110;

    static
    {
        System.out.println("父类静态代码块");
    }

}

public class Solution extends Dad{
    static final String str = "you";


    public static void main(String[] args)
    {
        new Solution();
        System.out.println("Hello ShuYi.");
    }

    Solution()
    {
        System.out.println(super.price);
    }


    {
        System.out.println("书的普通代码块");
    }



    static
    {
        System.out.println("书的静态代码块");
    }

    static int amount = 112;



    public void sort(int a[],int b[],int low,int high){

        if(low == high) return ;

        int media = (low+high)/2;
        sort(a,b,low,media);
        sort(a,b,media+1,high);

        int i = media;
        int j = high;
        int loc = high;

        while(i>=low&&j>media){ //注意条件

            if(a[i]>a[j]){
                b[loc--] = a[i--];
            }
            else{
                b[loc--] = a[j--];
            }
        }

        for(;low<=i;i--){
            b[loc--] = a[i];
        }
        for(;j>media;j--){
            b[loc--] = a[j];
        }
        for(int s = low;s<=high;s++){
            a[s] = b[s];
        }
    }



}