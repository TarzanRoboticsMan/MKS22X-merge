import java.util.Arrays;
public class Driver{

  public static void main(String[]artie){
    /*
    java Driver 10000 test
    java Driver 1000000 yeet
    time java Driver 10000 selection
    time java Driver 20000 selection
    time java Driver 40000 selection
    time java Driver 80000 selection
    */
    int arraySize = Integer.parseInt(artie[0]);

    int[] randish = new int[arraySize];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }

    if(artie[1].equals("test")){
      int[] randishTrue = Arrays.copyOf(randish,randish.length);
      Arrays.sort(randish);
      Merge.insertionsort(randishI);

      if( Arrays.equals(randish,randishTrue)){
        System.out.println("Insertion Correct!");
      }
      else{
        System.out.println("Insertion Incorrect");
      }
    }
    else{
      Merge.insertionSort(randish);
    }
  }
}
