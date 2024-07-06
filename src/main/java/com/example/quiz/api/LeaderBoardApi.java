package com.example.quiz.api;

import com.example.quiz.domain.QuizSession;
import com.example.quiz.service.QuizSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/quiz")
public class LeaderBoardApi {

    @Autowired
    protected QuizSessionService quizSessionService;

    @GetMapping("/leaderboard")
    public QuizSession getQuizSession(){
        return this.quizSessionService.getQuizSession();
    }

}
