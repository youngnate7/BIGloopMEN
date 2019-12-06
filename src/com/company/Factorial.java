package com.company;

public class Factorial {

    public static long calcFactorial(int a){
        long total=1;
        while(a>0){
            total=total*a;
            a--;
        }
        return total;
    }
    

    public static void main(String [] args){
        for(int f=1; f<=20; f++){
            System.out.println(calcFactorial(f));
        }
    }
}
