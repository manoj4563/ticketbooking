package src;

import java.util.Scanner;

public class screen  {
    Screen1 s1;
    Screen2 s2;
    Screen3 s3;
    private  String movie_name;
    public screen(String name){
        this.movie_name=name;

    }
    public Scanner s11 =new Scanner(System.in);
   public void screentype(){
       if(movie_name.equalsIgnoreCase("raayan")){
           s1=new Screen1(movie_name);
           s1.book();
           System.out.println("enter yes to view seat");
           String s=s11.next();
           if(s.equals("yes")){
               System.out.println("enter yourname");
               String str= s11.next();;
               s1.viewseat(str);
           }

       }
       else if (movie_name.equalsIgnoreCase("deadpool")) {
           s2=new Screen2(movie_name);
           s2.book();
           System.out.println("enter yes to view seat");
           String s=s11.next();
           if(s.equals("yes")) {
               System.out.println("enter yourname");
               String str = s11.next();

               s2.viewseat(str);
           }
       }
       else{
           s3=new Screen3(movie_name);
           s3.book();
           System.out.println("enter yes to view seat");
           String s=s11.next();
           if(s.equals("yes")) {
               System.out.println("enter yourname");
               String str = s11.next();

               s3.viewseat(str);
           }
       }
   }
}
