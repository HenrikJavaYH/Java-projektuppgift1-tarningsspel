package se.henrik.java2024;

import java.util.Scanner;
import java.util.Random;

public class Tarningsspel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Välkommen till tärningsspelet!");
        System.out.println("Regler: Varje spelare kastar två kast med tärningen, högst totalsumma vinner! " +
                "Skriv k och tryck enter för att kasta tärningen ");

        System.out.println("Vänligen skriv in ditt namn spelare 1: ");
        Player p1 = new Player(sc.nextLine());

        System.out.println("Vänligen skriv in ditt namn spelare 2: ");
        Player p2 = new Player(sc.nextLine());

        System.out.println("Varsågod att kasta tärningen " + p1.getName());
        int roll1 = rand.nextInt(6) + 1;
        p1.roll1 = roll1;
        if (sc.nextLine().equals("k") ) {
            System.out.println("Du " + p1.getName() +  " kastade: " + p1.roll1 );
        }
        else {
            System.out.println("Tärningen ramlade nedför bordet, du får 0 poäng på detta kast");
        }
        
        System.out.println("Kasta tärningen igen " + p1.getName());
        int roll2 = rand.nextInt(6) + 1;
        p1.roll2 = roll2;
        if (sc.nextLine().equals("k")) {
            System.out.println("Du " + p1.getName() +  " kastade: " + p1.roll2 );
        }
        else {
            System.out.println("Tärningen ramlade nedför bordet, du får 0 poäng på detta kast");
        }

        System.out.println("Varsågod att kasta tärningen " + p2.getName());
        int roll3 = rand.nextInt(6) + 1;
        p2.roll1 = roll3;
        if (sc.nextLine().equals("k")) {
            System.out.println("Du " + p2.getName() +  " kastade: " + p2.roll1 );
        }
        else {
            System.out.println("Tärningen ramlade nedför bordet, du får 0 poäng på detta kast");
        }
        System.out.println("Kasta tärningen igen " + p2.getName());
        int roll4 = rand.nextInt(6) + 1;
        p2.roll2 = roll4;
        if (sc.nextLine().equals("k")) {
            System.out.println("Du " + p2.getName() +  " kastade: " + p2.roll2 );
        }
        else {
            System.out.println("Tärningen ramlade nedför bordet, du får 0 poäng på detta kast");
        }



        p1.score = p1.CalculateScore();
        p2.score = p2.CalculateScore();
        if (p1.score > p2.score) {
            System.out.println("\n" + "Grattis! Du vann " + p1.getName() + " på poängen " + p1.score);
        }
        else if (p2.score > p1.score) {
            System.out.println("\n" + "Grattis! Du vann " + p2.getName() + " på poängen " + p2.score);
        }
        else {
            System.out.println("\n" + "Det blev oavgjort!");
        }

    }
}
