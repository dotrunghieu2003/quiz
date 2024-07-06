package com.example.quiz.service;

import com.example.quiz.domain.Question;
import com.example.quiz.domain.QuizSession;
import com.example.quiz.domain.User;
import com.example.quiz.domain.UserQuiz;
import com.example.quiz.repository.QuizSessionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class QuizSessionService {
    @Autowired
    private QuizSessionRepository quizSessionRepository;

    private QuizSession quizSession;

    protected void init(){
        quizSession = this.quizSessionRepository.createQuizSession();
    }

    public QuizSession createNewQuizSession(){
        this.init();
        return quizSession;
    }

    public void mockHandleQuiz(User user, String questionID, int score ){
        Optional<UserQuiz> optional = this.quizSession.userQuizList.stream().filter(t -> t.user.id.equals(user.id)).findFirst();
        if(optional.isPresent()){
            UserQuiz userQuiz = optional.get();
            Optional<Question> optionalQuestion = userQuiz.quiz.questionList.stream().filter(q -> q.id.equals(questionID)).findFirst();
            optionalQuestion.ifPresent(value -> value.score = score);
            int sumScore = userQuiz.quiz.questionList.stream().map(t -> t.score).mapToInt(Integer::intValue).sum();
            userQuiz.totalScore = sumScore;
        }

    }

    public QuizSession getQuizSession(){
        return this.quizSession;
    }

}
