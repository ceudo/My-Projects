/*Game: Scissors, paper, rock */
import java.util.Scanner;
import java.util.Random;
public class Game_RPS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Ask players name and if player wants to play
        System.out.println("Hi, what is your name?");
        String user_name= sc.nextLine();
        String user_name1=user_name.substring(0,1).toUpperCase();
        String user_name2=user_name.substring(1).toLowerCase();
        String capital_name= user_name1+user_name2;
        int count=1;
        while(count!=0){
            System.out.println("Hi "+ capital_name +", do you want to play a game of scissors, paper, rock?");
            String user_reply=sc.nextLine();
            switch(user_reply.toLowerCase()){
            case "yes" -> {
                System.out.println("Ok, let's play!");
                count=0;
                }
            case "no" -> {
                System.out.println("TOO SCARED? Skill Issue!");
                System.exit(0);
                }
            default -> {
                System.out.println("Type yes or no, silly!");
                count=1;
                }
        }
        }
        while(true){
            System.out.println("Enter your move: ");
            String user_move=sc.nextLine().toLowerCase();
            Random game=new Random();
            String[] move= { "scissors","paper","rock"};
            int size=move.length;
            int random=game.nextInt(size);
            String computer_move=move[random];
            System.out.println(computer_move);
            if(user_move.equals(computer_move)){
                System.out.println("Let's go again!");
            }
            else if(user_move.equals("scissors")){
                if(computer_move.equals("paper")){
                    System.out.println("You win!");
                    break;
                }
                else if(computer_move.equals("rock")){
                    System.out.println("You lose!");
                    break;
                }
            }
            else if(user_move.equals("paper")){
                if(computer_move.equals("rock")){
                    System.out.println("You win!");
                    break;
                }
                else if(computer_move.equals("scissors")){
                    System.out.println("You lose!");
                    break;
                }
            }
            else if(user_move.equals("rock")){
                if(computer_move.equals("scissors")){
                    System.out.println("You win!");
                    break;
                }
                else if(computer_move.equals("paper")){
                    System.out.println("You lose!");
                    break;
                }
            }
            else {
                System.out.println("Try again, spell properly!");
            }
        }
    }
}
