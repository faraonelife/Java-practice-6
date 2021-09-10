package com.faraonelife.BuilderPattern;

import java.util.Scanner;

public class Tea {
    public static void choice(){
        Scanner input=new Scanner(System.in);
        System.out.println("1:Plain Tea");
        System.out.println("2:With Sugar but without Milk Tea");
        System.out.println("3:With Milk but without Sugar Tea");
        System.out.println("4:Sugar and Milk Tea");
        int i= input.nextInt();Direactor direactor=new Direactor();
        switch (i){
            case 1:direactor.constructorWithout();
            break;
            case 2:direactor.constructorWithoutM();
            break;
            case 3:direactor.constructorWithoutS();
            break;
            case 4:direactor.constructorWith();
        }
    }

}
