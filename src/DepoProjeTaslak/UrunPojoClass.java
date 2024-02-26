package DepoProjeTaslak;
import java.util.Collection;

public class UrunPojoClass {
        private int urunID;
        private String urunIsmi;
        private String ureticiFirma;
        private int urunMiktari;
        private String urunBirimi;
        private String raf;

        // Constructor
        public UrunPojoClass(int urunID, String urunIsmi, String ureticiFirma, int urunMiktari, String urunBirimi, String raf) {
            this.urunID = urunID;
            this.urunIsmi = urunIsmi;
            this.ureticiFirma = ureticiFirma;
            this.urunMiktari = urunMiktari;
            this.urunBirimi = urunBirimi;
            this.raf = raf;
        }


        @Override
        public String toString() {
            return "Urun{" +
                    "urunID=" + urunID +
                    ", urunIsmi='" + urunIsmi + '\'' +
                    ", ureticiFirma='" + ureticiFirma + '\'' +
                    ", urunMiktari=" + urunMiktari +
                    ", urunBirimi='" + urunBirimi + '\'' +
                    ", raf='" + raf + '\'' +
                    '}';
        }

        public Collection<Object> getRaf() {
            return null;
        }

        public void setRaf(String s) {
        }

        public int getUrunMiktari() {
            return 0;
        }

        public void setUrunMiktari(int i) {
        }

        public boolean getUrunIsmi() {
            return false;
        }

        public int getUrunID() {
            return 0;
        }
    }


