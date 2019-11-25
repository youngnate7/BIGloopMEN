package com.company;

public class exercises{
    public static int addOdds(int n){
        int sum=0;
        for(int i=1; i<=n; i=i+2){
            sum= sum+i;
        }
        return sum;
    }
    public static int howManyYears(double startPop, double endPop){
        int a=0;
        while(startPop<=endPop){
            startPop= startPop + (startPop*.0113);
            a++;
        }
        return a;
    }
    public static void main(String [] args){
        System.out.println(addOdds(10));
        System.out.println(howManyYears(111.2, 120));
    }
}
