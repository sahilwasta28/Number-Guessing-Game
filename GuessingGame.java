package com.example.guessinggame;

//Java Game "Guess a Number" that allows user to guess a random number that has been generated.

import javax.swing.*;

public class GuessingGame {

    public static void main(String args[]) {
       int systemNumber=(int)(Math.random()*100+1); //Math is predefined class and random is predefined method in Math class.
       int userAnswer=0;
       int count=1;

       System.out.println("The Correct Guess would be: "+systemNumber); //printing a random number

       while(userAnswer != systemNumber){ //Process inside the loop
           //When userAnswer is not equal to systemNumber generated
           String response = JOptionPane.showInputDialog(null,"Enter a random guess between 1 and 100","Number Guessing Game",JOptionPane.QUESTION_MESSAGE);
           userAnswer=Integer.parseInt(response);

           JOptionPane.showMessageDialog(null," "+determineGuess(userAnswer,systemNumber,count));
           //JOptionPane is predefined class and showMessageDialog is predefined method in JOptionPane class.
           count++;
       }
    }
//First we create a determineGuess method, because to condition between the userAnswer and systemAnswer
 //determineGuess method is user defined method herein.
 public static String determineGuess(int userAnswer,int systemNumber,int count){
        //Applying If condition
     if(userAnswer <= 0 || userAnswer >= 100)
         return "Your Guess is Invalid !";
     else if(userAnswer == systemNumber)
         return "Correct! \n Total Guesses : "+count;
     else if(userAnswer > systemNumber)
         return "Your Guess is too High, Try Again ! \n Try Number :"+count;
     else if(userAnswer < systemNumber)
         return "Your Guess is too Low, Try Again ! \n Try Number :"+count;
     else
         return "Your Guess is Incorrect ! \n Try Number :"+count;
     //This method is written using While Loop.
 }
}