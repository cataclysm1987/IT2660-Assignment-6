import java.io.IOException;
import java.util.Random;

public class Assignment6 {

    public static void main(final String[] args) throws IOException {
        System.out.println("Hello world - this is assignment 6 in Java!");
        System.out.println("Let's create a random list of integers up to 1000.");
        MergeSort sort = new MergeSort();
        int[] mergeArray = new int[100];
        Random rand = new Random(); 
        for (int i = 0; i < 100; i++){
            mergeArray[i] = rand.nextInt(1000); 
            System.out.println(mergeArray[i]);
        }
        System.out.println("Now let's sort and output the result.");
        sort.mergeSort(mergeArray, mergeArray.length);
        for (int i=0; i < mergeArray.length; i++){
            System.out.println(mergeArray[i]);
        }
        System.out.println("That's all. Thanks for joining me!");
    }

}