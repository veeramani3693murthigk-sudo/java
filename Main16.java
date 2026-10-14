import java.util.Scanner;
public class Main16
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int day=scan.nextInt();
System.out.println("Enter the day:");
switch(day) {
case 1,2,3,4,5 -> System.out.println("weekday");
case 6,7 -> System.out.println("weekend");
default -> System.out.println("Invalid");
}
}
}
