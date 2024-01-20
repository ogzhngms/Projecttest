import java.util.Scanner;

interface MathOperation {
    int calculate(int x, int y);
}

class Add implements MathOperation {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}

class Multip implements MathOperation {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}

class Div implements MathOperation {
    @Override
    public int calculate(int x, int y) {
        if (x == 0) {
            System.out.println("Bolme islemi icin ilk sayi 0 olamaz.");
            return 0;
        } else if (y == 0) {
            System.out.println("Bolme islemi icin ikinci sayi 0 olamaz.");
            return 0;
        } else {
            return x / y;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);

        while (true) {
            System.out.print("Toplam/cikarma \"1\" \nCarpma \"2\" \nbolme \"3\"\n\nLutfen Secim Yapiniz: ");
            char mathchoise = kullanici.next().charAt(0);

            MathOperation mathOperation;

            switch (mathchoise) {
                case '1':
                    mathOperation = new Add();
                    break;
                case '2':
                    mathOperation = new Multip();
                    break;
                case '3':
                    mathOperation = new Div();
                    break;
                default:
                    System.out.println("Gecersiz Islem. Lutfen tekrar deneyiniz");
                    continue;
            }

            System.out.print("Sayi giriniz: ");
            int x = kullanici.nextInt();
            System.out.print("Sayi giriniz: ");
            int y = kullanici.nextInt();

            int result = mathOperation.calculate(x, y);

            System.out.println("\nSonuc = " + result);

            System.out.print("\nDevam etmek istiyor musunuz?(E/H): ");
            String devam = kullanici.next();
            if (!devam.equalsIgnoreCase("e")) {
                break;
            }
        }
        kullanici.close();
    }
}import java.util.Scanner;

public class Calculator {
    public static void main(String[] argc) {
        Scanner kullanici = new Scanner(System.in);
        while (true) {
            System.out.print("Toplam/cikarma \"1\" \nCarpma \"2\" \nbolme \"3\"\n\nLutfen Secim Yapiniz: ");
            char o = kullanici.next().charAt(0);

            switch (o) {
                case '2':
                    System.out.print("Sayi giriniz: ");
                    int x = kullanici.nextInt();
                    System.out.print("Sayi giriniz: ");
                    int y = kullanici.nextInt();
                    int carpmaSonucu = cx(x, y);
                    System.out.println("\nCarpmaSonuc = " + carpmaSonucu);
                    break;

                case '1':
                    System.out.print("Sayi giriniz: ");
                    int a = kullanici.nextInt();
                    System.out.print("Sayi giriniz: ");
                    int b = kullanici.nextInt();
                    int toplamcikarma = tx(a, b);
                    System.out.println("\nToplamSonuc = " + toplamcikarma);
                    break;

                case '3':
                    System.out.print("Sayi giriniz: ");
                    int d = kullanici.nextInt();
                    System.out.print("Sayi giriniz: ");
                    int c = kullanici.nextInt();
                    int bolme = ax(d, c);
                    System.out.println("\nbolmeSonuc = " + bolme);
                    break;

                default:
                    System.out.println("Gecersiz Islem. Lutfen tekrar deneyiniz");
                    break;
            }
            System.out.print("\nDevam etmek istiyor musunuz?(E/H): ");
            String devam = kullanici.next();
            if (!devam.equalsIgnoreCase("e")) {
                break;
            }
        }
        kullanici.close();
    }
    private static int tx(int say1, int say2)
    {
        return say1 + say2;
    }
    private static int cx(int say1, int say2) {
        return say1 * say2;
    }
    private static int ax(int say1, int say2) {
        return say1 / say2;
    }
}
