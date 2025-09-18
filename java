import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Создание массива типа список
        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");

        // Организация стека
        Stack<Integer> stack = new Stack<>();

        // Добавление в стек
        stack.push(1);    // [1]
        stack.push(2);    // [1, 2]
        stack.push(3);    // [1, 2, 3]

        // Удаление из стека
        int top = stack.pop();  // возвращает 3, stack = [1, 2]

        System.out.println("Верхний элемент: " + top);
        System.out.println("Размер стека после pop: " + stack.size());
    }
}
