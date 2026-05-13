package sandbox;

public class OOP {
    int x = 4;
    String user;

    /* ----- NESTED CLASSES ----- */
    /*
    we can have nested classes in a single file
    if a child class doesn't need anything from its parent class, we can make it static. This way it becomes much cleaner, and we avoid syntax like:
    OOP.BankAccount alice = oop.new BankAccount(100);
    */
    public static class BankAccount { //used in lines 118 - 124

        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    /* ----- CONSTRUCTORS ----- */
    /*
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes.
    The constructor name must match the class name, and it cannot have a return type (like void).

    A constructor's job is to make sure that the moment an object comes into existence, it's already in a usable, valid state.
    Not half-built. Not empty. Ready to go.
    Constructors can be overloaded.

    NOTE: public BackAccount (line 18) is a constructor
    Building on that example we can showcase the utility of constructors
    */

    public static class BankAccount2{ // used in lines 127 - 139
        private double balance2;
        final private String owner;
        final private String currency;

        public BankAccount2(String owner, double initialBalance, String currency){
            if(initialBalance < 0) {
                throw new IllegalArgumentException("Balance can't be negative!");
            }
            this.owner = owner; //this.owner = the field "owner", owner = the parameter "owner"
            //looks confusing, but long story short this.sth points to a field of the class, easier to grab than typing the full class name
            this.balance2 = initialBalance;
            this.currency = currency;
        }
        public void deposit(double amount) {
            balance2 += amount;
        }

        public double getBalance() {
            return balance2;
        }
    }

    /* ----- ENCAPSULATION ----- */
    /*
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
    */
    public static class Person { // used in lines 158 - 162
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

    /* ----- OBJECTS, ATTRIBUTES AND METHODS ----- */
    static void main(){
        // In Java, an object is created from a class. After defining a class, you can create objects from it using the new keyword:
        OOP myObj = new OOP();
        OOP myObj3 = new OOP();
        System.out.println(myObj.x);
        Main myObj2 = new Main();
        System.out.println(myObj2.transferVar);

        //In Java, variables declared inside a class are called "attributes"/"fields".

        //Modifying
        myObj.user = "rramond"; // modifying
        myObj.x = 40; // overriding
        // z cant be overridden. the final keyword is called a "modifier"
        myObj2.transferVar = myObj2.transferVar + 2; // 11
        System.out.println("variable modifications are exclusive to the object where they were changed " + myObj.x + ", " + myObj3.x);
        // x remains 4 for myObj3, but changes for myObj

        /*
        we can call methods using objects, and this brings differences as opposed to calling it directly (static)

                            myMethod()                           myObj.myMethod()
        Belongs to          The class itself                     a specific instance (the obj)
        Has access to       Only the arguments                   The object's own fields (this.varible, etc)
        Variability         One version, the one written         One version/obj, each with its own data

        Therefor this becomes very useful when a process (method) needs to be applied to multiple individuals (objects)
        */
        BankAccount alice = new BankAccount(100); // no outer instance needed
        BankAccount bob   = new BankAccount(500);

        alice.deposit(50);
        bob.deposit(200);
        System.out.println("Alice's balance: " + alice.getBalance());
        System.out.println("Bob's balance: " + bob.getBalance());

        // constructor call example
        BankAccount2 john = new BankAccount2("John", 100, "USD");
        System.out.println(john.owner + ", balance:" + john.balance2 + " " + john.currency);
        /*
        Using a constructor, now John is fully built and ready to use

        NOTE: John is not actually an object, he is a variable that points to that object, which is technically the instance in memory created by BankAccount2
        This distinction matters because we can have multiple references pointing to the same object, and changes made through one affect the other.
        So pretty much they are like pointers in C++
         */
        BankAccount2 copy = john; // copy points to the SAME object, not a new one

        copy.deposit(78);
        System.out.println(john.getBalance()); // 178! not 100

        /* ----- MODIFIERS ----- */
        /*
        -> Access Modifiers
        public 	        The code is accessible for all classes
        private 	    The code is only accessible within the declared class
        default 	    The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
        protected 	    The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter

        -> Non-Access Modifiers
        final 	        Attributes and methods cannot be overridden/modified
        static 	        Attributes and methods belong to the class, not to objects. This means all objects share the same static attribute, and static methods can be called without creating objects.
        abstract 	    Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
        transient 	    Attributes and methods are skipped when serializing the object containing them
        synchronized 	Methods can only be accessed by one thread at a time
        volatile 	    The value of an attribute is not cached thread-locally, and is always read from the "main memory"
        */

        Person personObj = new Person();
        //personObj.name = "Dylan"; -> error: name has private access in Person
        //System.out.println(personObj.name);
        personObj.setName("Dylan");
        System.out.println(personObj.getName());
    }
}


