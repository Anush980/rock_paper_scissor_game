import java.util.Scanner;
import java.util.Random;
public class Main {  //change Main to the name of your file

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(0=rock|1=paper|2=scissor):");
        int sc_num = sc.nextInt();
       Random rand=new Random();
           int rand_num = rand.nextInt(3);
       // System.out.println(rand_num); used for checking if the project is working properly
           if (rand_num==sc_num ){
               System.out.println("Its a tie.");
           }
           else if (rand_num==0 && sc_num==1){

            System.out.println("you won bro");
           }
           else if (rand_num==0 && sc_num==2){

               System.out.println("you lose bro");
           }
           else if (rand_num==1 && sc_num==0){

               System.out.println("you won bro");
           }
           else if (rand_num==1 && sc_num==2){

               System.out.println("you won bro");
           }
           else if (rand_num==2 && sc_num==0){

               System.out.println("you won bro");
           }
           else if (rand_num==2 && sc_num==1){

               System.out.println("you lose bro");
           }
           else{
            System.out.println("you violated the rules of this game.");
               System.out.println("you must enter inclusive " +
                       "digit from 0 to 2");
        }
    }
}
