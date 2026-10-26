import java.util.*;
public class Main35
{
public static void main(String[] args) 
{
int[] arr = {7,8,15,17,91,15};
int min=arr[0];
for(int i=arr.length-1;i>=0;i--)
{
min=Math.min(min,arr[i]);
}
System.out.println(min);

}
}

