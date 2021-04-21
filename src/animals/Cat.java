package animals;


public class Cat extends Animal implements AnimalRun, AnimalSwim {

    public Cat(String name) {
        super(name, 200, Integer.MAX_VALUE);
    
    }

    @Override
    public void swim(int toSwim) {
       
            System.out.printf("Кот не умеет плавать\n");

    }

    @Override
    public void run(int toRun) {
        if (checkRun(toRun)) {
            setRun(toRun);
            System.out.printf("Кот %s пробежал %d м\n", getName(), getRun());
        } else {
            System.out.printf("Кот %s не может пробежать %d м\n", getName(), toRun);

        }

    }

}
    

