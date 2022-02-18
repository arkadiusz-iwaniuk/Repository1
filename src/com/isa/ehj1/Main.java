package com.isa.ehj1;

import java.util.*;

import static com.isa.ehj1.Answer.*;
import static com.isa.ehj1.Question.*;
import static com.isa.ehj1.QuestionsDraw.questionsDraw;

public class Main {

    public static void main(String[] args) {

        Set numbers = questionsDraw();

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);

        List<Answer> answers = new ArrayList<>();
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        answers.add(answer4);
        answers.add(answer5);
        answers.add(answer6);

        int count = 0;
        int i = 1;
        System.out.println("Podaj odpowiedź jako odpowiednią literę a, b, c lub d. Na każde pytanie jest tylko jedna poprawna odpowiedź.");
        for (Object j : numbers) {
            System.out.println("Pytanie " + i +". Kategoria: " + questions.get((Integer) j).getCategory());
            System.out.println(questions.get((Integer) j).getQuestionContent());
            System.out.println(answers.get((Integer) j).getAnswerContent());
            System.out.println();
            System.out.println("Podaj odpowiedź:");
            Scanner scanner = new Scanner(System.in);
            char x = scanner.next().charAt(0);
            i += 1;
            if(questions.get((Integer) j).getCorrectAnswer() == x){
                System.out.println("Poprawna odpowiedź");
                count += 1;
            } else{
                System.out.println("Błędna odpowiedź");
            }
        }
        System.out.println("Test zakończony. Wynik: " + count + "/3");
    }
}