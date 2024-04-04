package Programs;

public class BasicPrograms {

    // a program reverse a number
    public static void reverseNumber(int number) {
        //remove the last digit ,by getting the reminder when divided by 10
        //remove the last digit by doing integer division
        //to build the reversed number we are going to do a string concatenation of the last digits
        //lastly convert the string back to integer and print the resukt

        String reversed_number = "";

        // loop through the number removing the last digit and adding it to the string
        while (number > 0) {
            //get the last digit and contact to the string variable
            reversed_number = reversed_number + number % 10;

            //remove the last digit from the number by performing integer division
            number = number / 10;

        }

        //convert String to integer and print the result
        System.out.println(Integer.parseInt(reversed_number));

    }


    //a program to print fibonacci numbers
    public static void fibonacciNumbers(int num){

        //the first fibonacci numbers are 0 and 1
        //to get a nth fibonacci number : f(n) = f(n-1) + f(n-2)
        //so to print all fibonacci number from 0,1 to the nth which is num
        //create a loop that starts counting from 0 to num

        //starting from 3 because we already know the first two fibonacci numbers
        int y = 3;
        int first_fibonacci = 0;
        int second_fibonacci = 1;
        int next_fibonacci = 0;
        System.out.print(first_fibonacci + " ");
        System.out.print(second_fibonacci + " ");

        while (y <= num){
            //firt number will become the second number
            //second numbe will become the previous results
            next_fibonacci = first_fibonacci + second_fibonacci;
            first_fibonacci = second_fibonacci;
            second_fibonacci = next_fibonacci;
            System.out.print(next_fibonacci + " ");
            y++;
        }



    }

    //a program to check whether a number is prime number or not
    public static void checkPrimeNumber(int number) {

        //what is a prime number
        //{odd number is a number has a reminder when divided by 2 and even number has no reminder when divided by 2}
        // prime number is a number that is divided by 1 and itself ,for example 3 ,that means the reminder is 0 when it is divided by 1 or itself

        //loop through the digits from 2{why from 2 ,we cannot divide a number by 0 ,and also we already know this number has to be divided by 1} to numbers/2,
        // inside the loop check if the reminder is 0 when divided by the numbers smaller from half of the number

        //1 is not a prime number ,stop the execution of the function if number is equal to 1
        if (number == 1) {
            System.out.println("It is not a Prime number");
            return;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                System.out.println("It is not a Prime number");
                return;
            }


        }

        //if the loop finishes successfully without breaking(return statement), that means our number has reminders that are not 0
        ///hence the execution will reach this statement since our number is a prime number
        System.out.println("It is a Prime number");

    }

    //a program to swap 2 numbers
    public static void swapTwoNumbers(int a,int b) {
        //to swap two number we need to create a temporary variable to hold one number
        int temp = a;

        a = b;
        b = temp;

        System.out.println("Value of int a is " + a +" and value of int b is " + b );
    }

    //recursion to count down
    public static void countDown(int y){

        if(y <= 0){
            System.out.println("Blast!!!");
            return;
        }

        System.out.println(y);
        countDown(y-1);
    }





    



}
