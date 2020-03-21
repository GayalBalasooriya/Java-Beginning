package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer shan = new SoccerPlayer("Shan");

        Team adelaide = new Team("Adelaide");
        adelaide.addPlayer(joe);
        adelaide.addPlayer(pat);
        adelaide.addPlayer(shan);

        System.out.println(adelaide.numPlayers());
    }

}
