public class Main {
    public static void main(String[] args) {
        // Создаем миску с едой
        FoodBowl foodBowl = new FoodBowl(5);
        
        // Создаем котов
        Cat[] cats = { new Cat(), new Cat(), new Cat() };
        
        // Коты пытаются покушать
        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }
        
        // Проверяем сытость котов
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " сытость: " + (cats[i].isFull() ? "Да" : "Нет"));
        }
        
        // Добавляем еду в миску
        foodBowl.addFood(3);
        
        // Коты снова пытаются покушать
        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }
        
        // Проверяем сытость котов
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " сытость: " + (cats[i].isFull() ? "Да" : "Нет"));
        }
        
        // Создаем собак
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        
        // Собака пробует бег и плавание
        dog1.run(300);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);
        
        // Выводим общее количество животных
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}