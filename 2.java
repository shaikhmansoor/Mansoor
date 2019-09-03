import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter no of time to toss a coin");
int n = sc.nextInt();
int h=0,t=0;
for(int i=0;i<n;i++)
{
double r = Math.random();
System.out.println(r);
if(r < 0.5)
t+=1;
else
h+=1;
}
System.out.println("Tails = "+t*100/(t+h)+"% Heads = "+h*100/(t+h)+"%");
}}
