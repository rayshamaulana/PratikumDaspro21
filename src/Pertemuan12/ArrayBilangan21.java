package Pertemuan12;

import java.util.Arrays;

public class  ArrayBilangan21 {
    public static void main(String[] args) {
        int [] bil = new int [4];
        bil[0] = 21;
        bil[1] = 29;
        bil[2] = -1;
        bil[3] = 26;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Bil [" + i + "] = " + bil[i]);
        }
        for (int i : bil) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(bil));
    }
}
