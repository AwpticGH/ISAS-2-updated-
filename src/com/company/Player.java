package com.company;

import java.util.Scanner;

public class Player {

    private int cbtScore = 0;
    private int kill = 0;
    private int killScore = 0;
    private int death = 0;
    private int deathScore = 0;
    private int assist = 0;
    private int assistScore = 0;

    private String name;

    public void setKill(int n) {
        kill = n;
        updateScore();
    }

    public void setDeath(int n) {
        death = n;
        updateScore();
    }

    public void setAssist(int n) {
        assist = n;
        updateScore();
    }

    public void setName(String name) {
//        Scanner sc = new Scanner(System.in);
//        name = sc.next();
        this.name = name;
    }

    public int getCbtScore() {
        return cbtScore;
    }

    public String getName() {
        return name;
    }

    public void kill(Player enemy) {
        kill++;
        enemy.death++;
        updateScore();
        enemy.updateScore();
    }

    public void kill(Player friend, Player enemy) {
        kill++;
        friend.assist++;
        enemy.death++;
        updateScore();
        friend.updateScore();
        enemy.updateScore();
    }

    public void assist(Player friend, Player enemy) {
        assist++;
        friend.kill++;
        enemy.death++;
        updateScore();
        friend.updateScore();
        enemy.updateScore();
    }

    private void updateScore() {
        killScore = 10*kill;
        deathScore = (-5)*death;
        assistScore = 3*assist;
        countCbtScore();
    }

    private void countCbtScore() {
        cbtScore = killScore + deathScore + assistScore;
    }
}