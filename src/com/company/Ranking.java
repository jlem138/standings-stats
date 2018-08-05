package com.company;

public class Ranking {
    public Team[] standings = new Team[12];
    private int totalTeams = 0;

    public void addTeam(Team newTeam) {
        standings[totalTeams] = newTeam;
        totalTeams += 1;
    }

    public void printTeam(int number) {
        System.out.println("team name " + standings[number-1].name);
    }

    public void printStandings() {
        System.out.println("  Team" + "    " + "W" + "     " + "L" + "   " + "rank");
        for (int i=0; i<totalTeams; i++) {
            Team currentTeam = standings[i];
            System.out.printf("| %4s | %3s | %3s| %3s | %n", currentTeam.name, currentTeam.wins, currentTeam.losses, currentTeam.ranking);
        }
    }

}