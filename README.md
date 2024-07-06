# quiz
Quiz system demo
# User case Diagram
![image](https://github.com/dotrunghieu2003/quiz/assets/22995357/240eb01f-6009-481d-84f1-a174e87a6576)

# System and component architecture

![image](https://github.com/dotrunghieu2003/quiz/assets/22995357/27af85db-8fe2-4218-8f2c-49b1eaaaec61)

# Quiz Test Flow Diagram
![image](https://github.com/dotrunghieu2003/quiz/assets/22995357/675b5292-70fe-4555-bed7-e817c4edd6be)

# Sample Demo for module LeaderBoard Monitor
  For demostation, system create mock data on Question, Users, Quiz, UserQuiz and QuizSession during application start up
  This servive expose the Rest API for multiple FE style (Web/Mobile App) can consume and render data
#Technology: 
Java Spring Boot version 3.3.1, Java version 17, build tool Maven, we can add Docker file for K8S Container runnable

# How to run: checkout the source code into local PC and run command
mvn spring-boot:run
Application Starting
![image](https://github.com/dotrunghieu2003/quiz/assets/22995357/4a8c82ff-0727-4d09-bd5a-350ddc9b9b89)


# Call Rest API to view the data of Quiz session 
![image](https://github.com/dotrunghieu2003/quiz/assets/22995357/b091371b-a403-444a-af00-779e4aaa9036)


# Sample JSON Data of LeaderBoard API
```JSON
{
  "id": "QS1720258735460",
  "userQuizList": [
    {
      "user": {
        "id": "U1",
        "name": "User Name 1"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 15
    },
    {
      "user": {
        "id": "U2",
        "name": "User Name 2"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 7
    },
    {
      "user": {
        "id": "U3",
        "name": "User Name 3"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 9
    },
    {
      "user": {
        "id": "U4",
        "name": "User Name 4"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 9
    },
    {
      "user": {
        "id": "U5",
        "name": "User Name 5"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 8
    },
    {
      "user": {
        "id": "U6",
        "name": "User Name 6"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 10
    },
    {
      "user": {
        "id": "U7",
        "name": "User Name 7"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 13
    },
    {
      "user": {
        "id": "U8",
        "name": "User Name 8"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 11
    },
    {
      "user": {
        "id": "U9",
        "name": "User Name 9"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 13
    },
    {
      "user": {
        "id": "U10",
        "name": "User Name 10"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 12
    },
    {
      "user": {
        "id": "U11",
        "name": "User Name 11"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 7
    },
    {
      "user": {
        "id": "U12",
        "name": "User Name 12"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 11
    },
    {
      "user": {
        "id": "U13",
        "name": "User Name 13"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 13
    },
    {
      "user": {
        "id": "U14",
        "name": "User Name 14"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 9
    },
    {
      "user": {
        "id": "U15",
        "name": "User Name 15"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 8
    },
    {
      "user": {
        "id": "U16",
        "name": "User Name 16"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 16
    },
    {
      "user": {
        "id": "U17",
        "name": "User Name 17"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 9
    },
    {
      "user": {
        "id": "U18",
        "name": "User Name 18"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 14
    },
    {
      "user": {
        "id": "U19",
        "name": "User Name 19"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 9
    },
    {
      "user": {
        "id": "U20",
        "name": "User Name 20"
      },
      "quiz": {
        "id": "quiz_1720258735455",
        "questionList": [
          {
            "id": "QA1",
            "description": "Question description 1",
            "score": 4
          },
          {
            "id": "QA2",
            "description": "Question description 2",
            "score": 0
          },
          {
            "id": "QA3",
            "description": "Question description 3",
            "score": 0
          },
          {
            "id": "QA4",
            "description": "Question description 4",
            "score": 0
          },
          {
            "id": "QA5",
            "description": "Question description 5",
            "score": 0
          },
          {
            "id": "QA6",
            "description": "Question description 6",
            "score": 0
          },
          {
            "id": "QA7",
            "description": "Question description 7",
            "score": 0
          },
          {
            "id": "QA8",
            "description": "Question description 8",
            "score": 0
          },
          {
            "id": "QA9",
            "description": "Question description 9",
            "score": 6
          },
          {
            "id": "QA10",
            "description": "Question description 10",
            "score": 0
          }
        ]
      },
      "totalScore": 10
    }
  ]
}
```
