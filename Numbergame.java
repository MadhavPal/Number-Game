import java.util.Scanner;
import java.lang.Math;
class Numbergame
{
    public static void main(String[] args)
    {
        int c=0;
        System.out.println("Number Game");
        System.out.println("In this game, a random number is generated, so you have to guess the number and depending upon your guess, computer will give you some feedback and you have only three attempt to win this  game");
        int a=(int)(Math.random()*(5-1+1)+1); 
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
           int n=sc.nextInt();
           if(n==a)
           {
            System.out.println("Guess is correct,try next attempt");
            a=(int)(Math.random()*(100-1+1)+1);
            c++;
           }
           else if(n>=(a-5) && n<=(a+5))
           {
            System.out.println("Guess is too high,try again");
           }
           else
           {
            System.out.println("Guess is too low,try again");
           }
        }
        System.out.println("Number of attempts taken by user are 3 and the round win "+c);
    }
}