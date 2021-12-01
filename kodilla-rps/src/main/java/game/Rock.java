package game;

public class Rock implements Choice {

    private int wins;
    private int draws;
    private int loses;

    public Rock(){
        this.wins = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public int outcome(Choice opponentsChoice){
        if(opponentsChoice instanceof Scissors) {
            wins++;
            return 1;
        }else if(opponentsChoice instanceof Rock) {
            draws++;
            return 0;
        }else {
            loses++;
            return -1;
        }
    }

    public void showResults(){
        System.out.println("Your rock won: " + wins);
        System.out.println("Your rock drew: " + draws);
        System.out.println("Your rock lost: " + loses);
    }

    public String getName() {
        return "Rock";
    }
}
