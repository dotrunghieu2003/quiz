package com.example.quiz.repository;

import com.example.quiz.domain.Question;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionRepository {

    protected List<Question> questionList = new ArrayList<>();

    @PostConstruct
    protected void initQuestionData(){
        for(int i = 1; i<=10; i++){
            Question question = new Question();
            question.id = "QA"+ i;
            question.description ="Question description " + i;
            questionList.add(question);
        }

    }

    public List<Question> getQuestionList(){
        return this.questionList;
    }

    public void add(Question question){
        this.questionList.add(question);
    }

}
