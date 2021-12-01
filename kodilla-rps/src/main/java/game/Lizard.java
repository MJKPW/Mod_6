package game;

public class Lizard implements Choice{
    private int wins;
    private int draws;
    private int loses;

    public Lizard(){
        this.wins = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public int outcome(Choice opponentsChoice){
        if(opponentsChoice instanceof Paper) {
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
        System.out.println("Your lizard won: " + wins);
        System.out.println("Your lizard drew: " + draws);
        System.out.println("Your lizard lost: " + loses);
    }

    public String getName() {
        return "Lizard";
    }
}
