package java8Logical_20;
import java.util.Arrays;

public class ShiftZerosToLeftJava8 {

    public static void main(String[] args) {
    
    
    	  int[] a = {10, 4, 8, 0, 9, 14, 55, 0, 7, 0, 2, 0};

          // Move zeros to the left using Java 8 streams
          int[] resultArray = moveZerosToLeft(a);

          // Display the input and output arrays
          System.out.println("Input Array: " + Arrays.toString(a));
          System.out.println("Output Array: " + Arrays.toString(resultArray));
      }

      // Function to move zeros to the left using Java 8 streams
      private static int[] moveZerosToLeft(int[] array) {
          int[] resultArray = Arrays.stream(array)
                  .boxed()
                  .sorted((a, b) -> a.equals(0) ? -1 : b.equals(0) ? 1 : 0)
                  .mapToInt(Integer::intValue)
                  .toArray();
          return resultArray;
    
    }
}

