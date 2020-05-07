import java.util.Scanner;

public class AkilliCihaz {

    private boolean basariliGiris = false;
    private int secim = 0;

    public void basla()
    {
       basariliGiris = KullaniciDogrulama.getInstance().giris();
       while (basariliGiris)
       {
           System.out.println("1-Sıcaklığı Görüntüle");
           System.out.println("2-Soğutucuyu Aç");
           System.out.println("3-Soğutucuyu Kapat");
           System.out.println("4-Çıkış Yap");

           Scanner in = new Scanner(System.in);
           secim = in.nextInt();
           switch (secim)
           {
               case 1:
                   Publisher p = new Publisher();
                   SicaklikGoruntu s = new SicaklikGoruntu(p);
                   break;
               case 2:
                   SogutucuyuAcma.getInstance().SogutucuyuAc();
                   break;
               case 3:
                   SogutucuyuKapatma.getInstance().SogutucuyuKapat();
                   break;
               case 4:
                   basariliGiris = false;
                   break;
               default:
                   System.out.println("Lütfen geçerli bir rakam giriniz.");
                   break;
           }
       }

       System.out.println("Çıkış Yapılıyor...");
    }
}
