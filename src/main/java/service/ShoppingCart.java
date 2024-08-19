//import: Используется для импортирования классов из других пакетов.
package service;

import model.Food;
import model.Discountable;

//public: Класс доступен из любого места.
//class: Объявление нового класса.
//ShoppingCart: Имя класса.
public class ShoppingCart {
    //private Food[] items: Поле для хранения массива продуктов Food.
    //private означает, что это поле доступно только внутри класса ShoppingCart.
    private Food[] items;

    //Конструктор класса ShoppingCart, который инициализирует массив продуктов items.
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    //Метод для вычисления общей стоимости товаров без скидки.
    public double getTotalPriceWithoutDiscount() {
        //double total = 0;: Переменная для хранения суммы.
        double total = 0;
        //for (Food item : items): Цикл для перебора каждого элемента в массиве items.
        for (Food item : items) {
            //total += item.getAmount() * item.getPrice();: Добавляет стоимость текущего продукта (количество умноженное на цену) к общей сумме.
            total += item.getAmount() * item.getPrice();
        }
        //Возвращает общую сумму.
        return total;
    }

    //Метод для вычисления общей стоимости товаров со скидкой.
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            //double discount: Переменная для хранения скидки. Если продукт реализует Discountable, получаем скидку, иначе 0.
            double discount = item instanceof Discountable ? ((Discountable) item).getDiscount() : 0;
            //double priceWithDiscount: Вычисляет цену с учётом скиди.
            double priceWithDiscount = item.getAmount() * item.getPrice() * (1 - discount / 100);
            total += priceWithDiscount;
        }
        //Возвращает общую сумму.
        return total;
    }

    //public: Модификатор доступа, указывающий, что метод доступен из любого другого класса.
    //double: Возвращаемый тип метода, который представляет собой число с плавающей запятой двойной точности.
    //getTotalVegetarianPriceWithoutDiscount(): Имя метода. Это метод, который не принимает параметров и возвращает значение типа double.
    public double getTotalVegetarianPriceWithoutDiscount() {
        //Объявление переменной total типа double и инициализация её значением 0. Эта переменная будет использоваться для накопления общей стоимости вегетарианских товаров.
        double total = 0;
        //for (Food item : items) {: Цикл for-each, который перебирает каждый элемент массива items.
        //В каждой итерации переменная item будет представлять текущий объект Food из массива items.
        for (Food item : items) {
            //if (item.isVegetarian()) {: Условный оператор if, который проверяет, является ли текущий товар вегетарианским.
            //Метод isVegetarian() вызывается на объекте item и возвращает true, если товар вегетарианский, и false в противном случае.
            if (item.isVegetarian()) {
                //total += item.getAmount() * item.getPrice();: Если товар является вегетарианским, вычисляется его стоимость и добавляется к переменной total.
                //Метод getAmount() возвращает количество товара, а метод getPrice() — его цену.
                //Умножение количества на цену дает стоимость этого товара, которая добавляется к общей сумме total.
                total += item.getAmount() * item.getPrice();
            }
        }
        //return total;: Возвращает значение переменной total, которое содержит общую стоимость всех вегетарианских товаров в корзине без учета скидок.
        return total;
    }
}

/*package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = item instanceof Discountable ? ((Discountable) item).getDiscount() : 0;
            double priceAfterDiscount = item.getPrice() * (1 - discount / 100);
            total += priceAfterDiscount * item.getAmount();
        }
        return total;
    }

    public double getTotalVegetarianPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }
}

 */
