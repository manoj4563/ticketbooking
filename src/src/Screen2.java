package src;

import java.util.*;

public class Screen2 extends Screenoverall {
    public static int  [][]seats2=new int[17][17];

    Scanner scanner=new Scanner(System.in);
    Screen1 screen1;
    public Screen2(){

    }

    private String movie_name;
    public Screen2(String str){
        System.out.println(str);
        this.movie_name=str;
    }



    public static Map<String, List<Seatnumber>> map2=new HashMap<>();
    public void viewseat(String name){
        if (map2.containsKey(name)) {
            List<Seatnumber> seats = map2.get(name);
            System.out.println("Seats for movie: " + name);
            for (Seatnumber seat : seats) {
                System.out.println("Seat: Row " + seat.i + ", Column " + seat.j+""+seat.Movie_name);
            }
            System.out.println("press enter to exit");
            scanner.nextLine();
        } else {
            System.out.println("No seats found for movie: " + name);
            System.out.println("press enter to exit");
            scanner.nextLine();
        }
    }
    public  void printavailable(){
        printavailable(seats2);
    }
    public void book(){

        int count =Isfull(seats2);
        if(count==0){
            System.out.println("the seats are filled better luck next time");
            System.out.println("press enter to exit");
            scanner.nextLine();

        }
        else{

            printavailable(seats2);
            System.out.println("press enter to exit");
            scanner.nextLine();
            System.out.println("enter the total number of seats required");
            int seatcount=scanner.nextInt();
            scanner.nextLine();
            if(seatcount<=count){
                System.out.println("enter your name");
                String name =scanner.nextLine();
                map2.put(name,new LinkedList<>());
                for(int i=0;i<seats2.length;i++){
                    for(int j=0;j<seats2[i].length;j++){
                        if(seats2[i][j]==0 && (i!=5 && i!=11)){
                            if(seatcount>0){
                                seats2[i][j]=1;
                                System.out.println(i+""+j);
                                seatcount--;
                                map2.get(name).add(new Seatnumber(i,j,movie_name));

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


