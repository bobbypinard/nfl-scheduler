package com.bobbypinard;

public class Main {
    public static void main(String[] args) {

        Week[] season = new Week[18];

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scheduler schedule = new Scheduler();
        arr = schedule.fisherYates(arr);

        for(int i: arr){
            System.out.println(i);
        }

        for(int i = 0; i < season.length; i++){
            season[i] = new Week();
            season[i].setWeekNumber(i + 1);
            season[i].setAwayTeam("HST");
            season[i].setHomeTeam("KC");
            System.out.println(season[i].toString());
        }

    }
}