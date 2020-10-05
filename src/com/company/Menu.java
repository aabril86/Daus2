package com.company;

import java.util.Scanner;

class Menu {

    private final Scanner scanner = new Scanner(System.in);

    void startMenu(){

        JocDaus jocDaus = new JocDaus();
        int op;
        boolean daus = false;

        do {

            System.out.println("1- Daus\n2- Others\n3- Exit");
            op = scanner.nextInt();

            switch(op){
                case 1:
                    daus = true;
                    jocDaus.play();
                    break;
                case 2:
                    break;
            }
        }while(op != 3);

        if (daus) jocDaus.victories();
    }
}
