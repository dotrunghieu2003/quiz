package com.example.quiz.domain;

import lombok.Data;

@Data
public class UserQuiz {

    public User user;

    public Quiz quiz;

    public long totalScore;

}
