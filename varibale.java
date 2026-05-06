/*
A variable is a named memory location used to store data values that can be changed during program execution in Java.

Types of varibales :
1)local varibale
-> A local variable is a variable declared inside a method and is accessible only within that method. It must be initialized before use.

2) instance varibale
-> An instance variable is declared inside a class but outside methods and is accessed using an object. It gets a default value if not initialized.

*/



public class varibale {
    int number = 33;// instance variable

void display(){
    int Num = 33; // inside method local varibale
    System.out.println("number : " + number);
    System.out.println("Num : " + Num);
}

public static void main(String[] args) {
    varibale obj = new varibale();
    obj.display();
}

}
