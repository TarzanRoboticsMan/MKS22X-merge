import java.util.Arrays;
public class Driver{

  public static void main(String[]artie){
    /*
    java Driver 10000 test
    java Driver 1000000 test
    time java Driver 10000
    time java Driver 20000
    time java Driver 40000
    time java Driver 80000
    */
    int arraySize = Integer.parseInt(artie[0]);

    int[] randish = new int[arraySize];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }

    if(artie[1].equals("test")){
      int[] randishTrue = Arrays.copyOf(randish,randish.length);
      Arrays.sort(randishTrue);
      Merge.insertionsort(randish,0,arraySize);

      if( Arrays.equals(randish,randishTrue)){
        System.out.println("Insertion Correct!");
      }
      else{
        System.out.println("Insertion Incorrect");
      }
    }
    else{
      Merge.insertionsort(randish,0,arraySize);
    }
  }
}
