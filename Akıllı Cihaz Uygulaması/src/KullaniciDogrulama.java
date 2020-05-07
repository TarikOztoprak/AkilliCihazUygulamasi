import java.sql.*;
import java.util.Scanner;

public class KullaniciDogrulama {

    private static KullaniciDogrulama instance;

    public static synchronized KullaniciDogrulama getInstance() {
        if (instance == null)
            instance = new KullaniciDogrulama();
        return instance;
    }

    private KullaniciDogrulama() {
        //Dışarıdan ulaşılamaz
    }

    public boolean giris() {
        String kullaniciAdi, sifre;

        System.out.println("***********GİRİŞ************");
        Scanner in = new Scanner(System.in);

        System.out.println("Kullanıcı Adı:");
        kullaniciAdi = in.nextLine();

        System.out.println("Sifre:");
        sifre = in.nextLine();

        return veritabaniBaglantisi(kullaniciAdi, sifre);
    }

    private boolean veritabaniBaglantisi(String kullaniciAdi, String sifre) {
        try {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihazVeritabani",
                    "postgres", "258258456456");

            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql = "SELECT * from \"Kullanici\" where \"KullaniciAdi\"=? and \"Sifre\"=?";
            try{
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,kullaniciAdi);
                pst.setString(2,sifre);
                ResultSet rs = pst.executeQuery();

                if(rs.next()){
                    System.out.println("Giriş Başarılı");
                    return true;
                }
                else {
                    System.out.println("Hatalı Giriş...");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            /***** Bağlantı sonlandırma *****/
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
