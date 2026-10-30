public class Main52
{
public static void main(String[] args)
{
Student s1 = new Student();
s1.name = "veeramani";
s1.language="English";
s1.town="Mannargudi";
s1.age = 19;
s1.department = "CSE";
s1.display();
}
}
class Student
{
String name;
String language;
String town;
int age;
String department;
void display()
{
System.out.println("Name: " + name);
System.out.println("language:" + language);
System.out.println("town: " + town);
System.out.println("Age: " + age);
System.out.println("Department: " + department);
}
}

