package com.company;

public class Main {

    public static void main(String[] args) {

        Ranking standings = new Ranking();
        Team Seattle = new Team("SEA", 21, 7, 1);
        Team Atlanta = new Team("ATL", 17, 10, 2);
        Team LosAngeles = new Team("LA", 16, 11, 3);
        Team Washington = new Team("WASH", 15, 11, 4);
        Team Phoenix = new Team("PHX", 16, 12, 4);
        Team Connecticut = new Team("CT", 15, 12, 6);
        Team Minnesota = new Team("MINN", 15, 12, 6);
        Team Dallas = new Team("DAL", 14, 13, 8);
        Team LasVegas = new Team("LV", 12, 14, 9);
        Team Chicago = new Team("CHI", 10, 18, 10);
        Team NewYork = new Team("NY", 7, 20, 11);
        Team Indiana = new Team("IND", 5, 23, 12);

        Indiana.addWin(1);

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

        standings.printStandings();
    }
}
