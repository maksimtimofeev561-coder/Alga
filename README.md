Сравнение реализации массивов (списков) и стеков в C++, Java и Python(Тимофеев Максим УИБО-10-24)
##Создание массива (списка)
### C++
```cpp
#include <iostream>
int main() {
    const int SIZE = 5; // Размер массива
    int array[SIZE];    // Объявление статического массива

    // Заполнение массива
    for (int i = 0; i < SIZE; i++) {
        std::cout << "Введите элемент " << i << ": ";
        std::cin >> array[i];
    }

    // Вывод массива
    std::cout << "Элементы массива: ";
    for (int i = 0; i < SIZE; i++) {
        std::cout << array[i] << " ";
    }
    std::cout << std::endl;

    return 0;
}
```
### Java
```java
import java.util.Scanner;

public class StaticArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5; // Размер массива
        int[] array = new int[SIZE]; // Объявление статического массива

        // Заполнение массива
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Введите элемент " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Вывод массива
        System.out.print("Элементы массива: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
```
### Python
```py
a = list()
b = int(input())
for i in range(b):
    a.append(input())
print(a)
```
## Организация стека
### С++
```
#include <iostream>
#include <stack>

int main() {
    std::stack<int> myStack;  // Создание стека
    
    myStack.push(100);  // Добавление элементов
    myStack.push(200);
    myStack.push(300);
    
    while (!myStack.empty()) {
        std::cout << myStack.top() << " ";  // Получение вершины
        myStack.pop();  // Удаление вершины
    }
}
```
## Создание стека
### Python
```
stack = []
stack.append(1)  # Добавление в стек
stack.append(2)
top = stack.pop()  # Извлечение из стека: 2
```
### Java
```
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(10);     // добавление
int top = stack.peek();  // просмотр вершины
stack.pop();        // удаление
```
### C++
```
std::stack<std::string> st;
st.push("элемент1");
st.push("элемент2");
std::string top = st.top();
st.pop();
```
