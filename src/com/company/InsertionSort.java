package com.company;

public class InsertionSort {

    public void insertionSort(Player players[]) {
        int n = players.length;
        for (int i = 1; i < n; ++i) {
            Player key = players[i];
            int j = i - 1;

            while (j >= 0 && key.getCbtScore() > players[j].getCbtScore()) {
                players[j+1] = players[j];
                j = j - 1;
            }
            players[j+1] = key;
        }
    }
}