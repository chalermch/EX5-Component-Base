/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ScoreSoure soure = new ScoreSoure();
        Subscriber sub = new Subscriber();
        for(int i = 0; i < 2; i++)
            soure.register(sub);
        while(true){
            System.out.print("Enter Score ");
            String score = sc.nextLine();
            if(score.equals(""))break;
            soure.setScoreLine(score);
        }

    }
    
}
