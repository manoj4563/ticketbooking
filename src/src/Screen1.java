package src;

import java.util.*;

public class Screen1 extends Screenoverall {

    public static int [][]seats1=new int[17][17];
    Scanner scanner=new Scanner(System.in);

    public Screen1(){

    }
    private String movie_name;
    public Screen1(String str){
        System.out.println(str);
        this.movie_name=str;
    }



   public static  Map <String,List<Seatnumber>> map=new HashMap<>();
    protected void viewseat(String name){
        if (map.containsKey(name)) {
            List<Seatnumber> seats = map.get(name);
            System.out.println("Seats for movie: " + name);
            for (Seatnumber seat : seats) {
                System.out.println("Seat: Row " + seat.i + ", Column " + seat.j+""+seat.Movie_name);
            }
            System.out.println("press enter to exit");
            scanner.nextLine();
        } else {
            System.out.println("No seats found for " + movie_name);
            System.out.println("press enter to exit");
            scanner.nextLine();
        }
    }
    public void printavailabe(){
        printavailable(seats1);
    }
    public void book(){

        int count =Isfull(seats1);

        if(count==0){
            System.out.println("the seats are filled better luck next time");

        }
        else{

            printavailable(seats1);
            System.out.println("press enter to booking");
            scanner.nextLine();
            System.out.println("enter the total number of seats required");
            int seatcount=scanner.nextInt();
            scanner.nextLine();
            if(seatcount<=count){
                System.out.println("enter your name");
                String name =scanner.nextLine();
                map.put(name,new LinkedList<>());
                for(int i=0;i<seats1.length;i++){
                    for(int j=0;j<seats1[i].length;j++){
                        if(seats1[i][j]==0 && (i!=5 && i!=11)){
                            if(seatcount>0){
                                seats1[i][j]=1;
                                System.out.println(i+""+j);
                                seatcount--;
                                map.get(name).add(new Seatnumber(i,j,movie_name));

                            }
                        }
                    }
                }
                System.out.println("your seats hasbeen booked");
                System.out.println("press enter to exit");
                scanner.nextLine();

            }
            else{
                System.out.println("soory we does not contain that much amount of seats");
                System.out.println("press enter to exit");
                scanner.nextLine();
            }
        }
    }


}
