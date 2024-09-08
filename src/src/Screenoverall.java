package src;

public class Screenoverall {
    public void printavailable(int [][]seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (i == 5 || i == 11) {
                    System.out.print("  *  ");
                } else {
                    System.out.print(seats[i][j]+"  ");
                }
            }
            System.out.println();
        }
    }

    public int Isfull(int [][]seats) {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (i != 5 && i != 11) {

                    if (seats[i][j] == 0) {
                        count++;
                    }
                }


            }
        }
        return (count);
    }
}
