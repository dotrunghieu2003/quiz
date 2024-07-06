package com.example.quiz.service;

import com.example.quiz.domain.Question;
import com.example.quiz.domain.QuizSession;
import com.example.quiz.domain.User;
import com.example.quiz.domain.UserQuiz;
import com.example.quiz.repository.QuestionRepository;
import com.example.quiz.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class UserTestSimulation {
    @Autowired
    protected QuizSessionService quizSessionService;
    @Autowired
    protected UserRepository userRepository;
    @Autowired
    protected QuestionRepository questionRepository;

    Random rand = new Random();

    int countSubmit = 0;

    @PostConstruct
    public void startNew() {
        QuizSession quizSession = quizSessionService.createNewQuizSession();
        log.info("******STARTING NEW QUIZ SESSION ID:{} ***************", quizSession.id);
        countSubmit = 0;
    }

    @Scheduled(fixedDelay = 10000) //run every 10s
    public void userSubmitQuestionSimulation() {
        if (countSubmit <= 10) {
            log.info("************************* SIMULATION USER SUBMIT QUIZ QUESTION **************************");
            for (User user : userRepository.getUserList()) {
                int randomQuestionIndex = (int) System.nanoTime() % 10;
                Question question = this.questionRepository.getQuestionList().get(Math.abs(randomQuestionIndex));
                int score = rand.nextInt(10) + 1;
                quizSessionService.mockHandleQuiz(user, question.id, score);
                log.info("User ID:{} submit question ID:{}, Score:{}", user.id, question.id, score);
            }
            countSubmit++;
        }else{
            this.startNew();
        }
    }

    @Scheduled(fixedDelay = 12000) //run every 12s
    public void printLeaderBoard() {
        QuizSession quizSession = quizSessionService.getQuizSession();
        log.info("**************************** SPRINTING QUIZ LEADER BOARD SESSION ID:{} ******************************", quizSession.id);
        for (UserQuiz userQuiz : quizSession.userQuizList) {
            log.info("*** User ID:{}, Quiz ID:{}, Total Score:{}", userQuiz.user.id, userQuiz.quiz.id, userQuiz.totalScore);
        }
    }

}
