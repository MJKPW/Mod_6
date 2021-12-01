package game;

public class Spock implements Choice{

    private int wins;
    private int draws;
    private int loses;

    public Spock(){
        this.wins = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public int outcome(Choice opponentsChoice){
        if(opponentsChoice instanceof Rock || opponentsChoice instanceof Scissors) {
            wins++;
            return 1;
        }else if(opponentsChoice instanceof Spock) {
            draws++;
            return 0;
        }else {
            loses++;
            return -1;
        }
    }

    public void showResults(){
        System.out.println("Your spock won: " + wins);
        System.out.println("Your spock drew: " + draws);
        System.out.println("Your spock lost: " + loses);
    }

    public String getName() {
        return "Spock";
    }
}
