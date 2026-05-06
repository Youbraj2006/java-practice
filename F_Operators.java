/*
1) Arithmetic Operator (+ - * % /)
2) Assigemet operator (+= -= *= %= /=)
3)  Relational Operators (== != > < >= <=)
4) Logical Operators (&& || !)
5) Increment / Decrement Operators+ (++  --)
6) Bitwise Operators(& | ^ ~ << >>)
7) Ternery Operator (? :)
*/
public class F_Operators {
    
void Arithmetic(){
    int a = 12;
    int b = 2;
    System.out.println(a % b);
}
void Assignemet(){
    int a = 12;
     a+= 3;
     System.out.println(a);
}
void Relational(){
    int age = 16;
    if(age < 18){
System.out.println("Not allowed");
    }
    else{
        System.out.println("allowed");
    }
}
 void Logical(){
    int a = 8 , b = 4, c = 14;
    if(a > b|| a > c){
        System.out.println("first number is greater");
    }
    else {
    System.out.println("a is not the greatest number");
}
 }

 void Increment(){
    int a = 12;
    a++;
    System.out.println(a);
 }

 void Bitwise(){
    int a = 5;
System.out.println(a << 1);
 }

 void Ternery(){
    int a = 12;
    int b = 11;
    boolean result = (a > b) ? true: false;
    System.out.println(result);
 }

 public static void main(String[] args) {
    F_Operators obj = new F_Operators();
    obj.Arithmetic();
    obj.Assignemet();
    obj.Relational();
    obj.Logical();
    obj.Increment();
    obj.Bitwise();
    obj.Ternery();

 }
}

