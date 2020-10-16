import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.print("salary : ");
        System.out.print("$");
        Scanner scsal = new Scanner (System.in);
        float salary = scsal.nextFloat();

        System.out.print("merit : ");
        Scanner scmer = new Scanner (System.in);
        int merit = scmer.nextInt();

        if(salary < 500 || salary > 899 || merit < 0){
            System.out.println("Invalid salary and/or merit points!");
            System.exit(1);
        }
        else{ 
            if (salary >= 500 && salary < 600){     //Confirmed C range
                System.out.println("Grade C");
            }
            else if (salary >= 600 && salary < 650){    //Check between B and C
                if(merit < 10)
                    System.out.println("Grade C");
                else
                    System.out.println("Grade B");
            }
            else if (salary >= 650 && salary < 800){    //between normal B range
                if (salary < 700)       //Confirmed B range
                    System.out.println("Grade B");
                else{           //Check between A and B
                    if(merit < 20)
                        System.out.println("Grade B");
                    else
                        System.out.println("Grade A");
                }
            }
            else{
                System.out.println("Grade A");
            }
        }


        scsal.close();
        scmer.close();
    }
}