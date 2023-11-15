package SortLicensePlate;

public class Car implements Comparable<Car> {
    private String licensePlate;
    private String brand;
    private int releaseYear;
    private double price;


    public Car(String licensePlate, String brand, int releaseYear, double price){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.price = price;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                '}';
    }

    @Override
     public int compareTo(Car o) {
        return this.licensePlate.compareTo(o.getLicensePlate());
    }
}
