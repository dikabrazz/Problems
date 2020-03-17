

public class Mediana {
    public static void main (String[] args)
    {
        long startTime = System.currentTimeMillis();

        final int[] Array1 = {2,4}; int m = Array1.length;
        final int[] Array2 = {1,7,8,9}; int n = Array2.length;
        int[] ArrayResult = new int[m+n];

        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int TemporaryMin = Math.min(Array1[0], Array2[0]);
        while ( index < m + n - 1){
           if ((index1 < m) && (Array1[index1] <= TemporaryMin)) {
               ArrayResult[index] = Array1[index1];
               index1++;
                index++;
               if (index1 < m ) {TemporaryMin = Array1[index1];}
                else {TemporaryMin = Array2[index2];}
           }
           if ((index2 < n) && (Array2[index2] <= TemporaryMin)) {
               ArrayResult[index] = Array2[index2];
               index2++;
               index++;
              if (index2 < n ) { TemporaryMin = Array2[index2];}
              else {TemporaryMin = Array1[index1];}
           }

       }

       ArrayResult[index] = TemporaryMin;
      for (int i : ArrayResult) {
          System.out.print(i + ", ");
      }

        System.out.println("Медиана: " + GetMedianaOfArray(ArrayResult));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " milliseconds");
    }

    static double GetMedianaOfArray (int[] Array) {
        double MedianaOfArray;
        int LengthOfArray = Array.length;
        if (LengthOfArray % 2 == 0) {
            MedianaOfArray = 0.5 * (Array[LengthOfArray / 2 - 1] + Array[LengthOfArray / 2]);

        } else {
            MedianaOfArray = Array[(LengthOfArray - 1) / 2];

        }

        return MedianaOfArray;
    }
}
