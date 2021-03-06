package com.company;

public class Main {

    public static void main(String[] args) {

        Ranking standings = new Ranking();
        Team Seattle = new Team("SEA", 21, 7, 1);
        Team Atlanta = new Team("ATL", 18, 10, 2);
        Team LosAngeles = new Team("LA", 17, 11, 3);
        Team Washington = new Team("WASH", 16, 11, 4);
        Team Connecticut = new Team("CT", 16, 12, 5);
        Team Phoenix = new Team("PHX", 16, 13, 6);
        Team Minnesota = new Team("MINN", 15, 13, 7);
        Team Dallas = new Team("DAL", 14, 14, 8);
        Team LasVegas = new Team("LV", 12, 15, 9);
        Team Chicago = new Team("CHI", 10, 18, 10);
        Team NewYork = new Team("NY", 7, 20, 11);
        Team Indiana = new Team("IND", 5, 23, 12);

        standings.addTeam(Seattle);
        standings.addTeam(Atlanta);
        standings.addTeam(LosAngeles);
        standings.addTeam(Washington);
        standings.addTeam(Phoenix);
        standings.addTeam(Connecticut);
        standings.addTeam(Minnesota);
        standings.addTeam(Dallas);
        standings.addTeam(LasVegas);
        standings.addTeam(Chicago);
        standings.addTeam(NewYork);
        standings.addTeam(Indiana);

        //standings.printStandings();

        //standings.playoffRaceNoTieBreakers(8, 34);

        Ranking standings2 = new Ranking();
        Team Seattle2 = new Team("SEA", 6, 1);
        Team Atlanta2 = new Team("ATL", 3, 4);
        Team LosAngeles2 = new Team("LA", 5, 2);
        Team Washington2 = new Team("WASH", 0, 7);

        standings2.addTeam(Seattle2);
        standings2.addTeam(Atlanta2);
        standings2.addTeam(LosAngeles2);
        standings2.addTeam(Washington2);

        standings2.calculateRank();

        standings2.printStandings();


    }
}
