package game;

import java.util.Scanner;
import java.util.Random;

public class Game {

    private final Rock rock;
    private final Paper paper;
    private final Scissors scissors;
    private final Lizard lizard;
    private final Spock spock;
    private final Scanner scanner;
    private final Random rnd;

    public Game(){
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        lizard = new Lizard();
        spock = new Spock();
        rnd = new Random();
        scanner = new Scanner(System.in);
    }

    private Choice computerWins(String playersChoice){
        switch (playersChoice) {
            case "1":
                return (rnd.nextDouble() < 0.5) ? new Paper() : new Spock();
            case "2":
                return (rnd.nextDouble() < 0.5) ? new Scissors() : new Lizard();
            case "3":
                return (rnd.nextDouble() < 0.5) ? new Spock() : new Rock();
            case "4":
                return (rnd.nextDouble() < 0.5) ? new Scissors() : new Rock();
            default:
                return (rnd.nextDouble() < 0.5) ? new Paper() : new Lizard();
        }
    }

    private Choice computerLoses(String playersChoice){
        switch (playersChoice) {
            case "1":
                return (rnd.nextDouble() < 0.5) ? new Scissors() : new Lizard();
            case "2":
                return (rnd.nextDouble() < 0.5) ? new Rock() : new Spock();
            case "3":
                return (rnd.nextDouble() < 0.5) ? new Paper() : new Lizard();
            case "4":
                return (rnd.nextDouble() < 0.5) ? new Paper() : new Spock();
            default:
                return (rnd.nextDouble() < 0.5) ? new Scissors() : new Rock();
        }
    }

    private Choice computerDraws(String playersChoice){
        switch (playersChoice) {
            case "1":
                return new Rock();
            case "2":
                return new Paper();
            case "3":
                return new Scissors();
            case "4":
                return new Lizard();
            default:
                return new Spock();
        }
    }

    //Result based on given odds
    private Choice computersResult(double wining, double losing, String playersChoice){
        double random = rnd.nextDouble();
        if(wining + losing > 1)
            throw new ArithmeticException("Provided wrong odds");
        else if(random < wining)
            return computerWins(playersChoice);
        else if(wining <= random && random < wining + losing)
            return computerLoses(playersChoice);
        else
            return computerDraws(playersChoice);
    }

    private int processRound(int outcome, Choice computer){
        if(outcome == 1){
            System.out.print("beats " + computer.getName());
            System.out.println();
            return 1;
        }else if(outcome == 0){
            System.out.print("draws against " + computer.getName());
            System.out.println();
            return 0;
        }else{
            System.out.print("loses against " + computer.getName());
            System.out.println();
            return 0;
        }
    }

    private void showResults(int player, int computer){
        System.out.println("Player score " + player);
        System.out.println("Computer score " + computer);
    }

    private void stats(){
        rock.showResults();
        paper.showResults();
        scissors.showResults();
        lizard.showResults();
        spock.showResults();
    }

    //Start the game
    public void play(double computerWinningOdds, double computerLosingOdds){

        int numberOfRounds;
        int playersScore = 0;
        int computersScore = 0;
        boolean end = false;
        String playerName;

        System.out.println("What is your name? ");
        playerName = scanner.next();
        System.out.println("Set the maximum number of victories: ");
        numberOfRounds = scanner.nextInt();

        while(!end){

            System.out.println("Type 1 to choose rock");
            System.out.println("Type 2 to choose paper");
            System.out.println("Type 3 to choose scissors");
            System.out.println("Type 4 to choose lizard");
            System.out.println("Type 5 to choose spock");
            System.out.println("Type x to finish the game");
            System.out.println("Type n to reset the game");

            String playersChoice = scanner.next();
            Choice computersChoice = computersResult(computerWinningOdds,
                                                computerLosingOdds, playersChoice);

            switch (playersChoice) {
                case "1": {
                    System.out.print("Your rock ");
                    int result = rock.outcome(computersChoice);
                    int score = processRound(result, computersChoice);
                    playersScore += score;
                    computersScore += (result == -1) ? 1 : 0;
                    break;
                }
                case "2": {
                    System.out.print("Your paper ");
                    int result = paper.outcome(computersChoice);
                    int score = processRound(result, computersChoice);
                    playersScore += score;
                    computersScore += (result == -1) ? 1 : 0;
                    break;
                }
                case "3": {
                    System.out.print("Your scissors ");
                    int result = scissors.outcome(computersChoice);
                    int score = processRound(result, computersChoice);
                    playersScore += score;
                    computersScore += (result == -1) ? 1 : 0;
                    break;
                }
                case "4": {
                    System.out.print("Your Lizard ");
                    int result = lizard.outcome(computersChoice);
                    int score = processRound(result, computersChoice);
                    playersScore += score;
                    computersScore += (result == -1) ? 1 : 0;
                    break;
                }
                case "5": {
                    System.out.print("Your Spock ");
                    int result = spock.outcome(computersChoice);
                    int score = processRound(result, computersChoice);
                    playersScore += score;
                    computersScore += (result == -1) ? 1 : 0;
                    break;
                }
                case "x":{
                    System.out.println("Do you really want to end the game? y/n ");
                    String choice = scanner.next();
                    if(choice.equals("y"))
                        end = true;
                    break;
                }
                case "n":{
                    System.out.println("Do you really want to reset the game? y/n ");
                    String choice = scanner.next();
                    if(choice.equals("y")) {
                        playersScore = 0;
                        computersScore = 0;
                    }
                    break;
                }
                default:{
                    System.out.println("Wrong input");
                    continue;
                }
            }

            System.out.println("Current score");
            System.out.println(playerName + " : " + playersScore);
            System.out.println("Computer : " + computersScore);
            System.out.println("===============");

            if(playersScore == numberOfRounds) {
                System.out.println(playerName + " wins!");
                showResults(playersScore, computersScore);
                end = true;
                stats();
            }else if(computersScore == numberOfRounds) {
                System.out.println("Computer wins! ");
                showResults(playersScore, computersScore);
                end = true;
                stats();
            }
        }
    }
}
