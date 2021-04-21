package animals;


public class Dog extends Animal implements AnimalRun, AnimalSwim {

    public Dog(String name) {
        super(name, 500, 10);

    }

    @Override
    public void swim(int toSwim) {
        if (checkSwim(toSwim)) {
            setSwim(toSwim);
            System.out.printf("Собака %s проплыла %d м\n", getName(), getSwim());
        } else {
            System.out.printf("Собака %s не может проплыть %d м\n", getName(), toSwim);

        }

    }

    @Override
    public void run(int toRun) {
        if (checkRun(toRun)) {
            setRun(toRun);
            System.out.printf("Собака %s пробежала %d м\n", getName(), getRun());
        }
        else {
            System.out.printf("Собака %s не может пробежать %d м\n", getName(), toRun);

        }
   
    }

}
    

