package DepoProjeTaslak;

import java.util.ArrayList;
import java.util.List;

public class DepoMethods {
    private List<UrunPojoClass> urunler;

    // Constructor
    public DepoMethods() {
        this.urunler = new ArrayList<>();
    }

    // Ürün ekleme metodu
    public void urunEkle(UrunPojoClass urun) {
        // Eğer raf numarası ve miktarı belirtilmemişse, default değerleri ata
        if (urun.getRaf() == null || urun.getRaf().isEmpty()) {
            urun.setRaf("A-1"); // Default raf numarası
        }
        if (urun.getUrunMiktari() == 0) {
            urun.setUrunMiktari(0); // Default miktar
        }

        urunler.add(urun);
        System.out.println(urun.getUrunIsmi() + " depoya eklendi.");
    }

    // Ürün silme metodu
    public void urunSil(int urunID) {
        for (UrunPojoClass urun : urunler) {
            if (urun.getUrunID() == urunID) {
                // Eğer ürün miktarı 0 değilse, sadece miktarı sıfırla
                if (urun.getUrunMiktari() != 0) {
                    urun.setUrunMiktari(0);
                }
                System.out.println(urun.getUrunIsmi() + " miktarı sıfırlandı.");
                return;
            }
        }
        System.out.println("Belirtilen ID ile ürün bulunamadı.");
    }

    // Ürünleri listeleme metodu
    public void urunleriListele() {
        for (UrunPojoClass urun : urunler) {
            System.out.println(urun);
        }
    }

    // Ürünü rafa koy metodu
    public void urunuRafaKoy(int urunID, String raf) {
        for (UrunPojoClass urun : urunler) {
            if (urun.getUrunID() == urunID) {
                urun.setRaf(raf);
                System.out.println(urun.getUrunIsmi() + " rafa koyuldu. Raf: " + raf);
                return;
            }
        }
        System.out.println("Belirtilen ID ile ürün bulunamadı.");
    }

    // Ürün çıkışı yap metodu
    public void urunCikisiYap(int urunID, int miktar) {
        for (UrunPojoClass urun : urunler) {
            if (urun.getUrunID() == urunID) {
                int yeniMiktar = urun.getUrunMiktari() - miktar;
                urun.setUrunMiktari(yeniMiktar >= 0 ? yeniMiktar : 0);
                System.out.println(urun.getUrunIsmi() + " çıkışı yapıldı. Yeni miktar: " + urun.getUrunMiktari());
                return;
            }
        }

    }
}
