import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playagain=false;
        int round=1;
        int won=0;
        while(!playagain)
        {
            int computer=(int)(Math.random()*100+1);
            System.out.println("Round "+round);
            System.out.println("I have chosen a number from 1 to 100.You have three chances to guess the number.");
            boolean guessedCorrectly = false;
            for(int chances=1;chances<4;chances++)
            {
                System.out.println("Enter your guessed Number");
                int user = sc.nextInt();
                if(computer<user)
                {
                    System.out.println("Too high!");
                }
                else if(computer>user)
                {
                    System.out.println("Too low!");
                }
                else
                {
                    System.out.println("Correct answer!!! You win.");
                    guessedCorrectly=true;
                    won++;
                    break;
                }
            }
            if (!guessedCorrectly) {
                System.out.println("You lose this round. The correct number was: " + computer);
            }
            System.out.println("Do you want to play again ? (yes/no)");
            String play=sc.next();
            if(play.equals("yes"))
            {
                playagain=false;
                round++;
            }
            else
            {
                playagain=true;
                System.out.println("Total Rounds: "+round);
                System.out.println("Total score: "+won);
                break;
            }
        }
    }
}