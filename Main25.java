import java.util.*;
public class Main25
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=1;
int space=n/2;
for(i=0;i<n;i++)
{
for(j=0;j<space;j++)
{
System.out.println(" ");
}
for(int j=0;j<k;j++)
{
System.out.println("*"+" ");
}
k+=i<n/2?2:-2;
space+=i<n/2?-1:1;
System.out.println();
}
}
}






