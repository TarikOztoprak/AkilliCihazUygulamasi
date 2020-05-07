public class SogutucuyuKapatma {
        private static SogutucuyuKapatma instance;

        public static synchronized SogutucuyuKapatma getInstance() {
            if (instance == null)
                instance = new SogutucuyuKapatma();
            return instance;
        }

        private  void SogutucuyuKapatma(){}

        public void SogutucuyuKapat() {
            System.out.println("Merkezi İşlem Birimi'ne istek iletiliyor..");
            MerkeziIslemBirimi.getInstance().EyleyiciyiKapat();
        }
}


