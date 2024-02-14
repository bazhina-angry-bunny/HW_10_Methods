public class Main {
    public static void checkTheYearForLeapYear(int data){
        boolean leapYear = data > 1584;
        if (leapYear) {
            if ((data % 4) == 0 && (data % 100) != 0 || (data % 400) == 0) {
                System.out.println(data + " год является високосным.");
            } else {
                System.out.println(data + " год не является високосным.");
            }
        } else {
            System.out.println("Первым високосным годом принято считать 1588, после введения данного понятия в 1584 году.");
        }
    }
    public static void selectsTheAppVersion(int nowClientOS, int nowClientDeviceYear) {
        if (nowClientOS == 0 && nowClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 0 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (nowClientOS == 1 && nowClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Неизвестная операционная система.");
        }
    }
    public static void calculationDeliveryDisnance(int disnance){
        boolean deliveryDisnanceMax = disnance <= 100;
        if (deliveryDisnanceMax) {
            if (disnance <= 20) {
                System.out.println("Потребуются 1 сутки для доставки вашей банковской карты.");
            } else if (disnance > 20 && disnance <= 60) {
                System.out.println("Потребуются 2 суток для доставки вашей банковской карты.");
            } else if (disnance > 60 && disnance <= 100) {
                System.out.println("Потребуются 3 суток для доставки вашей банковской карты.");
            }
        } else {
            System.out.println("Доставки нет.");
        }
    }
    public static void main(String[] args){
        System.out.println("Задача №1");
        {
            int year = 2025;
            checkTheYearForLeapYear(year);
        }
        System.out.println("*****************************************************************************");
        System.out.println();
        System.out.println("Задача №2");
        {
            int clientOS = 1;
            int clientDeviceYear = 2021;
            selectsTheAppVersion(clientOS,clientDeviceYear);
        }
        System.out.println("*****************************************************************************");
        System.out.println();
        System.out.println("Задача №3");
        {
            int deliveryDisnance = 52;
            calculationDeliveryDisnance(deliveryDisnance);
        }
        System.out.println("*****************************************************************************");
    }
}