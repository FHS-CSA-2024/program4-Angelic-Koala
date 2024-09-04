//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

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

//Paste console output below:
/*


*/
