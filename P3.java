import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.print("starting: ");
        Scanner start = new Scanner (System.in);
        int stanum = start.nextInt();

        System.out.print("ending: ");
        Scanner end = new Scanner (System.in);
        int endnum = end.nextInt();

        System.out.print("increment: ");
        Scanner inc = new Scanner (System.in);
        int incnum = inc.nextInt();

        if(stanum > endnum)
            System.out.println("Error input!!");
        else{
            System.out.println("For loop: ");
            
            String toPad = "S$";
            String padded = String.format("%10s", toPad);
            System.out.println("US$" + padded);
            
            String empty = "-";
            System.out.println(empty.repeat(13));
            
            for (int i = stanum; i <= endnum ; i += incnum){
                double forex = i * 1.82;
                empty = " ";
                System.out.println(i + empty.repeat(9) + forex);
            }

            System.out.println("While loop: ");

            toPad = "S$";
            padded = String.format("%10s", toPad);
            System.out.println("US$" + padded);
            
            empty = "-";
            System.out.println(empty.repeat(13));

            int temp = stanum;

            while (stanum <= endnum){
                double forex = stanum * 1.82;
                empty = " ";
                System.out.println(stanum + empty.repeat(9) + forex);
                stanum += incnum;
            }

            System.out.println("Do-While loop: ");

            toPad = "S$";
            padded = String.format("%10s", toPad);
            System.out.println("US$" + padded);
            
            empty = "-";
            System.out.println(empty.repeat(13));

            stanum = temp;
            do {
                double forex = stanum * 1.82;
                empty = " ";
                System.out.println(stanum + empty.repeat(9) + forex);
                stanum += incnum;
            } while(stanum <= endnum);
        }

        start.close();
        end.close();
        inc.close();
    }
}