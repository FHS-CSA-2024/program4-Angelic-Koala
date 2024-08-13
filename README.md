[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/qYxx5TvL)
# Program 4

## Program Description:  
- Assign 4 three-digit number to four different variables.
- Then have the computer sum them and store the sum in a fifth variable.
- Compute the average and store the answer in a sixth variable.
- Print out the results.
- Use the numbers 475, 821, 369, and 562 for your test data.
- Notice the extra space between the word “IS” and the number “2227” and the blank line between the two lines of output.

### Requirements: 
- Read user input data
- Store input data in 4 separate variables
- Store sum in a separate variable
- Store average in a separate variable
- Output average with decimal places
  - Can be more than 2


### Sample Output:
>The sum of the four numbers is 2227
>
>The average of the four numbers is 556.75
>
>My code:
>
>import java.util.Scanner;

public class Project4{
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        int num4;
        int sum;
        double average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number 1 is: ");
        num1 = input.nextInt();
        System.out.println();
        System.out.print("Number 2 is: ");
        num2 = input.nextInt();
        System.out.println();
        System.out.print("Number 3 is: ");
        num3 = input.nextInt();
        System.out.println();
        System.out.print("Number 4 is: ");
        num4 = input.nextInt();
        System.out.println();
        System.out.println();
        
        sum = num1 + num2 + num3 + num4;
        average = (double) sum / 4;
        
        System.out.println("The sum of the four numb ers is: " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is: " + average);
    }
}

//Paste console output below:
/*
Number 1 is: 123

Number 2 is: 456

Number 3 is: 789

Number 4 is: 346


The sum of the four numb ers is: 1714

The average of the four numbers is: 428.5
*/

