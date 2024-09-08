import java.util.*;
import src.*;

public class Main{
    public static void main(String []args){
        Scanner scanner =new Scanner(System.in);
        boolean ch = true;
        System.out.println("Thanks for choosing our theater");
        while(ch){

            System.out.println("   enter the number of service required");
            System.out.println("   1) Booking");
            System.out.println("   2)Availability ");
            System.out.println("   3)viewMyticket");
            System.out.println("   4) Exit ");
            int service = scanner.nextInt();

                 if(service==1) {
                    Booking booking = new Booking();
                    booking.ticketBooking();
                } else if (service==2) {
                     Availability availability =new Availability();
                     availability.printseat();
                 } else if (service==3) {
                     ViewMyTicket viewmyticket=new ViewMyTicket();
                     viewmyticket.ticketcheck();
                 }


                else{
                    ch=false;
                    break;
            }



        }
    }
}
