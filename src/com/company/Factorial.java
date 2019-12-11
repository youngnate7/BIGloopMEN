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
    public static double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int count = 1;
        while ((e-olde) > 0.001)
        {
            olde = e;
            e = e + 1.0/calcFactorial(count);
            count++;
        }
        return e;
    }

    public static double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int count = 1;
        while ((e-olde) > 0.001)
        {
            olde = e;
            e = e + Math.pow(x,count)/calcFactorial(count);
            count++;
        }
        return e;
    }

    public static void main (String [] args){

        for (int i=1; i<=20; i++){
            System.out.print(calcFactorial(i));
            System.out.println();
        }
        System.out.println(calcE());
        System.out.printf("e is %2.3f \n", calcEX(1));
        System.out.printf("e is %2.3f \n", calcEX(2));
        System.out.printf("e is %2.3f \n", calcEX(3));
        System.out.printf("e is %2.3f \n", calcEX(4));
        System.out.printf("e is %2.3f \n", calcEX(5));

    }

}

//Output:
//1
//2
//6
//24
//120
//720
//5040
//40320
//362880
//3628800
//39916800
//479001600
//6227020800
//87178291200
//1307674368000
//20922789888000
//355687428096000
//6402373705728000
//121645100408832000
//2432902008176640000
//2.7182539682539684
//e is 2.718
//e is 7.389
//e is 20.085
//e is 54.598
//e is 148.413
//
//Process finished with exit code 0
