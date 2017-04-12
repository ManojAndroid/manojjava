package com.BridgeLabz.Basics;
import java.util.*;
class UtilityClass
   {
   public static void main(String []  args)
   {
     UtilitySuperClass s=new UtilitySuperClass();
 
     Scanner sc=new Scanner (System.in);

     String []a={"manoj","singh","akash","ajay"};

        s.startTime();
      
       s.BubbleSort(a);
        s.insertionSort(a);
        s.binarySearch(a);
         
       s.stopTime();
       System.out.print("elapsed time is  :"+ s.elapsedTime());
     }
   }





class UtilitySuperClass
{
 static String[] BubbleSort(String a[])
   {
      char c[]=a.toCharArray();
     
        for (int t=0; t<c.length-1; t++)
        {
           for (int i = 0; i<c.length -1; i++)
           {
               if(t1[i+1].compareTo(t1[1+1])>0)
               {
                  String tempStr = c[i];
                   t1[i] = c[i+1];
                   t1[i+1] = tempStr;
                }
            }

        }

      return t1;
   }
   

   static String[] insertionSort(String a[])
   {
      

    


   }
    

   static String[] binarySearch(String a[],String key )
   {
      
     int first=0;
     int lst=a.length;
     while(first<lst)
      {
       int mid=(first+lst)/2;
         if(key.CompareTo(a[mid])<0)
             {
               lst=mid;
               }
              else if(key.CompareTo(a[mid])<0)
                 {
                      first=mid+1;
                  }
               else
                {
                  return mid;
                }
            }
         }
     static long startTime()
     {
      
     long start= System.nanoTime();
      return start;
     }
 

       static long stopTime()
        {

          long stop = System.nanoTime();
          return stop;

       }
       static long elapsedTime()
       {
          long elapsed=(( stopTime()-startTime())/1000);
          return elapsed;
        }
}

