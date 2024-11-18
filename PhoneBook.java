import java.util.*;
import java.lang.*;
import java.io.*;

public class PhoneBook {
    // Хранит фамилии и соответствующие им телефонные номера
    private Map<String, List<String>> phoneBook;

    // Конструктор
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        // Получаем список телефонов по фамилии, если его нет - создаем новый
        List<String> phoneNumbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(lastName, phoneNumbers);
    }

    // Метод для получения номеров телефонов по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    // Метод для вывода всего справочника (для удобства)
    public void printPhoneBook() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }

    // Пример использования
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        
        // Добавляем записи
        phoneBook.add("Хлыбова", "123-456");
        phoneBook.add("Хлыбова", "789-012");
        phoneBook.add("Сидякина", "345-678");
        phoneBook.add("Сидякина", "901-234");
        phoneBook.add("Кондрашина", "567-890");
        phoneBook.add("Мозгалева", "234-567");
        phoneBook.add("Мозгалева", "890-123");

        // Получаем телефоны по фамилии
        System.out.println("Телефоны Хлыбовой: " + phoneBook.get("Хлыбова"));
        System.out.println("Телефоны Сидякиной: " + phoneBook.get("Сидякина"));
        System.out.println("Телефоны Кондрашиной: " + phoneBook.get("Кондрашина"));
        System.out.println("Телефоны Мозгалевой: " + phoneBook.get("Мозгалева"));
        System.out.println("Телефоны несуществующей фамилии: " + phoneBook.get("Некто"));

        // Печатаем весь справочник
        System.out.println("\nВесь телефонный справочник:");
        phoneBook.printPhoneBook();
    }
}

