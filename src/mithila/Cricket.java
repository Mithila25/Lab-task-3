package mithila;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player) {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display() {
        System.out.println("match type = " + matchType);
        System.out.println("over = " + over);
        System.out.println("player name = " + player.playerName);
        System.out.println("jerseyNumber = "+ player.jerseyNumber);
    }
}


/*
Name    : Mithila Talukdar
ID      : 2012020056
Section : B
email   : cse_2012020056@lus.ac.bd
Date    : 11-09-2021
*/