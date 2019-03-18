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
}
