public class SogutucuyuAcma {
    private static SogutucuyuAcma instance;

    public static synchronized SogutucuyuAcma getInstance() {
        if (instance == null)
            instance = new SogutucuyuAcma();
        return instance;
    }

    private SogutucuyuAcma() {}
    public void SogutucuyuAc()
    {
        System.out.println("Merkezi İşlem Birimi'ne istek iletiliyor..");
        MerkeziIslemBirimi.getInstance().EyleyiciyiAc();
    }
}
