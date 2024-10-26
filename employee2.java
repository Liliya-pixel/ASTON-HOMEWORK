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
        System.out.println(); // Пустая строка для разделения сотрудников
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем массив из 5 сотрудников
        Employee[] employees = new Employee[5];

        // Заполняем массив данными
        employees[0] = new Employee("Хлыбова Лилия Сергеевна", "Тестировщик", "hlibova.lilia@yande.ru", "89207650975", 60000, 39);
        employees[1] = new Employee("Петров Иван Анатольвич", "Разработчик", "petrov@example.com", "098-755-3321", 61000, 38);
        employees[2] = new Employee("Сидоркин Иван Андреевич", "Менеджер", "sidorkin@example.com", "111-222-3333", 65000, 35);
        employees[3] = new Employee("Кузнецова Нина Викторовна", "Тестировщик", "kuznetsova@example.com", "444-555-6666", 55000, 42);
        employees[4] = new Employee("Симонова Алла Павловна", "Аналитик", "simonova@example.com", "783-835-9996", 64000, 59);

        // Выводим информацию о каждом сотруднике
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}

