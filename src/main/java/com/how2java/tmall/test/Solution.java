package com.how2java.tmall.test;

import com.sun.scenario.effect.InvertMask;

public class Solution {
    public static void main(String args[]){
        int []b = {4,5 ,1 ,2,2,3,1,2,4,5,6,7,8};
        int []copy = new int[b.length];
         new Solution().InversePairs(b,copy,0,b.length-1);
       for(int s:copy){
           System.out.print(s+",");
       }

    }


    public void InversePairs(int a[],int copy[],int low,int high){
        if(low==high){
            return ;
        }
        int mid = (low+high)>>1;
        InversePairs(a,copy,low,mid);
        InversePairs(a,copy,mid+1,high);

        int i = mid;
        int j = high;
        int locopy = high;

        while(i>=low&&j>mid){
            if(a[i]>a[j]){
                copy[locopy--] = a[i--];
            }
            else{
                copy[locopy--] = a[j--];
            }
        }
        for(;i>=low;i--){
            copy[locopy--] = a[i];
        }
        for(;j>mid;j--){
            copy[locopy--] = a[j];
        }

        for(int s = low;s<=high;s++){
            a[s] = copy[s];
        }
        return ;

    }

}