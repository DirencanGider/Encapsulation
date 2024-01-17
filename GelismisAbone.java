public class GelismisAbone {

    private String abone_isim;
    private int bakiye = 120; // Burada yeni birşey öğrendik. İlk defa verilen bir değere sınır koymuş olduk.
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.abone_isim = isim;

        if (bakiye >= 0 && bakiye <= 120) { //Burada da koşul belirttik. Eğer bakiye 0 altı ve 120 üzeriyse
            this.bakiye = bakiye;           //yukarıdaki bakiye olan 120 değişmesin. Aksi durumda güncel olan gözüksün.
        }
        this.sehir = sehir;
    }
    public void dogalgaz_kullan(int miktar) { //Abone class'ından kopyala-yapıştır yaptık direkt.

        if((this.bakiye - miktar) < 0) {

            System.out.println("Yeterli Bakiye Yok...");

        }
        else {

            this.bakiye -= miktar;

            if (this.bakiye <= 0) {

                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone merkezine giderek kredi yükleyin"
                        + "Kredi Limiti = 120 TL"
                );

            }
            else {
                System.out.println("Yeni Bakiye" + this.bakiye);

            }
        }

    }
    public void bakiye_ogren() { //Abone class'ından kopyala-yapıştır yaptık direkt.
        System.out.println("Bakiye = " + bakiye);
    }

}
