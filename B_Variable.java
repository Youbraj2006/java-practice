
/*
A variable is a named memory location used to store data values that can be changed during program execution in Java.

Types of variable :
1)local variable
-> A local variable is a variable declared inside a method and is accessible only within that method. It must be initialized before use.

2) instance variable
-> An instance variable is declared inside a class but outside methods and is accessed using an object. It gets a default value if not initialized.

*/



public class B_Variable {
   int number = 33; // instance variable

    void display() {
        int Num = 33; // local variable
        System.out.println("number : " + number);
        System.out.println("Num : " + Num);
    }

    public static void main(String[] args) {
        B_Variable obj = new B_Variable();
        obj.display();
    }
}
>>>>>>> 12e3d332351821a7491234c2fbdf7b780ad1ab6e
