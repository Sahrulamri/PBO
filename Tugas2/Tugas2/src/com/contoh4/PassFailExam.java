package com.contoh4;

public class PassFailExam extends PassFailActivity {

    protected int numberOfQuestions;
    protected double poitsPerQuestion;
    protected int numberMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        // super();
        numberOfQuestions = questions;
        numberMissed = missed;
        minimumPassingScore = minPassing;
    }

    public double getPointsEach(){
        return poitsPerQuestion;
    }

    public int getNumMissed(){
        return numberMissed;
    }
}
