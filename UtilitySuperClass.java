package com.BridgeLabz.Basics;

class UtilitySuperClass
{
  static string[] BubbleSort(string a[])
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
   

   static string[] insertionSort(string a[])
   {
      




   }
    

   static string[] binarySearch(string a[],String key )
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
      
     long start= System.currentTimeMilis();
      return start;
     }
 

       static long stopTime()
        {

          long stop = System.currentTimeMilis();
          return stop;

       }
       static long elapsedTime()
       {
          long elapsed=(( stopTime()-startTime())/1000);
          return elapsed;
        }



}
}
 
