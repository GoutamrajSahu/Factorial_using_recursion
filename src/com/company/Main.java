package com.company;
import java.util.*;
class Main {

    static int fact(int num){
        if(num == 0){
            return 1;
        }
        return(num*(fact(num-1)));
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = Sc.nextInt();
        int res = fact(num);
        System.out.println("Factorial is: "+res);
    }
}
