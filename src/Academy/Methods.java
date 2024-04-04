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
    a method calls itself to solve smaller instances of the same problem
    the function keeps calling itself until a certain condition is met
    function keeps calling itself with smaller values i.e (n-1) until base condition is met i.e n reaches 0
    if the recursion method has a call stack,meaning it has an operation and the return depends on the operation
    it will reach the halting condition/base case (stopping condition) and unwind doing the operation as it goes up
    the call stack,each return value is used to calculate the final result as it is popped off the call stack as
    the recursion unwinds.

     */

    /*
    the sum method calculates the sum of numbers from 1 to n using recursion.
     */
    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    /*

    In the example of sum(5), the calculation occurs as the recursive calls are completed and the results are propagated back up the call stack. Here's how it unfolds:

    sum(5) calls sum(4) and adds 5 to the result.
    sum(4) calls sum(3) and adds 4 to the result.
    sum(3) calls sum(2) and adds 3 to the result.
    sum(2) calls sum(1) and adds 2 to the result.
    sum(1) calls sum(0) and adds 1 to the result.
    sum(0) returns 0.

Now, as the recursive calls start to complete, the calculation occurs:

    sum(0) returns 0.
    sum(1) returns 1 + 0 = 1.
    sum(2) returns 2 + 1 = 3.
    sum(3) returns 3 + 2 = 5.
    sum(4) returns 4 + 5 = 9.
    sum(5) returns 5 + 9 = 14.

The final result, 14, is the sum of numbers from 1 to 5, calculated as the recursive calls unwind and the results are combined.
     */


    //recursion method to calculate fibonacci
    //f(n) = f(n-1) + f(n-2)

    public static int fibonacciNum(int num) {

        if (num <= 1) {
            return num;
        }
        return fibonacciNum(num - 1) + fibonacciNum(num - 2);
    }

    /*
    recursion to calculate factorial
    n! = n * n-1 * n-2 * .... 1
    n! = n * (n-1)!
    example factorial 5 is :
    5! = 5 * 4!
   = 5 * 4 * 3!
   = 5 * 4 * 3 * 2!
   = 5 * 4 * 3 * 2 * 1!
   = 5 * 4 * 3 * 2 * 1
   = 120
     */

    public static int factorial(int num) {
        /*
        the base case is the smallest value for which the factorial is well-defined and known. Typically, the base case for the factorial function is when the input n is 0 or 1.
         */
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);

    }










}
