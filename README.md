Сравнение реализации массивов (списков) и стеков в C++, Java и Python
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
