public class Dog extends Animal {
    private static int dogCount = 0; // Счетчик собак

    public Dog() {
        super();
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " метров.");
        } else {
            System.out.println("Собака не может пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " метров.");
        } else {
            System.out.println("Собака не может проплыть " + distance + " метров.");
        }
    }
}