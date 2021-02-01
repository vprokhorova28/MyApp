package com.example.myapp;

import java.util.Random;

public class Task {
    private static String[][] question = {
            {"This is __ my new car.", "a"},
            {"Where is __ toy.", "the"},
            {"We will go to the cinema on __ Sunday.", "-"},
            {"John has been playing __ piano since he was 10.", "the"}
    };
    private static String[] answers = {"a", "the", "-"};

    public Task() {
    }

    public String[] getQuestion() {
        return question[new Random().nextInt(question.length)];
    }

    public String[] getAnswers() {
        return answers;
    }
}
