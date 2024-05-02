package com.contoh4;

public class FinalExam extends GradeActivity {
    protected int numberOfQuestions;
    protected int numberMissed;
    protected double poitsPerQuestion;

    public FinalExam(int questions, int missed){
        numberOfQuestions = questions;
        numberMissed = missed;
    }

    public double getPointsPerQuestion(){
        return poitsPerQuestion;
    }

    public int getNumberMised(){
        return numberMissed;
    }
}
