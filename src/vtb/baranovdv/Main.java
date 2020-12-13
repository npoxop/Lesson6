package vtb.baranovdv;
// Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
//Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
//Ограничения:
//Минимум 3 класса
//Наличие нескольких полей и методов
//Использование модификаторов доступа
//Использование принципов ООП

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import java.util.Arrays;
import java.util.Scanner;

class Worker {
    Worker workers;
    String name;
    String exp;
    String phone;

    Worker(String name, String exp, String phone) {
        this.name = name;
        this.exp = exp;
        this.phone = phone;
    }

}

class Truck {
    Warehouse home;
    String brand;
    int price;
    int maxLoad;

    Truck(String brand, int price, int maxLoad) {
        this.brand = brand;
        this.price = price;
        this.maxLoad = maxLoad;
    }
}

class Warehouse extends Worker {
    private Truck vehicle;

    Warehouse(String name, String exp, String phone) {
        super(name, exp, phone);

    }

}

public class Main {

    public static void main(String[] args) {

        Truck t1 = new Truck("Газель", 6000, 2500);
        Truck t2 = new Truck("Соболь", 4500, 1750);
        Truck t3 = new Truck("Хэнде", 3000, 1500);
        Worker w1 = new Worker("Иван", "Хэнде", "89262587496");
        Worker w2 = new Worker("Василий", "Соболь", "89051235826");
        Worker w3 = new Worker("Игорь", "Газель", "89154568723");
        System.out.println("Наш склад предоставляет услуги грузоперевозок. Введите максимальный вес груза, который вам необходимо перевезти");
        Scanner console = new Scanner(System.in);
        int weight = console.nextInt();
        if (weight <= 1500)
            System.out.printf("Стоимость перевозки составит %s рублей. Вам поможет водитель %s на автомобиле %s телефон %s", t3.price, w1.name, t3.brand, w1.phone);
        else if (weight > 1500 && weight <= 1750)
            System.out.printf("Стоимость перевозки составит %s рублей. Вам поможет водитель %s на автомобиле %s телефон %s", t2.price, w2.name, t2.brand, w2.phone);
        else if (weight > 1750 && weight <= 2500)
            System.out.printf("Стоимость перевозки составит %s рублей. Вам поможет водитель %s на автомобиле %s телефон %s", t1.price, w3.name, t1.brand, w3.phone);
        else
            System.out.println("К сожалению, у нас нет автомобилей способных перевозить такой вес");
    }
}

