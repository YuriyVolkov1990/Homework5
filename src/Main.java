public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
        //task6();
        //task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такая ОС не предусмотрена");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Такая ОС не предусмотрена");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year, leapYear, notLeapYear, leapYearPlus;
        year = 500;
        leapYear = year % 4;
        leapYearPlus = year % 400;
        notLeapYear = year % 100;
        switch (leapYear) {
            case 0:
                switch (leapYearPlus) {
                    case 0:
                        System.out.println(year + " год является високосным");
                        break;
                    default:
                        if (notLeapYear == 0) {
                            System.out.println(year + " год не является високосным");
                        } else {
                            System.out.println(year + " год является високосным");
                        }
                }
                break;
            default:
                System.out.println(year + " год не является високосным");
        }
    }
}