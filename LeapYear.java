import java.util.*;
class LeapYear
{
    static int check(int n)
    {
  int count=0;
   while(n>0)
{
   n=n/10;
   count++;
}
return count;
}
public static void main(String [] args)
{
 Scanner sc=new Scanner (System.in);
System.out.print("Enter Four Digit Year");
int n=sc.nextInt();
 int Length=check(n);
   if(Length==4)
     {
     if(n%400==0||(n%4==0&&n%100!=0))
    {
     System.out.print(n+"  is Leap Year");
    }
     else
      {
        System.out.print(n+"  is Not  Leap Year");
     }
}
else
{
 System.out.print(n+"  is not four digit");
}

}
}




