public class learn {

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

}
