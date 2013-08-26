package net.takasuka.GeoQuizChallenge5;

import java.io.Serializable;

public class TrueFalse implements Serializable{

    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mIsCheat;

    public TrueFalse(int question, boolean trueQuestion) {
        this(question, trueQuestion, false);
    }

    public TrueFalse(int question, boolean trueQuestion, boolean isCheat) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mIsCheat = isCheat;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        this.mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.mTrueQuestion = trueQuestion;
    }

    public boolean isCheat() {
        return mIsCheat;
    }

    public void setIsCheat(boolean isCheat) {
        this.mIsCheat = isCheat;
    }
}
