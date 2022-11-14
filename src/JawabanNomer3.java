import java.util.Scanner;

public class Jawaban3 {
    public static void main(String[] args) {
        int n1, n2, hasil = 0;
        boolean KeepPlaying = true;
        Scanner NomorPlatMobil = new Scanner(System.in);
        while(KeepPlaying) {
            System.out.println("Plat K");
            System.out.println("Plat B");
            System.out.println("Plat AB");
            System.out.println("Plat T");
            System.out.println("Plat AD");

            System.out.println("Pilihan Angka");
            int Pilihan = NomorPlatMobil.nextInt();

            switch (Pilihan) {
                case 1:
                    System.out.println("Masukan n1 : ");
                    n1 = NomorPlatMobil.nextInt();
                    System.out.println("masukan n2 : ");
                    n2 = NomorPlatMobil.nextInt();
                    hasil = n1 + n2;
                    System.out.println("hasilnya adalah + hasil");

                    break;

                case 2:
                    System.out.println("Masukan n1 : ");
                    n1 = NomorPlatMobil.nextInt();
                    System.out.println("Masukan n2 : ");
                    n2 = NomorPlatMobil.nextInt();
                    hasil = n1 + n2;
                    System.out.println("hasilnya adalah" + hasil);
                    break;

                case 3:
                    System.out.println("Masukan n1 : ");
                    n1 = NomorPlatMobil.nextInt();
                    System.out.println("masukan n2 : ");
                    n2 = NomorPlatMobil.nextInt();
                    hasil = n1 + n2;
                    System.out.println("hasilnya adalah + hasil");
                    break;

                case 4:
                    System.out.println("Masukan n1 : ");
                    n1 = NomorPlatMobil.nextInt();
                    System.out.println("masukan n2 : ");
                    n2 = NomorPlatMobil.nextInt();
                    hasil = n1 + n2;
                    System.out.println("hasilnya adalah + hasil");
                    break;

                case 5:
                    System.out.println("Masukan n1 : ");
                    n1 = NomorPlatMobil.nextInt();
                    System.out.println("masukan n2 : ");
                    n2 = NomorPlatMobil.nextInt();
                    hasil = n1 + n2;
                    System.out.println("hasilnya adalah + hasil");

                case 6:
                    if(hasil % 2 == 0) {
                        System.out.println("ini merupakan bilangan genap");
                    } else {
                        System.out.println("Ini merupakan bilangan ganjil");
                    }

                default:
                    System.out.println("true or false");
            }
        }
    }
}

