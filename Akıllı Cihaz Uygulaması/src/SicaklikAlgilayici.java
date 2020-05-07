import java.util.Random;

public class SicaklikAlgilayici implements  IObserver{

    public void update() {
        Random rand = new Random();
        int sicaklik = rand.nextInt(15) + 15;
        System.out.print(sicaklik);
        System.out.println();
    }
}
