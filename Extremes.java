import java.util.Scanner;
public class Extremes{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("How many numbers will you enter: ");
int howMany = input.nextInt();

System.out.print("Enter a number 1: ");
int number = input.nextInt();

int maximum = number;
int minimum = number;

for(int count = 2; count <= howMany; count++){
System.out.print("Enter number " + count + " :");
number = input.nextInt();

if(number < minimum) {
minimum = number;
}
if (number < maximum) {
maximum = number;
}
}
System.out.println("Minimum: " + minimum );
System.out.println("Maximum: " + maximum );
System.out.println("Sum of two extremes: " + (minimum + maximum) );

}
}
