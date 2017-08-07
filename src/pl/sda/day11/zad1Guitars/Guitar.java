package pl.sda.day11.zad1Guitars;

/**
 * Created by RENT on 2017-07-11.
 */
public class Guitar {
    private static int numberOfguitars = 0; // tworzymy statyczne pole

    private String model;
    private int price;
    private int serialNumber;

    public Guitar(String model, int price) {
        this.model = model;
        this.price = price;
        serialNumber = ++numberOfguitars;

    }

    public void play() {
        System.out.println("Brzdęk!!!");
    }


    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
