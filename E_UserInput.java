
/*
| Method       | Input Type    |
| ------------ | ------------- |
| nextInt()    | integer       |
| nextFloat()  | decimal       |
| nextDouble() | decimal (big) |
| next()       | single word   |
| nextLine()   | full line     |
| nextLong()   | big integer   |

 */


import java.util.Scanner;
public class E_UserInput {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter the first number : ");
      int a = input.nextInt();
      System.out.print("enter the second number : ");
      int b = input.nextInt();

    System.out.print("sum is : "+ (a+b));
input.close();

    }
}
