package com.isa.ehj1;

public class Answer {

    private int answerId;
    private String answerContent;

    public String getAnswerContent() {
        return answerContent;
    }

    public Answer(String answerContent) {
        this.answerContent = answerContent;
    }

    static Answer answer1 = new Answer("a. Kòscérzna\nb. Wejrowò\nc. Pùck\nd. Najstarsi górale tego nie wiedzą");
    static Answer answer2 = new Answer("a. 1\nb. 2\nc. 3\nd. 4");
    static Answer answer3 = new Answer("a. boolean\nb. char\nc. int\nd. nic nie zwraca");
    static Answer answer4 = new Answer("a. Br\nb. Na\nc. Mn\nd. Ca");
    static Answer answer5 = new Answer("a. Inter\nb. Sampdoria\nc. Juventus\nd. Lazio");
    static Answer answer6 = new Answer("a. 1410\nb. 1415\nc. 1510\nd. 1556");
}
