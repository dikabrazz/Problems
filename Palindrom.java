public class Palindrom {
    public static void main (String[] args) {
        String s = "abcb";
        String substring = "";


        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                substring = s.substring(j, j + i);
            }

            if (IsPalindrom(substring)) {
                break;
            }
        }
        System.out.println(substring);
    }
    public static boolean IsPalindrom (String s) {
        boolean stringIsPalindrom = true;
        int index = 0;
        while ((stringIsPalindrom) && (index < s.length()/2)) {
           if (s.charAt(index) != s.charAt(s.length()-index-1)) {
               stringIsPalindrom = false;
            }
           index++;
        }
        return stringIsPalindrom;
    }
}
