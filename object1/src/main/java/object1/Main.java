package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person1 = new Person("John", 30, 165);
        Person person2 = new Person("Dan", 40, 170);
        Person person3 = new Person("Sue", 30, 159);

        Person[] people = new Person[10]; // an array of 10 Person objects
        people[0] = person1;
        people[1] = person2;
        people[2] = person3





    }
}
