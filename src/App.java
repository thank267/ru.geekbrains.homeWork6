import java.util.Arrays;
import java.util.Random;

import animals.Animal;
import animals.Cat;
import animals.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cat barCat = new Cat("Барсик");
        barCat.run(new Random().nextInt(400));
        barCat.swim(new Random().nextInt(20));

        Cat fooCat = new Cat("Дымок");
        fooCat.run(new Random().nextInt(400));
        fooCat.swim(new Random().nextInt(20));

        Dog fooDog = new Dog("Бруно");
        fooDog.run(new Random().nextInt(1000));
        fooDog.swim(new Random().nextInt(20));

        Dog barDog = new Dog("Оскар");
        barDog.run(new Random().nextInt(1000));
        barDog.swim(new Random().nextInt(20));

        Dog bazDog = new Dog("Бобик");
        bazDog.run(new Random().nextInt(1000));
        bazDog.swim(new Random().nextInt(20));

        Animal[] animals = { barCat, fooCat, fooDog, barDog, bazDog};

        System.out.printf("Соревнуются %s животных, из них:\n", Arrays.asList(animals).stream().count());

        System.out.printf("%s котов\n",
            Arrays.asList(animals).stream().filter(el-> el instanceof Cat).count());

        System.out.printf("%s собак\n",
            Arrays.asList(animals).stream().filter(el -> el instanceof Dog).count());
       
        

    }
}
