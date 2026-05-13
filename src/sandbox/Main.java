package sandbox;

import java.util.Scanner; // Scanner = object that allows taking user input ("cin>>")
/*
nextBoolean() 	Reads a boolean value from the user
nextByte() 	    Reads a byte value from the user
nextDouble() 	Reads a double value from the user
nextFloat() 	Reads a float value from the user
nextInt() 	    Reads a int value from the user
nextLine()   	Reads a String value from the user
nextLong()  	Reads a long value from the user
nextShort() 	Reads a short value from the user
 */
public class Main {

    int transferVar = 9;
    //like in cpp, methods are created above the main
    //static implies that it's a method of class sandbox.Main, and not an object, void is the output type
    //methods get passed parameters, but are called with arguments
    static void myMethod(/*params*/){
        System.out.println("This is my first method! They are what you would call a subprogram/function in C++");

    }

    static int myMethod2(int a, int b) {
        return (a>b? a : b);
    }

    static void main() { //starting place of all Java programs
        // what's inside main will be executed, like int main()

        System.out.println("Hello Java"); //prints, moving the next /O on the next line
        System.out.print("AP CS A PREP\n"); // cout <<

        //System = built-in Java class
        //out = member of System class
        //println() = print line method from System class

        // variables
        // Primitive = simple value stored directly in memory (stack)
        // int double char boolean
        // Reference = memory address (stack) that points to the data (heap)
        // string array object


        Scanner myObj = new Scanner(System.in); //Create scanner object
        System.out.print("Enter username: ");
        String username = myObj.nextLine(); // read user input

        if(username.length() > 8)
            System.out.println("username " + username + " is too long!");

        int age;
        System.out.print("Enter age: ");
        age = myObj.nextInt(); //reads int input [X][Y] + [\n]
        //nextLine() reads the \n as part of the string to close it, so there are no leftovers, but Int leaves the \n after entering
        //so the nextLine() are nextInt/nextDouble will become just the leftover \n
        //solution: add a nextLine() to absorb the \n
        myObj.nextLine(); // flushes the leftover \n

        System.out.print("Are you a student? (yes/no) ");
        String answer = myObj.nextLine(); //will take input just fine
        boolean isStudent = answer.equalsIgnoreCase("yes"); // .toLowerCase().equals()

        // ternary + concatenation + string methods on user input -> not necessary, but cool nonetheless
        System.out.println((isStudent)? username + " ("+ age + ") " + "is a student" : username + " ("+ age + ") " +  "is NOT a student");
        // idea, assign "NOT" to false or "" to true for a Student string variable decided by isStudent, and concat it to a basic output "is Student a student"
        String Student = " ";
        if(answer.equalsIgnoreCase("no")) Student = " NOT ";
        System.out.println(username + " ("+ age + ") " + "is" + Student+ "a student");
        //again, not too practical, but a cool idea, and pretty good beginner practice on I/O and variables


        double temp_C, temp_F;
        temp_C = age;
        temp_F =  (1.8 * temp_C + 32);
        System.out.println("temp Celsius: " + temp_C + " and temp Fahrenheit: " + temp_F);

        boolean isFahrenheitOver70 = temp_F > 70;
        // Ternary works the same -> good
        System.out.println(isFahrenheitOver70? "Fahrenheit is over 70!" : "Fahrenheit is NOT over 70!");


        final int year = 2026; // final is the keyword for constants

        //we add f and d at the end of float and double numbers to indicate their ending decimals
        float x = 9.99f;
        double y = 10.02d;

        //Math
        int a = 20;
        int b = 40;
        System.out.println(Main.myMethod2(a, b) + " " +  Math.min(a, b)  +  " " + Math.sqrt(y) +  " " + Math.abs(-4.7) + " " + Math.pow(2, 3));
        //Math.pow() always returns a double

        // More methods
        // Math.round(x) -> rounds to the nearest integer
        // Math.ceil(x) -> rounds up, Math.floor(x) -> rounds down, these return doubles
        // Math.random(); returns a random number between [0.0, 1.0), double type
        // to use it for random nr from [0, n] we use "int random = (int)(Math.random() * (n+1));"

        /*
        break = stop the loop completely.
        continue = skip this round, but keep looping.
        */
        String[] cars = new String[4]; // array of strings, size 4
        //new keyword makes an empty array with space for a fixed number of elements

        int[][] myNumbers = { {1, 4 ,2}, {6, 7 ,8}}; // 2 row matrix
        System.out.println(myNumbers[1][2]); // name[row][column]  outputs 8 in this eg

        myMethod();
        System.out.println(myMethod2(2*a, (int)(Math.sqrt(b)*y)));

        myObj.close(); // good practice
    }

}
