public class Employee {
    // Поля класса
    private String fullName; // ФИО
    private String position;  // Должность
    private String email;     // E-mail
    private String phone;     // Телефон
    private double salary;     // Зарплата
    private int age;          // Возраст

    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем объект класса Employee
        Employee employee = new Employee("Хлыбова Лилия Сергеевна", "Тестировщик", "hlibova.lilia@yandex.ru", "89207650975", 600000, 39);
        
        // Выводим информацию об объекте
        employee.displayInfo();
    }
}
