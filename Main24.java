import java.util.*;
public class Main24 
{
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scan.nextInt();
for (int i = 1; i <= 5; i++) 
{
System.out.println(n + "*" + i + "=" + (n * i));
}
}
}