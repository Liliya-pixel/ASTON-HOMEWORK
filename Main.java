import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем массив слов с повторениями
        String[] words = {
            "бабушка", "дедушка", "мать", "отец", "тетя",
            "дядя", "сын", "дочь", "племянник", "племянница",
            "бабушка", "мать", "дедушка", "сын", "дядя",
            "мать", "племянник", "тетя", "дочь", "дедушка",
            "племянница", "племянник"
        };

        // Используем HashMap для подсчета вхождений
        Map<String, Integer> wordCount = new HashMap<>();

        // Подсчитываем количество вхождений каждого слова
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Находим уникальные слова
        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());

        // Выводим уникальные слова
        System.out.println("Уникальные слова: " + uniqueWords);

        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
