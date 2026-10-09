package Kegabutan;

public class MyTearsRicochet {

    public static void ketik(String teks, int kecepatan)
            throws InterruptedException {

        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i));
            Thread.sleep(kecepatan);
        }

        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println();

        ketik("And I can go anywhere I want", 80);
        Thread.sleep(1000);

        ketik("Anywhere I want, just not home", 80);
        Thread.sleep(1000);

        ketik("And you can aim for my heart, go for blood", 80);
        Thread.sleep(1000);

        ketik("But you would still miss me in your bones", 90);
        Thread.sleep(1000);

        ketik("And I still talk to u", 80);
        Thread.sleep(1000);

        ketik("(when I'm screaming at the sky)", 80);
        Thread.sleep(1000);

        ketik("And when you can't sleep at night", 80);
        Thread.sleep(1000);

        ketik("(you hear my stolen lullabies)", 80);
        Thread.sleep(1000);

        System.out.println();
    }
}
