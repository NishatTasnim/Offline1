package testcar;

/**
 * Created by Nishat on 18-Sep-2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;

    public Car(String name, String manufacturer, Driver driver, int fuelCapacity) {
        this.name = name;
        this.driver = driver;
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getName() {
        return this.name;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public void refuel(int miles) {
        this.fuelCapacity += miles;
    }

    public void drive(int miles) {
        if (fuelCapacity >= miles) {
            fuelCapacity -= miles;
        } else {
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void print(){
        System.out.println(name + " Manufacturer: " + manufacturer + " Driver: " + driver.getName() + " FuelCapacity: " + fuelCapacity);
    }
}
