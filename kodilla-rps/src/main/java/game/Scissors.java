package game;

public class Scissors implements Choice {

    private int wins;
    private int draws;
    private int loses;

    public Scissors(){
        this.wins = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public int outcome(Choice opponentsChoice){
        if(opponentsChoice instanceof Paper || opponentsChoice instanceof Lizard) {
            wins++;
            return 1;
        }else if(opponentsChoice instanceof Scissors) {
            draws++;
            return 0;
        }else {
            loses++;
            return -1;
        }
    }

    public void showResults(){
        System.out.println("Your scissors won: " + wins);
        System.out.println("Your scissors drew: " + draws);
        System.out.println("Your scissors lost: " + loses);
    }

    public String getName() {
        return "Scissors";
    }
}
