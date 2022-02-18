package com.isa.ehj1;

import java.util.HashSet;
import java.util.Set;

public class QuestionsDraw {

    public static Set questionsDraw() {

        Set<Integer> numbers = new HashSet<>();

        while(numbers.size()<3) {
            numbers.add((int) (Math.random()*6));
            }
        return numbers;
        }
    }
