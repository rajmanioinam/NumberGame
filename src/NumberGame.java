import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        int randomNumber = (int)(Math.random()*100) + 1;
        boolean hasWon = false;
        System.out.println("I have chosen a random number between 1 and 100.");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);
        for(int i=10; i>0;i--){
            System.out.println("You have " + i + " guess(es) left.");
            int guess = scanner.nextInt();
            if(guess > randomNumber){
                System.out.println("It's smaller than " + guess);
            }
            else if(guess < randomNumber){
                System.out.println("It's greater than " + guess);
            }
            else{
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Correct!!");
            System.out.println("You win!!");
        }
        else {
            System.out.println("Game Over!!");
            System.out.println("You Lose!!");
            System.out.println("The number was " + randomNumber);
        }
    }
}
