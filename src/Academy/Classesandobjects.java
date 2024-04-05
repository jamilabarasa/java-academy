package Academy;

public class Classesandobjects {

    /*
    OOP
    Object-oriented programming
    procedural programming is about writing procedures or methods that performs operations on data
    while object Oriented programming is about creating objects that has both data and methods
    Classes and Objects are the main aspect in OOP
    class is a templates for objects / blueprint for creating objects
    an objects is an instance of a class
    when an object is created ,it inherits all variables and methods from the class
    Java is an Object-oriented,everything in java is associated with classes and objects along with its attributes and methods
    attributes are variables within a class
    For example in real life,a car is an object and has attributes such as color,weight and methods such as drive and brake
     */


    /*
    example of a class
    public class Main{
    int x = 5;
    //code
    }
    to create the instance/object of the above class,we write the class name followed by name and keyword new

    Main myObj = new Main();
    myObj.x; ..accessing the variable

    you can create multiple objects of one class
    Main myObj1 = new Main(); --object 1
    Main myObj2 = new Main(); --object 2
    Main myObj3 = new Main(); -- object 3
     */


    /*
    attributes are variables within a class
    you can access attributes by creating object of a class and using the . syntax
     Main myObj = new Main();
    System.out.println(myObj.x);

    to modify or override attribute:
    myObj.x = 40; //sets the value of x to 40

    if you don't want ability to override existing attributes declare the attribute as final.
    final int x = 10;
    final keyword is always useful when you want the variable to always store the same value i.e PI(3.14159...)
    the final keyword is called a modifier
     */
}
