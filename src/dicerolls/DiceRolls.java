/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerolls;

/**
 * Dice are rolled and the outcome of each roll is counted.
 */

import java.util.Scanner;
import java.util.Random;

public class DiceRolls {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSides, numDice, numRolls;
        Random rand = new Random();
        int outcome;

        System.out.println("How many sides? ");
        numSides = input.nextInt();

        System.out.println("How many dice? ");
        numDice = input.nextInt();

        /* prompt user for number of rolls */
        System.out.print("How many rolls? ");
        numRolls = input.nextInt();

        int[] outcomes = new int[numSides * numDice + 1];		//array with indices 0 through 12

        /* roll dice and add up outcomes */
        for (int roll = 0; roll < numRolls; roll++) {
            outcome = (numDice * (rand.nextInt(numSides)) + 1);
            outcomes[outcome] += 1;
        }

        /* show counts of outcomes */
        for (int i = numSides; i <= (numSides * numDice); i++) {
            System.out.println(i + ": " + outcomes[i]);
        }
    }
}
