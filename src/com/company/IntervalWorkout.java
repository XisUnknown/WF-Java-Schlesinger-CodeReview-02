package com.company;

public class IntervalWorkout {
    private String[] exercises;
    private int repetitions;
    private int breakLength;

    public IntervalWorkout(String[] exercises, int repetitions, int breakLength) {
        this.exercises = exercises;
        this.repetitions = repetitions;
        this.breakLength = breakLength;
    }

    public String[] getExercises() {
        return exercises;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getBreakLength() {
        return breakLength;
    }

    public void displayWorkoutplan(){
        System.out.println("**************************\n" + "Interval Workout Starts\n" + "***************************");
        for(int i = 1; i < repetitions+1; i++) {
            System.out.println("================================\n" + "ROUND" + i + ":\n" + "Push Ups\n" + "Sit Ups\n" + "Planks\n" + "================================");
            if (i != repetitions) {
                System.out.println("DO THE BREAK (" + breakLength + " SECONDS)");
            }
        }
        System.out.println("**************************\n" + "CONGRATS YOU ARE DONE\n" + "**************************");
    }
}
