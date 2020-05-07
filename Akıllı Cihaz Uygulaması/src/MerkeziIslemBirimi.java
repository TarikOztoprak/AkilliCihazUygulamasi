public class MerkeziIslemBirimi implements IObserver {
    public void update() {
        System.out.print("Sıcaklık: ");
    }

    private static MerkeziIslemBirimi instance;

    public static synchronized MerkeziIslemBirimi getInstance() {
        if (instance == null)
            instance = new MerkeziIslemBirimi();
        return instance;
    }

    private MerkeziIslemBirimi() {

    }

    public void EyleyiciyiAc()
    {
        System.out.println("Eyleyiciye veri yollanıyor...");
        Eyleyici.getInstance().SogutucuyuAc(1);
    }

    public void EyleyiciyiKapat()
    {
        System.out.println("Eyleyiciye veri yollanıyor...");
        Eyleyici.getInstance().SogutucuyuKapat(2);
    }
}
