package object1;

import org.w3c.dom.ls.LSOutput;

import java.util.logging.Logger;

public class Main {
    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alex", 25, 150);

        System.out.println(person2.height);

        Car car1 = new Car("Toyota","Prius",2006, 100098);
        Car car2 = new Car("Honda","Civic",2010, 2008959);
        Car car3 = new Car("Nissan","Pathfinder",2015,5678997);

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        Chair chair1 = new Chair("Wood","Brown",4);
        Chair chair2 = new Chair("Metal","Black",4);
        Chair chair3 = new Chair("Plastic","Red",4);

        Chair[] chairs = new Chair[3];
        chairs[0] = chair1;
        chairs[1] = chair2;
        chairs[2] = chair3;

        Dog dog1 = new Dog("Simba",12,"Poodle");
        Dog dog2 = new Dog("Bella",20,"Mutt");
        Dog dog3 = new Dog("Charlie",35,"Bulldog");

        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;


        Person[] people = new Person[10]; // an array of 10 Person objects
    }

}
