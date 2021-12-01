package game;

public interface Choice {
    int outcome(Choice opponentsChoice);
    String getName();
}
