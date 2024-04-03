package Programs;

public class Basics {

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



}
