import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value");
int n= sc.nextInt();
double val = 0.00;
for(int i=1;i<=n;i++)
{
val+=1.00/i;
System.out.println(val);
}
System.out.println("nth value is = "+val);
}
}
