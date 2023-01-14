import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scan.nextBoolean();

        if (loan == true){
            System.out.println("What is your credit score?");
            int score= scan.nextInt();
            if (score < 600){
                System.out.println("Not eligible");
            }if (score>=600 && score<700){
                System.out.println("Maybe eligible");
            }if (score>700 && score<=800) {
                System.out.println("Eligible");
            }if (score >800){
                System.out.println("Definitely eligible");
            }


        }else {
            System.out.println("Unknown");
        }

        }











        }




