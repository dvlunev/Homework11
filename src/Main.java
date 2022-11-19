import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    /* public static void printSeparator() {
        System.out.println("+++++++++++++");
        System.out.println("-------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);

    }
    public static void main(String[] args) {
        int a = 1;
        int[] arr = {1, 2, 3};
        changeValues(a, arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeValues(int a, int[] arr2) {
        a = 5;
        arr2[0] = 5;
    } */

    // Задание 1
    public static String checkLeapYear(int year) {
        boolean leapУear = year % 4 == 0;
        // String resultLeapYear;
        if (year < 0) return "Данные введены неверно, это не наша эра =)";
        else if (leapУear && year % 100 != 0) return year + " - високосный год";
        else if (year % 400 == 0) return year + " - високосный год";
        else return year + " - не високосный год";
    }

    // Задание 2
    public static String chooseVersion(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS != 0 && clientOS != 1) return "Данные введены неверно";
        else if (clientDeviceYear < 2002) return "Смартфоны тогда еще не изобрели";
        else if (clientOS == 0 && clientDeviceYear >= currentYear) return "Установите версию приложения для iOS по ссылке. Установите облегченную версию приложения для iOS по ссылке";
        else if (clientOS == 1 && clientDeviceYear >= currentYear) return "Установите версию приложения для Android по ссылке. Установите облегченную версию приложения для Android по ссылке";
        else if (clientOS == 0 && clientDeviceYear < currentYear) return "Установите версию приложения для iOS по ссылке";
        else return "Установите версию приложения для Android по ссылке";
    }

    //Задание 3
    public static String calculateDeliveryDays(int deliveryDistance) {
        int needDays = 1;
        if (deliveryDistance <= 20 && deliveryDistance > 0) return "Потребуется дней: " + needDays;
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            needDays = needDays + 1;
            return "Потребуется дней: " + needDays;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            needDays = needDays + 2;
            return "Потребуется дней: " + needDays;
        } else if (deliveryDistance > 100) return "Мы не сможем доставить Вам карту";
        else return "Некорректное значение";
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        System.out.println(checkLeapYear (year));
        System.out.println(" ");
        // Задание 2
        System.out.println("Задание 2");
        byte clientOS = 0;
        int clientDeviceYear = 2022;
        System.out.println(chooseVersion(clientOS, clientDeviceYear));
        System.out.println(" ");
        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 77;
        System.out.println(calculateDeliveryDays(deliveryDistance));
        System.out.println(" ");
    }
}