public class Cat extends Animal {
    private static int catCount = 0; // Счетчик котов
    private boolean isFull; // Поле сытости

    public Cat() {
        super();
        this.isFull = false; // Кот изначально голоден
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот не может пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(FoodBowl foodBowl) {
        if (foodBowl.getFoodAmount() > 0) {
            foodBowl.decreaseFood();
            this.isFull = true;
            System.out.println("Кот покушал из миски.");
        } else {
            System.out.println("Кот не может покушать, в миске нет еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}