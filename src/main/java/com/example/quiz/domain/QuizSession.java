package com.example.quiz.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuizSession {

    public String id;

    public List<UserQuiz> userQuizList = new ArrayList<>();
}
