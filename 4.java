import java.util.*;
class Main
{
static int power(int num,int p)
{
if(p == 0)
return 1;
for(int i=1;i<p;i++)
num*=2;
return num;

}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(args[0]);
if(n<31){
for(int i=0;i<=n;i++)
{
System.out.println("2^"+i+"="+power(2,i));
}
}
else
System.out.println("power must be less than 31");
}
}
