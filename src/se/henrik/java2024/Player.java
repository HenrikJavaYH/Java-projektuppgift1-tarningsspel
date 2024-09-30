package se.henrik.java2024;

public class Player {
    String name;
    int score;
    int[] rolls;

    public Player(String name, int nbrOfRolls) {
        this.name = name;
        this.rolls = new int[nbrOfRolls];
    }
    String getName() {
        return name;
    }
    int CalculateScore() {
        for(int roll: rolls){
            score = score + roll;
        }

        return score;
    }
}
