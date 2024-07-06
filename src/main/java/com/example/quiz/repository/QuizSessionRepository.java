package com.example.quiz.repository;

import com.example.quiz.domain.QuizSession;
import com.example.quiz.domain.User;
import com.example.quiz.domain.UserQuiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizSessionRepository {

    @Autowired
    protected QuizRepository quizRepository;

    @Autowired
    protected UserRepository userRepository;

    public QuizSession createQuizSession() {

        QuizSession quizSession = new QuizSession();
        quizSession.id = "QS" + System.currentTimeMillis();
        for (User user : userRepository.userList) {
            UserQuiz userQuiz = new UserQuiz();
            userQuiz.user = user;
            userQuiz.quiz = quizRepository.quiz;
            quizSession.userQuizList.add(userQuiz);
        }
        return quizSession;
    }

}
