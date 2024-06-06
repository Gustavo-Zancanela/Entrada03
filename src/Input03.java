
import java.util.Scanner;


class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
           Scanner sc = new Scanner(System.in);
           System.out.println("digite três números com espaços entre eles: ");
          int num1, num2, num3;
           
           num1 = sc.nextInt();
           num2 = sc.nextInt();
           num3 = sc.nextInt();
           
        //Find and print the sum of three integers entered by the user
        
            int total = num1 + num2 + num3;
            System.out.println(total);
      
        
        //Remember to close the Scanner
        sc.close();
    }
}
