package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    InsertionSort sort = new InsertionSort();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player[] scoreBoard = new Player[3];
        scoreBoard[0] = player1;
        scoreBoard[1] = player2;
        scoreBoard[2] = player3;

        player1.setKill(5);
        player1.setDeath(3);
        player1.setAssist(2);

        player2.setKill(7);
        player2.setDeath(4);
        player2.setAssist(3);

        player3.setKill(6);
        player3.setDeath(5);
        player3.setAssist(5);

        for (int i=0; i< scoreBoard.length; i++) {
            int number = i+1;
            System.out.println("Input Name for Player " + number + " : ");
            scoreBoard[i].setName(sc.next());
            System.out.println("Name for Player " + number + " : " + scoreBoard[i].getName());
        }



        System.out.println("Initial Scoreboard : ");
        for (int i=0; i<scoreBoard.length; i++) {
            System.out.println(scoreBoard[i].getName() + " : " + scoreBoard[i].getCbtScore());
        }
        System.out.println("");

        sort.insertionSort(scoreBoard);

        System.out.println("Sorted Scoreboard : ");
        for (int i=0; i<scoreBoard.length; i++) {
            System.out.println(scoreBoard[i].getName() + " : " + scoreBoard[i].getCbtScore());
        }
        System.out.println("");

        player1.kill(player2);
        player3.assist(player1, player2);
        sort.insertionSort(scoreBoard);

        System.out.println("Updated Sorted Scoreboard : ");
        for (int i=0; i< scoreBoard.length; i++) {
            System.out.println(scoreBoard[i].getName() + " : " + scoreBoard[i].getCbtScore());
        }
    }
}
