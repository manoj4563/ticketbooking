package src;
import src.screen;
import java.util.*;
public class Booking   {
    List<String> movie_name=new ArrayList<>();
    {
        movie_name.add("raayan");
        movie_name.add("deadpool");
        movie_name.add("kurangupedal");
    }
    public Scanner scanner=new Scanner(System.in);
    public void  ticketBooking(){
        boolean ch=true;
        while(ch){
            System.out.println("enter the movie name for booking");
            System.out.println("Raayan");
            System.out.println("Deadpool");
            System.out.println("Kurangupedal");
            String str = scanner.nextLine();
            str.toLowerCase();
            if(movie_name.contains(str)){
                screen s =new screen(str);
                s.screentype();
            }
            else{
                System.out.println("sorry we don't screening the movies but we have these superhit movies");
                System.out.println("Raayan");
                System.out.println("Deadpool");
                System.out.println("Kurangupedal");
                System.out.println("till if you not satisfy with these movies please enter the 0 to exit else enter 1 to continue");

                int decide = scanner.nextInt();
                if(decide==0){
                    ch=false;
                    break;
                }
                else{
                    ch=true;
                }
                ch=true;
            }
        }

    }
}
