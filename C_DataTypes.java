
/*
Data types are classifications that tell a programming language what type of data a variable can store, such as numbers, characters, 
text, or true/false values.

--exmaple----
int age = 21;
char grade = 'A';
boolean isStudent = true;
float height = 5.9f;
double price = 1999.99;
long population = 9876543210L;
byte smallNumber = 100;
short value = 32000;

-------------------------------------------------------------
i) Primitive Data Types
int
char
boolean
float
double
long
byte
short

ii)Non-Primitive Data Types
String
Array
Class
Object

*/


public class C_DataTypes {
    void data(){
        String name = "youbraj thapa";
        int age = 22;
        boolean isStudent = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
    }
        public static void main(String[] args) {
        C_DataTypes obj = new C_DataTypes();
        obj.data();
}

