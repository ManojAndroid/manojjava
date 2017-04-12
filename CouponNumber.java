package com.BridgeLabz.Basics;

import java.util.*;
class CouponNumber
{
   public static void main(String [] args)
   
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Total  Number of Coupon"); 
        int size=sc.nextInt();
        int i,j=0;
        int count=0;
        double a[]=new double[size];
        while(j<a.length)
         {
          double n=Math.random();
            for(i=0;i<a.length;i++)
               {
                if(a[i]!=n)
                  {
                    count++;
                   a[j]=n;
                    j++;
                     break;
                   }
                }
              }
             for(int k=0;k<a.length;k++)
             {
              System.out.println(a[k]);
              }
              System.out.print("Total Distinct Random Number Is  " +count);
  }
}
           
