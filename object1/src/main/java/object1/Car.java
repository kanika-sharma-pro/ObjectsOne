public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

     /*public static void main(String[] args) {
        Car car1 = new Car("Toyota","Prius",2006, 100098);
        Car car2 = new Car("Honda","Civic",2010, 2008959);
        Car car3 = new Car("Nissan","Pathfinder",2015,5678997);

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;*/

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}