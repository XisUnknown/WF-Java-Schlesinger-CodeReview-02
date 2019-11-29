package com.company;
import java.util.Scanner;

public class Main {
    private static Exercise[] exercises = {
            new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, "floor"),
            new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "floor"),
            new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "standing"),
            new Exercise("Backward-Kicks", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "floor"),
            new Exercise("Leg Curls", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg. ", 90, "standing"),
            new Exercise("Sidewards Back Stretches", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand. ", 60, "standing")
    };
    static IntervalWorkout workoutplan = new IntervalWorkout(new String[]{"Push Ups", "Sit Ups", "Planks"}, 3, 30);
    public static void main(String[] args) {
        int i = 0;
        while(i!=10) {
            i = menu();
        }
    }
    public static int menu(){
        int i=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Personalized Workout Planner");
        System.out.println("Show all exercises: (1)");
        System.out.println("Show all exercises on the floor: (2)");
        System.out.println("Show all exercises on the floor with a duration longer than a minute: (3)");
        System.out.println("Show a demo for a workout-plan: (4)");
        System.out.println("Quit the application: (5)");
        System.out.print("Your choice: ");
        i = myObj.nextInt();
        System.out.print("\n");
        switch(i){
            case 1: for(Exercise exercise : exercises) {
                System.out.println(exercise);
            }
                return 0;
            case 2: for(Exercise exercise : exercises) {
                if(exercise.getPosition()=="floor")
                System.out.println(exercise);
            }
                return 0;
            case 3: for(Exercise exercise : exercises) {
                if(exercise.getPosition()=="floor"&&exercise.getDuration()>=60)
                System.out.println(exercise);
            }
                return 0;
            case 4:
                workoutplan.displayWorkoutplan();
                return 0;
            case 5:
                return 10;
            default:
                System.out.println("You entered an invalid number!!");
                return 0;
        }
    }
}
