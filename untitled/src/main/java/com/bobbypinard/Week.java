package com.bobbypinard;

public class Week {
    private int weekNumber;
    private String awayTeam, homeTeam;

    public static void main(String args[]){
    }

    public int getWeekNumber(){
        return weekNumber;
    }

    public void setWeekNumber(int num){
        if(num < 1 || num > 18){
            throw new IllegalArgumentException("Week number out of bounds.");
        } else{
            this.weekNumber = num;
        }
    }

    public String getAwayTeam(){
        return awayTeam;
    }

    public void setAwayTeam(String team){
        this.awayTeam = team;
    }

    public String getHomeTeam(){
        return homeTeam;
    }

    public void setHomeTeam(String team){
        this.homeTeam = team;
    }

    public String toString(){
        return "Week " + weekNumber + ": " + awayTeam + " at " + homeTeam;
    }
}

