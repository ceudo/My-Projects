//Game: Find the coin in the cup
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Game_coin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        String name=sc.nextLine();
        String capital_name=capital(name);
        System.out.println("Hey "+capital_name+" do you want to play a game?");
        boolean check=true;
        while(check){
            String answer=sc.nextLine().toLowerCase();
            switch(answer){
                case"yes" -> {
                    System.out.println("Ok, let's play find the coin under the cup!");
                    check=false;
                }
                case"no" -> {
                    System.out.println("Scared, I understand Goodbye!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Try again! Type Yes or No.");
                    check=true;
                }
            }
        }
        ArrayList<String> cups=new ArrayList<>(Arrays.asList("[","]","[","]","[","]"," "));
        String coin="0";
        System.out.println(coin+" - This is the coin.");
        System.out.println("These are the cups!");
        for(String cup: cups){
            System.out.print(cup);
        }
        Random rand=new Random();
        // Index of the coin
        int cp=rand.nextInt(cups.size());
        if(cp%2==0){
            cp=cp+1;
        }
        for(int i=cups.size()-1;i>=cp;i--){
            cups.set(i,cups.get(i-1));
        }
        cups.set(cp,coin);
        System.out.println("\nGuess which cup is the coin in? (1,2 or 3)");
        check=true;
        while(check){
            int guess=sc.nextInt();
            if(guess==1){
                if(cp==1){
                    System.out.println("You got the right cup!");
                    check=false;
                }
                else{
                    System.out.println("You got the wrong cup, try again!");
                }
            }
            else if(guess==2){
                if(cp==3){
                    System.out.println("You got the right cup!");
                    check=false;
                }
                else{
                    System.out.println("You got the wrong cup, try again!");
                }
            }
            else if(guess==3){
                if(cp==5){
                    System.out.println("You got the right cup!");
                    check=false;
                }
                else{
                    System.out.println("You got the wrong cup, try again!");
                }
            }
            else if(guess>3){
                System.out.println("Please enter 1, 2 or 3!");
            }
        }
        for(String cup:cups){
            System.out.print(cup);
        }   
    }
    public static String capital(String name){
        name=name.toLowerCase();
        String capital_name;
        capital_name = name.substring(0,1).toUpperCase()+name.substring(1, name.length());
        return capital_name;
    }
}
