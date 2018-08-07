package com.company;

public class Team {

    public String name;
    public int wins;
    public int losses;
    public int ranking;

    public Team(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    public Team(String name, int wins, int losses, int ranking) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.ranking = ranking;
    }

    public void addWin(int newWins) {
        this.wins += newWins;
    }

}
