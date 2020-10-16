import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        //System.out.println("Enter A, C or D: ");
        Scanner sc = new Scanner (System.in);
        char input = sc.next().charAt(0);

        switch(input){
            case 'A': 
            case 'a':
                System.out.println("Action movie fan");
                break;
            case 'C':
            case 'c':
                System.out.println("Comedy movie fan");
                break;
            case 'D':
            case 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");

        }

        sc.close();
    } 
}