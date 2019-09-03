import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
String s = "Hello <<UserName>>, How are you?";
String n;
do
{
System.out.println("Enter your name with minimum 3 chars");
n = sc.nextLine();
}while(n.length()<3);
n+=",";
String[] a = s.split("\\s");
System.out.println(a[2]);
for(int i=0;i<a.length;i++)
{
	if(a[i].equals("<<UserName>>,"))
	{
	a[i] = n;
	}
}
System.out.println(String.join(" ",a));
}
}
