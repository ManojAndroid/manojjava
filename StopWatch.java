package com.BridgeLabz.Basics;

class StopWatch
{
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
