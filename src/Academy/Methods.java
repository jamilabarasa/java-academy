package Academy;

public class Methods {

    /*
    Methods are blocks of code that performs certain actions and only runs when it is called.
    They are also known as functions
    You can pass data to methods ,this data is known as parameters
    We use the methods because ,we can define the code once and use it many times
     */

    static void myMethod() {
        //code to be executed
    }

    /*
    myMethod is the  name of the method
    static means this method  belongs to the main class and not object of the main class
    void means that this method has no a return value
    to call a method ,write the name of the method followed by 2 parentheses () and a semicolon ;
    a method can also be called multiple times
    myMethod();
     */


    //parameters and arguments
    static void myOtherMethod(String fname, String sname) {
        //code to be executed
    }

    /*
    Parameters are variables  defined inside the method name and is used to pass data to the method
    when method is called ,when a parameter is passed to the method ,it is called an argument
    myOtherMethod("jamila","barasa"); jamila,barasa are the arguments
    You can pass as many parameters as you want: multiple parameters

     */

    /*
    return type,void means method does not return anything,
    use primitive data{int,double,char,boolean } to make a method return something
     */
    static int addTwo(int a, int b) {
        return a + b;
    }

    /*
    Method overloading
    it is when multiple methods have the same name but different parameters
     */

    //first method with the same name
    static double addThree(double a, double b, double c) {
        return a + b + c;
    }

    //second method with the same name
    static double addThree(double a, double b) {
        return a + b + 5;
    }

    //third method with the same name
    static double addThree(double a) {
        return a + 8 + 9;
    }


    /*
    Java scope
    In java ,variables can only be used in regions where they are created,this is called a scope
    Method scope : variables defined inside a method will only be accessible inside the method
    Block Scope : block refers to code between the curly brackets , {}
    variables declared inside a block ,will be accessible by the code inside the block,curly brackets
    Block code may exist on its own ,or it may also belong to an if,while,for statements
     */



    /*
    Java Recursion.
    Recursion is the technique of making a function call itself.
    This technique provides a way of breaking down complicated problems into simple problems
    that are easier to solve
     */


}
