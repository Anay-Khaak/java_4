// Задача 3. Количество вхождений слова
// Реализуйте метод countOccurrences в классе ListUtils, который принимает LinkedList<String> и
//  строку, и возвращает количество вхождений строки в список.
// Подсказка No 1
// Чтобы подсчитать, сколько раз строка встречается в LinkedList, вам нужно пройтись по каждому элементу списка и проверить, равен ли элемент искомой строке. Используйте цикл for для итерации по элементам списка.
// Подсказка No 2
// Для сравнения строк используйте метод equals(). Этот метод позволяет сравнить строку с другим значением и определить, равны ли они. Внутри цикла сравните текущий элемент списка с искомым значением.
// Подсказка No 3
// Создайте счётчик, который будет увеличиваться каждый раз, когда элемент списка равен искомой строке. В конце метода верните значение счётчика.
// Подсказка No 4
// Убедитесь, что ваш метод корректно обрабатывает случай, когда список пуст или искомое значение не встречается в списке. В таких случаях счётчик будет равен нулю.

import java.util.LinkedList;
class ListUtils {
   public static int countOccurrences(LinkedList<String> list,
String value) {
       int count = 0;
       for (String s : list) {
           if (s.equals(value)) {
count++; }
}
       return count;
   }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw3 {
   public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
       String value;
       if (args.length < 2) {
           // При отправке кода на Выполнение, вы можете варьировать эти параметры
           list.add("apple");
           list.add("banana");
           list.add("apple");
           list.add("pear");
           list.add("banana");
           value = "apple";
       } else {
           for (int i = 0; i < args.length - 1; i++) {
               list.add(args[i]);
           }
           value = args[args.length - 1];
       }
ListUtils utils = new ListUtils(); System.out.println("Occurrences of \"" + value + "\": " +
utils.countOccurrences(list, value)); }
}