package org.example;

import java.util.Scanner;

public class QuestionService {
    Question[] questions =new Question[5];
    String selection[]=new String[5];
    public QuestionService(){
        questions[0]=new Question(1,"What is size of int","2","4","8","6","4");
        questions[1]=new Question(2,"What is size of float","2","4","8","6","4");
        questions[2]=new Question(3,"What is size of double","2","4","8","6","8");
        questions[3]=new Question(4,"What is size of long ","2","4","8","6","8");
        questions[4]=new Question(5,"What is size of byte","2","4","8","6","2");
    }

    public void palyQuiz(){
        int i=0;
        for(Question q:questions) {
            System.out.println("Question No :"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            Scanner sc=new Scanner(System.in);
            selection[i] =sc.nextLine();
            i++;
        }
        for(String s:selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score=0;
        for (int i = 0; i < questions.length; i++) {
            Question que= questions[i];
            String actualAnswer= que.getAnswer();
            String userAnswer= selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: "+score);
    }
}
