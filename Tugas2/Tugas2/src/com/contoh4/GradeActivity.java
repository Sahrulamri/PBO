package com.contoh4;

class GradeActivity {
    protected double score;
    protected String name;

    public GradeActivity(){
    }

    public GradeActivity(double score, String name){
        this.score = score;
        this.name = name;
    }

    public void setScore(double score){
        this.score = score;
    }

    public double getScore(){
        return 0;
    }

    public char getGrade(){
        return 'A';
    }
}