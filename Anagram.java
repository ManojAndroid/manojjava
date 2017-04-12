package com.BridgeLabz.Basics;

import java.util.*;
class Anagram
{
   static void checkAnagram(String s,String s1)
    {
       String x=s.replaceAll(" "," ");
       String x1=s1.replaceAll(" "," ");

       boolean status=true;
      if(x.length()!=x1.length())
       {
         status=false;
        }
       else
         {
           char a[]=x.toLowerCase().toCharArray();
           char b[]=x1.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            status=Arrays.equals(a,b);
          }
       
         if(status)
          {
            System.out.print(s+"  and  "+s1+"  is anagram");
           }
          else
           {
             System.out.print(s+"  and "+s1+"  is not anagram");
            }
}
       
  public static void main(String [] arg)
{
    Scanner sc= new Scanner(System.in);
     System.out.print("Enter first String");
       String s=sc.nextLine();
        System.out.print("Enter Second String");
       String s1=sc.nextLine();
        checkAnagram(s,s1);
}
}

