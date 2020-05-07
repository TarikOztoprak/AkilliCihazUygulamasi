public class Eyleyici implements IEyleyici{
    private static int eskiDurum = 2;

    private static Eyleyici instance;

    public static synchronized Eyleyici getInstance() {
        if (instance == null)
            instance = new Eyleyici();
        return instance;
    }

    private Eyleyici() {

    }

    public void SogutucuyuAc(int durumlar){
        if (eskiDurum == durumlar)
            System.out.println("Durum değişmedi beklemede");
        else {
            System.out.println("Soğutucu Açılıyor.");
        }
        eskiDurum = durumlar;
    }

    public void SogutucuyuKapat(int durumlar){
        if (eskiDurum == durumlar)
            System.out.println("Durum değişmedi beklemede");
        else {
            System.out.println("Soğutucu Kapanıyor.");
        }
        eskiDurum = durumlar;
    }

}
