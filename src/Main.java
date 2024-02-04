import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Best of luck .....!");
        System.out.println("Enter a number between 1 to 100");
        int lowerBound = 0;
        int upperBound = 100;
        System.out.println();

        int guess = random.nextInt(lowerBound, upperBound);
        int guessCount = 0;
        int points = 0;
        int GuessNum;
        boolean flag = false;

        while(guessCount < 7){
            guessCount += 1;
            System.out.printf("Enter the %dst Guess : ", guessCount);
            GuessNum = sc.nextInt();

            if(GuessNum > guess)
                if (GuessNum - guess < 9) {
                    System.out.println("Your Guess is almost there high..!");
                    points += 5;
                } else {
                    System.out.println("Your Guess is too high");
                    points -= 2;
                }

            else if(GuessNum < guess)
                if(guess - guessCount < 9){
                        System.out.println("Your Guess is almost there low..!");
                        points += 5;
                    }
                else {
                        System.out.println("Your Guess is too low");
                        points -= 2;
                    }
            else{
                System.out.println("Congrats You have found the ans in "+guessCount+" steps");
                points += 10;
                flag = true;
                break;
            }
        }
        System.out.println("You Gained "+points+" Points");
        if(!flag){
            System.out.println("The answer is "+guess);
            System.out.println("Better luck next Time");
        }
        else {
            System.out.println("The answer is "+guess);
        }
    }
}