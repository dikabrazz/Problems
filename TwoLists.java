import java.util.ArrayList;

public class TwoLists {
    public static  void main(String[] args) {
        long startTime = System.currentTimeMillis();
        byte[] ListOfNum1 = {2, 4, 3, 9};
        byte[] ListOfNum2 = {5, 6, 9};
int SumOfTwo = Integer.parseInt(IntoString (ListOfNum1)) + Integer.parseInt(IntoString (ListOfNum2));

       // System.out.println(SumOfTwo);
        ArrayList<Byte> ListOfSum = new ArrayList<>();

        while (SumOfTwo > 0) {
           ListOfSum.add((byte)(SumOfTwo % 10));
           SumOfTwo = SumOfTwo / 10;
        }
        for (int digit : ListOfSum) {
            System.out.print(digit+"<--");
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println(endTime - startTime + " milliseconds");


    }

    public static String IntoString(byte[] ListOfNum) {
        String StringOfNum = "";
        for (int digit : ListOfNum) {
            StringOfNum = digit + StringOfNum;
        }
        return StringOfNum;
    }
}