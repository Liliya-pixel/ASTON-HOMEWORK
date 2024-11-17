interface Shape {
    double area(); // Метод для расчета площади
    double perimeter(); // Метод для расчета периметра
    
    // Дефолтный метод для расчета периметра, если его можно переопределить
    default double calculatePerimeter() {
        return perimeter();
    }
    
    String getFillColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границы
}
