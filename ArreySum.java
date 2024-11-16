import java.util.*;
import java.lang.*;
import java.io.*;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArraySum {
    
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4. Получен: " + array.length + "x" + (array.length > 0 ? array[0].length : 0));
        }
        
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4. Получен: " + array.length + "x" + row.length);
            }
        }
        
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        String[][] validArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };

        String[][] invalidArraySize = {
            {"1", "2", "3"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"}
        };

        String[][] invalidDataArray = {
            {"1", "2", "3", "4"},
            {"5", "six", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };

        // Тестируем корректный массив
        try {
            int result = sumArray(validArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем массив с неправильным размером
        try {
            int result = sumArray(invalidArraySize);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем массив с неверными данными
        try {
            int result = sumArray(invalidDataArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
