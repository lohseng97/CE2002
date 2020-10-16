import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        System.out.print("height = ");
        Scanner input = new Scanner (System.in);
        int height = input.nextInt();
        if (height <= 0){
            System.out.println("Error input!!");
        }
        for (int i = 1; i <= height; i++){
            for (int j = i; j >= 1; j--){
                if (j%2 == 1)
                    System.out.print("AA");
                else
                    System.out.print("BB");
            }
            System.out.println("");
        }

        input.close();
    }
}
