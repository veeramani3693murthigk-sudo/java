import java.util.Scanner;
public class Main55 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
 Calculator c = new Calculator();
System.out.print("Enter first number: ");
int a = scan.nextInt();
System.out.print("Enter second number: ");
int b = scan.nextInt();
System.out.println("Addition: " + c.add(a, b));
 System.out.println("Subtraction: " + c.sub(a, b));
 System.out.println("Multiplication: " + c.mul(a, b));
 System.out.println("Division: " + c.div(a, b));
scan.close(); 
}
}
class Calculator 
{
int add(int a, int b) 
{
return a + b;
}
int sub(int a, int b) 
{
return a - b;
}
int mul(int a, int b)
{
return a * b;
}
double div(int a, int b) 
{
return (double) a / b;
}
}
