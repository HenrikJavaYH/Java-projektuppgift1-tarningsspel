package se.henrik.java2024;

public class Player {
    String name;
    int score;
    int roll1;
    int roll2;

    public Player(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    int CalculateScore() {
        score = roll1 + roll2;
        return score;

    }
}
