import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Alanını bulmak istediğiniz üçgenin türünü seçiniz:\n1-) Dik üçgen\n2-) Dik olmayan üçgen\nSeçiminiz: ");
        int secim = input.nextInt();
        if (secim == 1) {
            double kenar1, kenar2, hipotenus, alan, cevre;
            System.out.print("\nÜçgeninizin 1. dik kenarının uzunluğunu(cm) giriniz: ");
            kenar1 = input.nextDouble();
            System.out.print("Üçgeninizin 2. dik kenarını uzunluğunu(cm) giriniz: ");
            kenar2 = input.nextDouble();
            hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
            System.out.printf("Üçgeninizin hipotenüs uzunluğu: " + "%.2f" + " cm", hipotenus);
            cevre = kenar1 + kenar2 + hipotenus;
            alan = (kenar1 * kenar2) / 2;
            System.out.printf("\nÜçgeninizin çevresi: " + "%.2f" + " cm", cevre);
            System.out.printf("\nÜçgeninizin alanı: " + "%.2f" + " cm^2", alan);
        } else if (secim == 2) {
            double kenar1, kenar2, kenar3, cevre, u, alan;
            System.out.print("\nÜçgeninizin 1. kenarının uzunluğunu(cm) giriniz: ");
            kenar1 = input.nextDouble();
            System.out.print("Üçgeninizin 2. kenarının uzunluğunu(cm) giriniz: ");
            kenar2 = input.nextDouble();
            System.out.print("Üçgeninizin 3. kenarının uzunluğunu(cm) giriniz: ");
            kenar3 = input.nextDouble();
            cevre = kenar1 + kenar2 + kenar3;
            u = cevre / 2;
            alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
            System.out.printf("\nÜçgeninizin çevresi: " + "%.2f" + " cm", cevre);
            System.out.printf("\nÜçgeninizin alanı: " + "%.2f" + " cm^2", alan);
        } else System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz!");
    }
}

