public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    return;
  }
  /*
  mergesort(data,lo,hi):
    if lo >= hi :
      return
    mergesort left side
    mergesort right side
    merge
  */
  //You can make arrays as temporary space if you wish! This is the easier method, but will be a bit slower.

  /*If you want to make it faster:
  Have your mergesort take both the data and temp arrays. Mergesort the temp, and merge into the original!
  e.g.
      private static void mergesort(int[]data, int[]temp, int lo, int hi){}
  Pre-allocate a temp array in your mergesort wrapper method, and copy the data into it.
  */

  /* Write a version of insertion sort that works on a sub-array, similar to merge and quicksort?
e.g.
insertionsort(data, lo, hi)

The insertion sort is n^2, but has a low constant.


Improve both your quicksort and your mergesort by using the insertion sort when you sub-array is sufficiently small.
You can determine the best size to switch to insertion sort by experimentation.

I will run your merge + quick again after you improve them.
Improvements are ONLY improvements if all test cases passed. */

  public static void insertionsort(int[] data,int lo,int hi){
    for(int x=lo+1;x<hi;x++){
      for(int y=0;x-y>lo && data[x-y]<data[x-1-y];y++){
        int hold=data[x-y];
        data[x-y]=data[x-1-y];
        data[x-1-y]=hold;
      }
    }
  }











}
