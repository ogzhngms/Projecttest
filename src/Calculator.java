import java.util.Scanner;

interface Math {
    int calculate(int x, int y);
}

class Add implements Math {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}

class Multip implements Math {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}

class Div implements Math {
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

            Math object;

            switch (mathchoise) {
                case '1':
                    object = new Add();
                    break;
                case '2':
                    object = new Multip();
                    break;
                case '3':
                    object = new Div();
                    break;
                default:
                    System.out.println("Gecersiz Islem. Lutfen tekrar deneyiniz");
                    continue;
            }

            System.out.print("Sayi giriniz: ");
            int x = kullanici.nextInt();
            System.out.print("Sayi giriniz: ");
            int y = kullanici.nextInt();

            int result = object.calculate(x, y);

            System.out.println("\nSonuc = " + result);

            System.out.print("\nDevam etmek istiyor musunuz?(E/H): ");
            String devam = kullanici.next();
            if (!devam.equalsIgnoreCase("e")) {
                break;
            }
        }
        kullanici.close();
    }
}
