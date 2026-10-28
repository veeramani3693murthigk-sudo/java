import java.util.*;
public class Main47
{
public static void main(String[] args)
{
String s="care";
String t="race";
char arr[]=s.toCharArray();
char arr2[]=t.toCharArray();
Arrays.sort(arr); 
Arrays.sort(arr2);
String s1=new String(arr);
String s2=new String(arr2);
System.out.println(s1.equals(s2));
}

}


