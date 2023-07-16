// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println (dog);
        dog = dog + 4;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        cat = cat + 4;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
        paper = paper + 4;
        System.out.println (paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println (dog);
        dog = dog + 4;
        System.out.println (dog);
        dog = dog - 3.5;
        System.out.println (dog);

        var cat = 3.6;
        System.out.println (cat);
        cat = cat + 4;
        System.out.println (cat);
        cat = cat - 1.6;
        System.out.println (cat);

        var paper = 763789;
        System.out.println (paper);
        paper = paper + 4;
        System.out.println (paper);
        paper = paper - 7639;
        System.out.println (paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var men1 = 78.2;
        System.out.println("вес первого бойца " + men1 + " кг");
        var men2 = 82.7;
        System.out.println("вес второго бойца " + men2 + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var men1 = 78.2;
        var men2 = 82.7;
        var ves = men2 - men1;
        System.out.println("разница в весе бойцов " + ves + " кг");
        ves =  men2 % men1;
        System.out.println("разница в весе бойцов " + ves + " кг");
    }

}