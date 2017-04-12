package com.BridgeLabz.Basics;


import java.util.*;
class Power
{
  public static void main(String [] arg)
    {
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Power length");
       int n=sc.nextInt();
       int p=2;
        for(int i=0;i<n;i++)
         {
          if(p>=0&&p<32)
          {     
           System.out.print(p+" ");
             p=p*2;
         }
         }
        }
   }
             
         
