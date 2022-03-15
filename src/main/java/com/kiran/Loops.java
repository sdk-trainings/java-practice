package com.kiran;

public class Loops {

    public static void main(String[] args) {
        int i = 0;
        /**
         *
         * While loop iterate till condition becomes false
         *
         * while(<logical condition>){
         *   <statements>;
         * }
         */
        System.out.println("### starting While Loop ######");
        while(i <= 10){
            System.out.println(i);
            i++;
        }


        /**
         *
         * do-while loop , first runs the statement and validates the condition
         * So do-while loop runts at least once
         *
         *
         * do{
         *   <statements>;
         * }while(<logical condition>);
         *
         */
        System.out.println("### starting do-while Loop ######");
        do{
            System.out.println(i);
            i++;
        }while(i <= 20);

        /**
         *
         *
         * for loop iterate till condition becomes false
         *
         * for(<initialization> ; <logical condition> ; <increment/decrement>) {
         *   <statements>;
         * }
         *
         */

        System.out.println("### starting for Loop ######");
        for(int y = 1; y<=10; y++)
            System.out.println(y);

        for(;i<=30;i++)
            System.out.println(i);


        for(int y = 1 ; y <=5 ; y++ ){
            for (int j=1; j<=y;j++)
                System.out.print("*");
            System.out.println("");
        }

    }
}
