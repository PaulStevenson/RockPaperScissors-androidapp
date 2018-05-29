package com.example.hannahgreen.rockpapersissors;

import com.example.hannahgreen.rockpapersissors.Enums.ChoiceType;
import com.example.hannahgreen.rockpapersissors.Enums.ResultType;

public class Game {

    protected ChoiceType choiceType;
    protected ResultType resultType;
//    protected User user;
    protected Android android;

    public String checkWinner() {
        User user = new User();
        Android android = new Android();
        ChoiceType userChoice = user.makeChoice(ChoiceType.PAPER);
        ChoiceType androidChoice = android.getRandomChoice();

        if (userChoice == ChoiceType.PAPER && androidChoice == ChoiceType.ROCK){
            return "Player wins with Paper";}
        else if (userChoice == ChoiceType.ROCK && androidChoice == ChoiceType.PAPER)
            return "Sorry, Android wins with Rock";
        else if (userChoice == ChoiceType.PAPER && androidChoice == ChoiceType.SCISSORS)
            return "Sorry, Android wins with Paper";
        else if (userChoice == ChoiceType.SCISSORS && androidChoice == ChoiceType.PAPER)
            return "Player wins with Scissors";
        else if (userChoice == ChoiceType.ROCK && androidChoice == ChoiceType.SCISSORS)
            return "Player wins with Rock";
        else if (userChoice == ChoiceType.SCISSORS && androidChoice == ChoiceType.ROCK)
            return "Sorry, Android wins with Scissors";
        else if ( userChoice == androidChoice);{
            return "It's a draw";}
    }


}

