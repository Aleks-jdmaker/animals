public class Main {
    /**
     * public - общедоступный
     * static - единый для всех инстансов (инстанс - структура в ОЗУ, созданная на основе данного класса)
     * void - метод ничего не возвращает
     * main - главный метод класса
     * String[] args  - параметры, в данном случае параметр один - массив строк
     * Сочетание имени метода, его возвращаемого значения и набора параметров
     * называется сигнатура. Она должна быть уникальна в рамках класса.
     * @param args - параметры, приходящие из операционной системы.
     */
    public static void main(String[] args) { // Главный метод класса. Точка входа в программу.
        System.out.println("Hello, world!");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[5]);
    }
}
