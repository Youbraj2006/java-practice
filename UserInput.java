import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter the first number : ");
      int a = input.nextInt();
      System.out.print("enter the second number : ");
      int b = input.nextInt();

    System.out.print("sum is : "+ (a+b));
input.close();;

input.close();
    }
}

