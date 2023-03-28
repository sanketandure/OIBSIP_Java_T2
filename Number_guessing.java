import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Number_guessing {
    int min_num=1;
    int max_num=50;
 
    public int getUserGuessNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("***************");
        System.out.print("Guess the number : ");
        int Guess=input.nextInt();  
        return Guess;
        
    }
    public int getNumByComputer(){
        return ThreadLocalRandom.current().nextInt(min_num,max_num+1);
    }

    public void number_guessing(){
        boolean UserGuessCorrect=false;
        int guessNum=0;

        int computerNum=getNumByComputer(); 

        while(! UserGuessCorrect){
            int userNum=getUserGuessNumber();
            if(userNum > computerNum){
                System.out.println("Try Lower Number \n");
            }else if(userNum < computerNum ){
                System.out.println("Try Higher Number \n");
            }else if(userNum == computerNum){
                System.out.println("\n*****************");
                System.out.println("Congratulations! Your Guess is Correct!");
                UserGuessCorrect=true;
            }
            guessNum++;       
        }
        System.out.println("You found the number in "+ guessNum +" guesses");
        System.out.println("******************");
    }

    public static void main(String args[]){
        
        Number_guessing game= new Number_guessing();
        game.number_guessing();
    }
}