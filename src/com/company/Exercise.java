package com.company;

public class Exercise {
    private String exercise;
    private String desc;
    private int duration;
    private String position;

    public Exercise(String exercise, String desc, int duration, String position) {
        this.exercise = exercise;
        this.desc = desc;
        this.duration = duration;
        this.position = position;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return exercise + "          DURATION: "+duration+" seconds\n" +
                "----------------------------------------------\n"+
                "DESCRIPTION: "+desc+"\n";
    }
}
