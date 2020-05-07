public class SicaklikGoruntu {
    ISubject publisher;

    public void setSicaklik(int sicaklik) {
        publisher.notify("{\"Sıcaklık\":"+sicaklik + "}");
    }

    public SicaklikGoruntu(ISubject publisher)
    {
        SicaklikAlgilayici s2 = new SicaklikAlgilayici();
        this.publisher = publisher;
        publisher.attach(MerkeziIslemBirimi.getInstance());
        publisher.attach(s2);
        setSicaklik(0);
    }
}
