package com.company;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true,33));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
       int low, high;
       if(summer){
           low =25;
           high = 45;
        }
        else{
            low=25;
            high=35;
       }
       if(temperature >= low && temperature <= high){
           return true;
       }else
           return false;
    }
}
