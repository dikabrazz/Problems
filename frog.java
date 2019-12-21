import java.util.ArrayList;

public class frog {
    //трудоемкость кочек
    static int[] a = {10, 50, 5, 6};
    static int[] b = {40, 100, 200, 8};

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int NumOfPoints = 3;


        //double LenOfWay = Math.pow(2,NumOfPoints-1);
        ArrayList<String> Ways = new ArrayList<String>();
        for (int i = (int) Math.pow(2, NumOfPoints - 2); i < Math.pow(2, NumOfPoints); i++) {
            String NewWay = Integer.toBinaryString(i);
            if (!(NewWay.contains("00"))) { //не берем слишком "разрывные" маршруты
                if (NewWay.length() < NumOfPoints) {
                    NewWay = "0" + NewWay; // доводим маршрут до стандартного размера
                }

                Ways.add(NewWay);


            }
        }
        int MinWeight = WeightOfWay(Ways.get(0));
        for (String s : Ways) {
            if (WeightOfWay(s) < MinWeight) {
                MinWeight = WeightOfWay(s);
            }
            //System.out.println(s+"  "+WeightOfWay(s));
//строчкой выше можно полюбоваться на все возможные маршруты и их нагруженность
        }

        System.out.println(MinWeight);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " milliseconds");


    }

    public static int WeightOfWay(String s) {
        int WeightOfWay = 0;
        s = s + '1';
        int i = 0;
        char str[] = s.toCharArray();
        while (i < s.length()) {
            if (str[i] == '0') {
                WeightOfWay = WeightOfWay + b[i];
                i = i + 2;
            } else {
                WeightOfWay = WeightOfWay + a[i];
                i++;
            }
            // System.out.println(WeightOfWay);
        }
        return WeightOfWay;
    }
}