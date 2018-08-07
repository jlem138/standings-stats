package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranking {
    public Team[] teamList = new Team[12];
    private int totalTeams = 0;
    public Team[] standings = new Team[12];

    public void addTeam(Team newTeam) {
        teamList[totalTeams] = newTeam;
        totalTeams += 1;
    }

    public void printTeam(int number) {
        System.out.println("team name " + standings[number - 1].name);
    }

    public void printStandings() {
        System.out.println("  Team" + "    " + " W" + "   " + " L" + "   " + "rank");
        for (int i = 0; i < totalTeams; i++) {
            Team currentTeam = standings[i];
            System.out.printf("| %4s | %3s | %3s| %3s | %n", currentTeam.name, currentTeam.wins, currentTeam.losses, currentTeam.ranking);
        }
    }

    public void playoffRaceNoTieBreakers(int qualifiers, int totalGames) {
        for (int i = 0; i < totalTeams; i++) {
            Team currentTeam = standings[i];
            if (currentTeam.ranking < qualifiers) {
                int maximumLosses = totalGames - currentTeam.wins;
                Team lastQualifier = standings[qualifiers - 1];
                if (maximumLosses < lastQualifier.losses) {
                    System.out.println(currentTeam.name + " has qualified for playoffs");
                } else {
                    System.out.println(currentTeam.name + " is still in");
                }
            } else {
                int maxWins = (totalGames - currentTeam.losses);
                Team thresholdTeam = standings[qualifiers - 1];
                int thresholdWins = thresholdTeam.wins;
                if (maxWins >= thresholdWins) {
                    System.out.println(currentTeam.name + " is still in");
                } else {
                    System.out.println(currentTeam.name + " is out of playoff contention");
                }
            }
        }
    }

    public void calculateRank() {
        List<Integer> currentWLdifferentials = new ArrayList<Integer>();
        for (int i=0; i < totalTeams; i++) {
            int currentWL = teamList[i].wins - teamList[i].losses;
            currentWLdifferentials.add(currentWL);
        }

        Collections.sort(currentWLdifferentials);


        for (int i=totalTeams-1; i >= 0; i = i - 1) {
            for (int j=0; j < totalTeams; j++) {
                int currentWL = teamList[i].wins - teamList[i].losses;
                if (currentWL == currentWLdifferentials.get(j)) {
                    teamList[i].ranking = totalTeams - j;
                }
            }
        }
        for (int k=0; k < totalTeams; k++) {
            for (int n=1; n <= totalTeams; n++) {
                if (teamList[k].ranking == n) {
                    standings[n-1] = teamList[k];
                }
            }
        }
    }
}

