package com.BridgeLabz.Basics;



class SumOf3NumZero
{
  public static void main(String [] arg)
{
 int a[]={1,2,-3,1,5,6};
   for(int i=0;i<a.length-2;i++)
       {
        for(int j=i+1;j<a.length-1;j++)
         {
           for(int k=j+1;k<a.length;k++)
             {
               if(a[i]+a[j]+a[k]==0)
                 {
                   System.out.print(a[i]+"+"+a[j]+"+"+a[k]+" ="+0);
                  
                 }
             }
           }
            System.out.println();
        }
        
     }
}
