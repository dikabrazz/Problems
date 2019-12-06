
public class seq {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long[] Nums = {1,13,8,67,80};
        long MaxOfNums = 0;
        for (long i:Nums) {
            if (i%2 !=0){
                if (i>MaxOfNums) {
                    MaxOfNums = i;
                }
            }
        }
        System.out.println(MaxOfNums);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " milliseconds");


    }
    }

