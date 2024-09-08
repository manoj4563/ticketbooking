package src;

import java.util.Scanner;
import src.screen;
public class Availability {
    Scanner scanner =new Scanner(System.in);
    Screen1 s1=new Screen1();
    Screen2 s2=new Screen2();
    Screen3 s3=new Screen3();
    public Availability(){

    }
    public void printseat(){
        System.out.println("enter  movie name");

        String str =scanner.nextLine();
        if(str.equalsIgnoreCase("raayan")){
               s1.printavailabe();
            System.out.println("press enter to exit");
            scanner.nextLine();

        }
        else if(str.equalsIgnoreCase("deadpool")){
            s2.printavailable();
            System.out.println("press enter to exit");
            scanner.nextLine();

        }
        else if(str.equalsIgnoreCase("kurangupedal")){
            s3.printavailable();
            System.out.println("press enter to exit");
            scanner.nextLine();

        }
    }
}


