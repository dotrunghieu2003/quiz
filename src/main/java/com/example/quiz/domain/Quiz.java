package com.example.quiz.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Quiz {

    public String id;

    public List<Question> questionList = new ArrayList<>();

}
