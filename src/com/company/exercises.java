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
    public static int sumDigits(int n){
        int total=0;
        int d;
        while(n>0){
            d=n%10;
            n=n/10;
            total=total+d;
        }
        return total;
    }
    public static void sillyNumbers() {
        for (int n = 1; n <= 3; n++) {
            for (int i = 0; i <= 9; i++) {
                int a = 1;
                while (a <= 3) {
                    System.out.print(i);
                    a++;
                }
            }
            System.out.println();
        }
    }
        public static void sillyNumbers2(){
            for(int i=1; i<=4; i++){
                for(int a=9; a>=1; a--){
                    for(int n=1; n<=a; n++){
                        System.out.print(a);
                    }
                }
                System.out.println();
            }
        }
        public static void dollarsAndStars(){
            for(int i=1; i<=7; i++){
                for(int q=0; q<=12; q=q+2){
                    for(int n=7; n>=1; n--){
                        for(int p=14; p>=2; p=p-2){
                            
                        }
                    }
                }
            }
        }
    public static void main(String [] args){
        System.out.println(addOdds(10));
        System.out.println(addOdds(25));
        System.out.println(addOdds(7));
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(sumDigits(420));
        System.out.println(sumDigits(69));
        System.out.println(sumDigits(99999969));
        sillyNumbers();
        sillyNumbers2();
    }
}
