package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int randomColumn = (int) ( Math.random()*4 ) ;
        int randomRow = (int) ( Math.random()*4 );

        char[][] table = new char[][]
                {
                        { '-' , '-', '-', '-', '-'},
                        { '-' , '-', '-', '-', '-'},
                        { '-' , '-', '-', '-', '-'},
                        { '-' , '-', '-', '-', '-'},
                        { '-' , '-', '-', '-', '-'},
                };
        Scanner in = new Scanner(System.in);

        int playerRow;
        int playerColumn;

        do{
            System.out.flush();
            System.out.println("Input a Row");

            playerRow= in.nextInt();
            System.out.println("Input a Column");
            playerColumn= in.nextInt();
            playerRow=playerRow-1;
            playerColumn=playerColumn-1;
            table[playerRow][playerColumn]='*';

            for (int i = 0; i < table.length; i++){
                for(int j=0; j < table[i].length; j++){

                    System.out.printf("%c ", table[i][j]);
                }
                System.out.println();
            }
        }
        while(randomColumn != playerColumn && randomRow != playerRow );

        System.out.println("you won!");

    }

}









