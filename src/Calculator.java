import java.util.Scanner;

interface Math { int calculate(int x, int y);}

class Add implements Math {
    @Override
    public int calculate(int x, int y) {return x + y;}
}

class Extraction implements Math {
    @Override
    public int calculate(int x, int y) {return x - y;}
}

class Multiply implements Math {
    @Override
    public int calculate(int x, int y) {return x * y;}
}

class Divide implements Math {
    @Override
    public int calculate(int x, int y) {
        if (x == 0) {
            System.out.println("Bolme islemi icin ilk sayi 0 olamaz.");
            return 0;
        } else if (y == 0) {
            System.out.println("Bolme islemi icin ikinci sayi 0 olamaz.");
            return 0;
        } else {return x / y;}
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while (true) {
            System.out.print("Toplam\"1\"\nCikarma \"2\" \nCarpma \"3\" \nbolme \"4\"\n\nLutfen Secim Yapiniz: ");
            char mathChoise = user.next().charAt(0);

            Math object;

            switch (mathChoise) {
                case '1':
                    object = new Add();
                    break;
                case '2':
                    object = new Extraction();
                    break;
                case '3':
                    object = new Divide();
                    break;
                case '4':
                    object = new Multiply();
                    break;
                default:
                    System.out.println("Gecersiz Islem. Lutfen tekrar deneyiniz");
                    continue;
            }

            System.out.print("Sayi giriniz: ");
            int x = user.nextInt();
            System.out.print("Sayi giriniz: ");
            int y = user.nextInt();

            int result = object.calculate(x, y);
            System.out.println("\nSonuc = " + result);

            System.out.print("\nDevam etmek istiyor musunuz?(E/H): ");
            String continuee = user.next();
            if (!continuee.equalsIgnoreCase("e")) {break;}
        }
        user.close();
    }
}
