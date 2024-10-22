public class main 
{ 
    //Task 1
    public class main {    
        public static void main(String[] args) {
             printThreeWords();
        }
        public static void printThreeWords() 
        {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
         
         
    }

      //Task 2 
    public class main {
        public static void main(String[] args) {
        checkSumSign();
        }
           public static void checkSumSign() 
           {
             int a = 5;  // Вы можете изменить значения по своему усмотрению
             int b = -3; // Вы можете изменить значения по своему усмотрению int sum = a + b;
             if (sum >= 0) 
            {
                 System.out.println("Сумма положительна");
            } else {
                     System.out.println("Сумма отрицательна");
               }
           }
    }


    //Task 3

    public class main {
        public static void main(String[] args) {
            printColor();
        }

        public static void printColor() {
            int value = 75; // Вы можете изменить значение по своему усмотрению if (value <= 0) 
            {
                 System.out.println("Красный");
            if (value > 0 && value <= 100) {
                 System.out.println("Желтый");
            } else {
                 System.out.println("Зеленый");
           }
        }
    }



    //Task 4 

    public class main {
        public static void main(String[] args) {
            compareNumbers();
        }

        public static void compareNumbers() {
            int a = 10; // Вы можете изменить значение по своему усмотрению int b = 5;  // Вы можете изменить значение по своему усмотрению

            if (a >= b) {
                 System.out.println("a >= b");
            } else {
                 System.out.println("a < b");
            }
        }
    }


    //Task 5 

    public class main {
        public static void main(String[] args) {
             // Пример вызова метода System.out.println(isSumInRange(5, 7));  // true System.out.println(isSumInRange(10, 15)); // false System.out.println(isSumInRange(8, 3));   // true 
        }

        public static boolean isSumInRange(int a, int b) {
             int sum = a + b;
             return sum >= 10 && sum <= 20;
        }
    }

    //Task 6 

    public class main {
        public static void main(String[] args) {
             // Примеры вызова метода
             printNumberSign(5);   // Положительное число printNumberSign(-3);  // Отрицательное число printNumberSign(0);   // Положительное число 
        }

        public static void printNumberSign(int number) 
        {
            if (number >= 0) {
                 System.out.println("Положительное число");
            } else {
                 System.out.println("Отрицательное число");
           }
        }
   }


    //Task 7 

    public class main {
        public static void main(String[] args) {
             // Примеры вызова метода System.out.println(isNegative(-5));  // true
             System.out.println(isNegative(3));    // false System.out.println(isNegative(0));    // false
        }

        public static boolean isNegative(int number) {
             return number < 0; // Возвращает true, если число отрицательное
        }
    }

    //Task 8 

    public class main {
        public static void main(String[] args) {
            // Примеры вызова метода
            printStringMultipleTimes("Привет", 3); // Выводит "Привет" 3 раза
            printStringMultipleTimes("Java", 5);    // Выводит "Java" 5 раз 
        }

        public static void printStringMultipleTimes(String str, int times) 
        {
            for (int i = 0; i < times; i++) {
                 System.out.println(str); // Печатает строку
            }
        }
    }

    //Task 9 
    public class main {
        public static void main(String[] args) {
            // Примеры вызова метода
            System.out.println(isLeapYear(2020)); // true
            System.out.println(isLeapYear(1900)); // false System.out.println(isLeapYear(2000)); // true System.out.println(isLeapYear(2021)); // false 
        
        public static boolean isLeapYear(int year) {
            // Проверка на високосный год 
            if (year % 4 == 0) 
            {
            if (year % 100 == 0) 
            {
            return year % 400 == 0; // год делится на 400 - високосный 
            }
            return true; // год делится на 4, но не на 100 - високосный 
            }
            return false; // год не делится на 4 - не високосный }
        }
    }


    //Task 10
    public class main {
        public static void main(String[] args) {
            // Исходный массив
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            // Выводим исходный массив
                System.out.println("Исходный массив:");
                printArray(array);
            // Заменяем 0 на 1 и 1 на 0
            for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Заменяем 0 на 1 
            } else {
                array[i] = 0; // Заменяем 1 на 0 }
            }

            // Выводим измененный массив
               System.out.println("Измененный массив:");
            printArray(array);
        
            // Метод для вывода массива public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
                System.out.println(); // Переход на новую строку 
            }
       }
    }
            
        
    //Task 11

    public class main {
        public static void main(String[] args) {
            // Создаем пустой массив длиной 100
            int[] array = new int[100];

            // Заполняем массив значениями от 1 до 100
            for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Заполняем элемент массива значением i + 1
            }

            // Выводим заполненный массив
                System.out.println("Заполненный массив:");
                printArray(array);
        }
    
           // Метод для вывода массива public static void printArray(int[] array) 
        public static void printArray(int[] array) {
            for(int value: array) {
                System.out.print(value + " ");
            }
                System.out.println(); // Переход на новую строку
        }
    }

    //Task 12  

    public class main {
        public static void main(String[] args) {
            // Задаем массив
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            // Проходим по массиву и умножаем числа меньше 6 на 2
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                array[i] *= 2; // Умножаем на 2
                }
            }

            // Выводим измененный массив System.out.println("Измененный массив:");
                printArray(array);
        }

            // Метод для вывода массива
        public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
                System.out.println(); // Переход на новую строку
        }
   }

    //Task 13 

    public class main {
         public static void main(String[] args) {
            int size = 5; // Размерность массива (количество строк и столбцов)
            int[][] array = new int[size][size]; // Создаем квадратный массив

            // Заполняем диагональные элементы единицами for (int i = 0; i < size; i++) {
            array[i][i] = 1; // Устанавливаем единицу на главной диагонали }

            // Выводим массив
                System.out.println("Массив с единицами на главной диагонали:");
                printArray(array);
        }

            // Метод для вывода двумерного массива public static void printArray(int[][] array) 
        {
             for(int[] row; array; )
            {
                for (int value : row) 
                {
                     System.out.print(value + " ");
                }
            System.out.println(); // Переход на новую строку 
                
            }
        }
    }

    //Task 14
    public class main {
        public static void main(String[] args) {
            // Пример использования метода
            int len = 5; // Длина массива int initialValue = 10; // Начальное значение

            int[] resultArray = createArray(len, initialValue); // Создаем массив // Выводим созданный массив
                System.out.println("Созданный массив:");
                printArray(resultArray);
        }

           // Метод для создания массива
        public static int[] createArray(int len, int initialValue) {
            int[] array = new int[len]; // Создаем массив заданной длины // Заполняем массив значением initialValue
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }

             return array; // Возвращаем заполненный массив 

            // Метод для вывода массива public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
                System.out.println(); // Переход на новую строку
            }
        }
    }
} 

    