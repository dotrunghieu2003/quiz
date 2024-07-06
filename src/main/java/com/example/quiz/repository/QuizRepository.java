package com.example.quiz.repository;

import com.example.quiz.domain.Quiz;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class QuizRepository {

    @Autowired
    private QuestionRepository questionRepository;

    protected Quiz quiz;

    @PostConstruct
    public void initQuiz(){
        quiz = new Quiz();
        quiz.id = "quiz_" + System.currentTimeMillis();
        quiz.questionList = new ArrayList<>(this.questionRepository.getQuestionList());
    }

    public Quiz getQuiz(){
        return this.quiz;
    }
}
