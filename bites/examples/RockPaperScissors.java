package bites.examples;

import java.util.HashMap;

public class RockPaperScissors {
    static HashMap<String, HashMap<String,Integer>> rules;

    static {
        // Setup map for when player 1 selects rock
        HashMap<String,Integer> rock_rules = new HashMap<String, Integer>();
        rock_rules.put("rock", 0);     // Draw as both select rock
        rock_rules.put("paper", 2);    // Player 2 wins: paper covers rock
        rock_rules.put("scissors", 1); // Player 1 wins: rock crushes scissors
        // Setup map for when player 1 selects paper
        HashMap<String,Integer> paper_rules = new HashMap<String, Integer>();
        paper_rules.put("rock", 1);     // Player 1 wins: paper covers rock
        paper_rules.put("paper", 0);    // Draw as both select paper
        paper_rules.put("scissors", 2); // Player 2 wins: scissors cut paper
        // Setup map for when player 1 selects scissors
        HashMap<String,Integer> scissors_rules = new HashMap<String, Integer>();
        scissors_rules.put("rock", 2);     // Player 2 wins: rock crushes scissors
        scissors_rules.put("paper", 1);    // Player 1 wins: scissors cut paper
        scissors_rules.put("scissors", 0); // Draw as both select scissors
        // Setup rules based on what player 1 selects
        rules = new HashMap<String, HashMap<String, Integer>>();
        rules.put("rock", rock_rules);
        rules.put("paper", paper_rules);
        rules.put("scissors", scissors_rules);
    }

    public static String play( String player1, String player2 ) {
        Integer result = rules.get(player1).get(player2);
        if (result == 0) {
            return "Draw";
        } else if (result == 1) {
            return "Player 1 wins";
        } else {
            return "Player 1 loses";
        }
    }


    public static void main( String[] args ) {
       System.out.println("Player 1 rock, Player 2 paper: " + RockPaperScissors.play("rock", "paper"));
       System.out.println("Player 2 rock, Player 1 paper: " + RockPaperScissors.play("paper", "rock"));
       System.out.println("Player 1 scissors, Player 2 paper: " + RockPaperScissors.play("scissors", "paper"));
       System.out.println("Player 2 scissors, Player 1 paper: " + RockPaperScissors.play("paper", "scissors"));
       System.out.println("Player 1 scissors, Player 2 rock: " + RockPaperScissors.play("scissors", "rock"));
       System.out.println("Player 2 scissors, Player 1 rock: " + RockPaperScissors.play("rock", "scissors"));
       System.out.println("Player 1 rock, Player 2 rock: " + RockPaperScissors.play("rock", "rock"));
       System.out.println("Player 1 paper, Player 2 paper: " + RockPaperScissors.play("paper", "paper"));
       System.out.println("Player 1 scissors, Player 2 scissors: " + RockPaperScissors.play("scissors", "scissors"));
    }
}
