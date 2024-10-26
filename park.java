import java.util.ArrayList;
import java.util.List;

public class Park {
    // Список аттракционов в парке
    private List<Attraction> attractions;

    // Конструктор класса Park
    public Park() {
        attractions = new ArrayList<>();
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    // Метод для вывода информации об аттракционах
    public void displayAttractions() {
        System.out.println("Аттракционы в парке:");
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }

    // Внутренний класс Attraction
    private class Attraction {
        private String name;          // Название аттракциона
        private String workingHours;  // Время работы аттракциона
        private double price;         // Стоимость аттракциона

        // Конструктор внутреннего класса Attraction
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void displayInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " рублей");
            System.out.println(); // Пустая строка для разделения аттракционов
        }
    }

    // Пример использования класса Park
    public static void main(String[] args) {
        Park park = new Park();

        // Добавляем аттракционы
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 1500);
        park.addAttraction("Мадагаскар", "10:00 - 20:00", 700);
        park.addAttraction("Поездка на лодке", "09:00 - 20:00", 500);
        park.addAttraction("Мумия", "10:00 - 19:00", 850);
        park.addAttraction("Трансформеры", "11:00 - 21:00", 750);

        // Выводим информацию об аттракционах
        park.displayAttractions();
    }
}

