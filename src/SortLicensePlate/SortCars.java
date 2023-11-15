package SortLicensePlate;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {

    private ArrayList<Car> cars;

    public static void main(String[] args) {
        new SortCars().run();
    }

    private void run() {
        cars = new ArrayList<>();
        cars.add(new Car("CL 89 365", "Ford", 2017, 85000));
        cars.add(new Car("XY 34 567", "Toyota", 2020, 45000));
        cars.add(new Car("LM 78 901", "Honda", 2019, 60000));
        cars.add(new Car("AB 12 345", "Chevrolet", 2022, 70000));
        cars.add(new Car("GH 90 123", "BMW", 2018, 55000));
        cars.add(new Car("YZ 56 789", "Mercedes", 2021, 80000));
        cars.add(new Car("OP 78 901", "Audi", 2017, 75000));
        cars.add(new Car("QR 23 456", "Volkswagen", 2023, 90000));
        cars.add(new Car("ST 67 890", "Hyundai", 2016, 50000));
        cars.add(new Car("UV 89 012", "Kia", 2019, 65000));
        cars.add(new Car("WX 45 678", "Nissan", 2020, 70000));
        cars.add(new Car("CD 01 234", "Ford", 2015, 40000));
        cars.add(new Car("EF 56 789", "Mazda", 2022, 75000));
        cars.add(new Car("IJ 90 123", "Subaru", 2018, 60000));
        cars.add(new Car("KL 34 567", "Lexus", 2021, 85000));
        cars.add(new Car("MN 78 901", "Chrysler", 2017, 70000));
        cars.add(new Car("OP 23 456", "Jeep", 2019, 65000));
        cars.add(new Car("QR 67 890", "Ram", 2020, 80000));
        cars.add(new Car("ST 89 012", "Dodge", 2016, 55000));
        cars.add(new Car("UV 12 345", "Chevrolet", 2023, 95000));
        cars.add(new Car("WX 56 789", "GMC", 2018, 70000));
        cars.add(new Car("YZ 90 123", "Buick", 2021, 85000));
        cars.add(new Car("AB 45 678", "Cadillac", 2017, 90000));
        cars.add(new Car("GH 01 234", "Lincoln", 2019, 75000));
        cars.add(new Car("IJ 56 789", "Tesla", 2022, 100000));
        cars.add(new Car("KL 90 123", "Porsche", 2018, 90000));


        for (Car car : cars){
            System.out.println(car.getLicensePlate() + "  " + car.getBrand());
        }

        Collections.sort(cars);

        System.out.println("----------------");

        for (Car car : cars){
            System.out.println(car.getLicensePlate() + "  " + car.getBrand());
        }
    }


}
