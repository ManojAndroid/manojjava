import java.util.*;
class FlipCoin
{
public static void main(String [] arg)
{
Scanner sc=new Scanner(System.in);
Random rn=new Random();
System.out.print("Enter Number For Coin");
int n=sc.nextInt();
int hc=0,tc=0;
for(int i=0;i<n;i++)
{
    if(rn.nextInt(2)==0)
{
     hc++;
}
else
{
    tc++;
}
}
System.out.print("Head Percentage"+(hc/(double)n)*100);
System.out.print("Tail Percentage"+(tc/(double)n)*100);
}
}
