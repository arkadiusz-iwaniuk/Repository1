package com.isa.ehj1;

public class Question {

    private String questionContent;
    private char correctAnswer;
    private Category category;

    public String getQuestionContent() {
        return questionContent;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public Category getCategory() {
        return category;
    }

    public Question(String questionContent, char correctAnswer, Category category) {
        this.questionContent = questionContent;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    static Question question1 = new Question("Które miasto jest stolicą Kaszub?", 'd', Category.GEOGRAFIA);
    static Question question2 = new Question("Ile medali zdobyli Polacy na ZIO w Pekinie", 'a', Category.SPORT);
    static Question question3 = new Question("Jakiego typu wartość zwraca metoda hashCode?", 'c', Category.JAVA);
    static Question question4 = new Question("Jaki symbol ma pierwiastek sód?", 'b', Category.CHEMIA);
    static Question question5 = new Question("Jaki klub piłkarski ma siedzibę w Turynie?", 'c', Category.SPORT);
    static Question question6 = new Question("W któym roku odbyła się bitwa pod Grunwaldem?", 'a', Category.HISTORIA);
}
