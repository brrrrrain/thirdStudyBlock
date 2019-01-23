## III. Java. Часть 2
---
### Теоретическая часть

**1. Классы:**
+ [Классы и объекты] (https://metanit.com/java/tutorial/3.1.php)  **(\*\*\*\*)**
+ [Пакеты] (https://metanit.com/java/tutorial/3.2.php)  **(\*\*\*\*)**
+ [Модификаторы доступа и инкапсуляция] (https://metanit.com/java/tutorial/3.3.php)  **(\*\*\*\*)**
+ [Статические члены и модификатор static] (https://metanit.com/java/tutorial/3.4.php)  **(\*\*\*\*)**
+ [Объекты как параметры методов] (https://metanit.com/java/tutorial/3.14.php)  **(\*\*\*\*)**
+ [Наследование, полиморфизм и ключевое слово super] (https://metanit.com/java/tutorial/3.5.php)  **(\*\*\*\*)**
+ [Абстрактные классы] (https://metanit.com/java/tutorial/3.6.php)  **(\*\*\*\*)**
+ [Иерархия наследования и преобразование типов] (https://metanit.com/java/tutorial/3.10.php)  **(\*\*\*\*)**
+ [Внутренние классы] (https://metanit.com/java/tutorial/3.12.php)  **(\*\*\*\*)**
+ [Интерфейсы] (https://metanit.com/java/tutorial/3.7.php)  **(\*\*\*\*)**
+ [Интерфейсы в механизме обратного вызова] (https://metanit.com/java/tutorial/3.16.php)  **(\*\*\*)**
+ [Перечисления enum] (https://metanit.com/java/tutorial/3.8.php)  **(\*\*\*\*)**
+ [Класс Object и его методы] (https://habrahabr.ru/post/168195/)  **(\*\*\*)**
+ [Обобщенные типы и методы] (https://metanit.com/java/tutorial/3.11.php)  **(\*\*\*)**
+ [Наследование и обобщения] (https://metanit.com/java/tutorial/3.15.php)  **(\*\*\*)**
+ [Ссылочные типы и клонирование объектов] (https://metanit.com/java/tutorial/3.13.php) **(\*\*\*)**

**2. Обработка исключений:**  
+ [Оператор throws] (https://metanit.com/java/tutorial/4.1.php) **(\*\*\*\*)**
+ [Классы исключений] (https://metanit.com/java/tutorial/4.2.php) **(\*\*\*\*)**
+ [try-with-resources] (https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html) **(\*\*\*\*)**
+ [Создание своих классов исключений] (https://metanit.com/java/tutorial/4.3.php) **(\*\*)**

**3. Коллекции:**  
+ [Введение в коллекции в Java] (https://metanit.com/java/tutorial/5.1.php) **(\*\*\*\*)**
+ [Класс ArrayList и интерфейс List] (https://metanit.com/java/tutorial/5.2.php) **(\*\*\*\*)**
+ [Класс LinkedList] (https://metanit.com/java/tutorial/5.3.php) **(\*\*)**
+ [Класс HashSet] (https://metanit.com/java/tutorial/5.4.php) **(\*\*\*\*)**
+ [Класс TreeSet] (https://metanit.com/java/tutorial/5.5.php) **(\*\*\*)**
+ [Интерфейсы Comparable и Comporator. Сортировка] (https://metanit.com/java/tutorial/5.6.php) **(\*\*\**)**
+ [Очереди и класс ArrayDeque] (https://metanit.com/java/tutorial/5.7.php) **(\*\*)**
+ [Отображения и класс HashMap] (https://metanit.com/java/tutorial/5.8.php) **(\*\*\*\*)**
+ [Класс TreeMap] (https://metanit.com/java/tutorial/5.9.php) **(\*\*)**
+ [Итераторы] (https://metanit.com/java/tutorial/5.10.php) **(\*\*\)**

**4. Работа со строками:**  
+ [Введение в строки. Класс String] (https://metanit.com/java/tutorial/7.1.php) **(\*\*\*\*)**
+ [Основные операции со строками] (https://metanit.com/java/tutorial/7.2.php) **(\*\*\*\*)**
+ [StringBuffer и StringBuilder] (https://metanit.com/java/tutorial/7.3.php) **(\*\*\*)**
+ [Регулярные выражения] (https://metanit.com/java/tutorial/7.4.php) **(\*\*)**

**5. Лямбда-выражения:**  
+ [Введение в лямбда-выражения] (https://metanit.com/java/tutorial/9.1.php) **(\*\*\*\*)**
+ [Лямбды как параметры методов и ссылки на методы] (https://metanit.com/java/tutorial/9.2.php) **(\*\*\*\*)**
+ [Встроенные функциональные интерфейсы] (https://metanit.com/java/tutorial/9.3.php) **(\*\*)**
  

### Практическое задание
Все задачи должны быть реализованы в одном файле и разделены комментариями, указывающими на номер или текст задания.

**Важно! Весь код должен быть написан по предоставленному Java Code Conventions**
1. Создать task в PS с заголовком "II. Java. Часть 2" и взять ее в работу.
2. Настроить проект для java 8 https://developer.android.com/guide/platform/j8-jack.html?hl=ru
3. Написать простое лямба-выражение в переменной `myClosure`, лямба-выражение должно выводить в консоль фразу "I love Java". Вызвать это лямба-выражение. Далее написать функцию, которая будет запускать заданное лямба-выражение заданное количество раз. Объявить функцию так: `public void repeatTask (int times, Runnable task)`. Функция должна запускать `times` раз лямба-выражение `task` . Используйте эту функцию для печати «I love Java 10 раз.
4. Условия: есть начальная позиция на двумерной плоскости, можно осуществлять последовательность шагов по четырем направлениям up, down, left, right. Размерность каждого шага равна 1. Задание: 
  1. Создать enum `Directions` с возможными направлениями движения
  2. Создать метод, принимающий координаты и одно из направлений и возвращающий координату после перехода по направлению
  3. Создать метод, осуществлящий несколько переходов от первоначальной координаты и выводящий координату после каждого перехода. Для этого внутри метода следует определить переменную `location` с начальными координатами (0,0) и  массив направлений, содержащий элементы [up, up, left, down, left, down, down, right, right, down, right], и програмно вычислить какие будут координаты у переменной `location` после выполнения этой последовательности шагов. Для вычисленеия результата каждого перемещения следует использовать созданный ранее метод перемещения на один шаг.
5. Создать интерфейс Shape с двумя методами perimeter и area, выводящими периметр и площадь фигуры соответственно, после чего реализовать и использовать для вывода периметра и площади следующие классы, реализующие интерфейс Shape:
  1. `Rectangle` - прямоугольник с двумя свойствами: ширина и длина
  2. `Square` - квадрат с одним свойством: длина стороны
  3. `Circle` - круг с одним свойством: диаметр круга
6. Завершить task в PS и залогировать затраченное время
