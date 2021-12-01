package game;

public class Paper implements Choice {

    private int wins;
    private int draws;
    private int loses;

    public Paper(){
        this.wins = 0;
        this.draws = 0;
        this.loses = 0;
    }

    public int outcome(Choice opponentsChoice){
        if(opponentsChoice instanceof Rock) {
            wins++;
            return 1;
        }else if(opponentsChoice instanceof Paper) {
            draws++;
            return 0;
        }else {
            loses++;
            return -1;
        }
    }

    public void showResults(){
        System.out.println("Your paper won: " + wins);
        System.out.println("Your paper drew: " + draws);
        System.out.println("Your paper lost: " + loses);
    }

    public String getName() {
        return "Paper";
    }
}
