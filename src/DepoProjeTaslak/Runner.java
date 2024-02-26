package DepoProjeTaslak;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        DepoMethods depo = new DepoMethods();
        Scanner scanner = new Scanner(System.in);

        boolean devam = true;
        while (devam) {
            System.out.println("\n1. Ürün Ekle");
            System.out.println("2. Ürün Sil");
            System.out.println("3. Ürünleri Listele");
            System.out.println("4. Ürünü Rafa Koy");
            System.out.println("5. Ürün Çıkışı Yap");
            System.out.println("6. Çıkış");

            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Ürün ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ürün İsmi: ");
                    String isim = scanner.nextLine();
                    System.out.print("Üretici Firma: ");
                    String firma = scanner.nextLine();
                    System.out.print("Ürün Miktarı: ");
                    int miktar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ürün Birimi: ");
                    String birim = scanner.nextLine();
                    System.out.print("Raf Numarası (Varsayılan: A-1): ");
                    String raf = scanner.nextLine();
                    UrunPojoClass urun = new UrunPojoClass(id, isim, firma, miktar, birim, raf);
                    depo.urunEkle(urun);
                    break;
                case 2:
                    System.out.printf("Silinecek Ürün ID: ");
                    int silinecekID = scanner.nextInt();
                    depo.urunSil(silinecekID);
                    break;
                case 3:
                    depo.urunleriListele();
                    break;
                case 4:
                    System.out.printf("Rafa koyulacak ürün ID: ");
                    int rafaKoyID = scanner.nextInt();
                    scanner.nextLine(); // Dummy line
                    System.out.printf("Raf Numarası: ");
                    String rafNo = scanner.nextLine();
                    depo.urunuRafaKoy(rafaKoyID, rafNo);
                    break;
                case 5:
                    System.out.printf("Çıkış yapılacak ürün ID: ");
                    int cikisID = scanner.nextInt();
                    scanner.nextLine(); // Dummy line
                    System.out.printf("Çıkış miktarı: ");
                    int cikisMiktar = scanner.nextInt();
                    depo.urunCikisiYap(cikisID, cikisMiktar);
                    break;
                case 6:
                    devam = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }

        scanner.close();
    }
}
