import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter $Stake, $Goal and Number of times to play");
int stake= sc.nextInt();
int goal= sc.nextInt();
int n= sc.nextInt();
int win=0,lose=0;
int bet=0;
for(int i=0;i<n;i++)
{
int c = stake;
while(c > 0 && c < goal)
{
bet++;
if(Math.random() < 0.5)  //loss $1
c--;
else
c++;  //profit $1

}
if(c == goal)
win++;
else
lose++;
}
System.out.println("Wins= "+win+"Percentage of win= "+win*100/n+"Percentage of lose= "+lose*100/n+"Bets= "+bet+"Aveg bets= "+bet/n);
}
}
