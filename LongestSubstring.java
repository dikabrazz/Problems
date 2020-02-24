import java.util.HashSet;

public class LongestSubstring {

        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();

            String s = "pwwkew";
            String LongestSubstring="";
            boolean IsLongestSubstring = false;

            for (int i = s.length(); i>0; i--) {
                for (int j = 0; j < s.length() - i + 1; j++) {
                     LongestSubstring = s.substring(j, j + i);
                    if (StringWithoutRepeat(LongestSubstring)) {
                        IsLongestSubstring = true;

                        break;
                    }

                }
                if (IsLongestSubstring) {
                    break;
                }

            }

            System.out.println(LongestSubstring);
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime + " milliseconds");


        }

    public static boolean StringWithoutRepeat(String s) {
        boolean StringWithoutRepeat;
        HashSet<Character> MySet = new HashSet<>();
        for (char symbol:s.toCharArray() ) {
            MySet.add(symbol);

        }

            if (s.length() == MySet.size()) {
                StringWithoutRepeat=true;
            } else {
                StringWithoutRepeat=false;
            }


        return StringWithoutRepeat;
    }
}
