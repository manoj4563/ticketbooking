//package collection.src;
package src;

import java.util.Scanner;

public class ViewMyTicket {
    Scanner sc = new Scanner(System.in);
    Screen1 screen1=new Screen1();
    Screen2 screen2=new Screen2();
    Screen3  screen3=new Screen3();

    public ViewMyTicket(){

    }
    public void ticketcheck(){
        System.out.println("enter the movie name ");
        String movie_name=sc.next();
        sc.nextLine();
        System.out.println("enter your ticket name");
        String name=sc.nextLine();
        if(movie_name.equalsIgnoreCase("raayan")){
            screen1.viewseat(name);
        }
        else if(movie_name.equalsIgnoreCase("deadpool")){
            screen2.viewseat(name);
        }
        else if(movie_name.equalsIgnoreCase("kurangupedal")){
            screen3.viewseat(name);
        }

    }
}
