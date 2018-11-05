package com.company;

public class SecondsMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(70, 30));
        System.out.println(getDurationString(3965L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "invalid value";
        } else {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }
    private static String getDurationString ( long seconds){
            if (seconds < 0) {
                return "invalid value";
            } else {
                long minutes = seconds / 60;
                long remainingSeconds = seconds % 60;
                return getDurationString(minutes, remainingSeconds);
            }
        }


    }

