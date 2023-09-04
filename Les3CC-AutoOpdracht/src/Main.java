import car.Car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        Car bmw = new Car();
        System.out.println("Enter car brand:");
        bmw.setBrand(scanner.nextLine());

        System.out.println("Enter car color:");
        bmw.setColor(scanner.nextLine());

        System.out.println("Enter max speed:");
        bmw.setMaxSpeed(scanner.nextInt());
        scanner.nextLine();

        String licensePlate;
        while (true) {
            System.out.println("Enter license plate (format: 1-XX-111):");
            licensePlate = scanner.nextLine();
            if (licensePlate.matches("[0-9]-[A-Z]{2}-[0-9]{3}")) {
                bmw.setLicensePlate(licensePlate);
                break;
            } else {
                System.out.println("Invalid license plate format. Please try again.");
            }
        }

        System.out.println("Enter car weight:");
        bmw.setWeight(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter car model:");
        bmw.setModel(scanner.nextLine());

        String registrationDate;
        while (true) {
            System.out.println("Enter registration date (format: yyyy-mm-dd):");
            registrationDate = scanner.nextLine();
            SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
            Date date1, date2, date3;
            try {
                date1 = sdformat.parse(registrationDate);
                date2 = sdformat.parse("1980-01-01");
                date3 = sdformat.parse("2024-01-01");
            } catch(ParseException e) {
                System.out.println("Invalid registration date. Please try again.");
                System.out.println("Java Error: " + e);
                continue;
            }
            if (date1.compareTo(date2) > 0) {
                bmw.setRegistrationDate(registrationDate);
                break;
            } else if (date1.compareTo(date2) <= 0 || date1.compareTo(date3) >= 0) {
                System.out.println("Invalid registration date. Please try again.");
            }
        }

        System.out.println("Car info being entered:");
        System.out.println(bmw.getBrand());
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getMaxSpeed());
        System.out.println(bmw.getWeight());
        System.out.println(bmw.getLicensePlate());
        System.out.println(bmw.getRegistrationDate());
    }
}