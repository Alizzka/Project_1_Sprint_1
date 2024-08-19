//import model.Apple;: Импортирует класс Apple из пакета model. Это позволяет создавать объекты класса Apple в классе Main.
import model.Apple;
//import model.Meat;: Импортирует класс Meat из пакета model. Это позволяет создавать объекты класса Meat в классе Main.
import model.Meat;
//import model.Food;: Импортирует абстрактный класс Food из пакета model. Это позволяет использовать тип Food для хранения объектов, таких как Apple и Meat.
import model.Food;
//import service.ShoppingCart;: Импортирует класс ShoppingCart из пакета service. Это позволяет использовать класс корзины для хранения и обработки продуктов.
import service.ShoppingCart;
//import constants.Discount;: Импортирует класс Discount из пакета constants. Хотя в коде Main этот класс напрямую не используется, он мог быть полезен для получения значений скидок, связанных с продуктами.
import constants.Discount;
//import constants.Colour;: Импортирует класс Colour из пакета constants, который содержит предопределенные значения для цветов яблок (например, Colour.RED, Colour.GREEN).
import constants.Colour;

//public: Модификатор доступа, который позволяет классу Main быть доступным из любой точки проекта.
//class: Ключевое слово для объявления нового класса.
//Main: Имя класса. Этот класс является точкой входа для запуска программы и содержит метод main.
public class Main {

    //public: Модификатор доступа, который делает метод main доступным из любой части программы.
    //static: Ключевое слово, которое означает, что метод принадлежит классу Main, а не объекту класса. Метод main запускается JVM без создания экземпляра Main.
    //void: Указывает, что метод main не возвращает значение.
    //main(String[] args): Метод main является точкой входа в программу. Он принимает один аргумент — массив строк args, который может содержать параметры командной строки, передаваемые программе при запуске.
    public static void main(String[] args) {
        //Food meat = new Meat(5, 100);: Создает объект Meat (мясо) с количеством 5 кг и ценой 100 рублей за килограмм. Переменная meat объявляется с типом Food, что позволяет хранить её в массиве продуктов.
        Food meat = new Meat(5, 100);
        //Food redApple = new Apple(10, 50, Colour.RED);: Создает объект Apple (красное яблоко) с количеством 10 кг и ценой 50 рублей за килограмм. Цвет яблока задается как Colour.RED.
        Food redApple = new Apple(10, 50, Colour.RED);
        //Food greenApple = new Apple(8, 60, Colour.GREEN);: Создает объект Apple (зеленое яблоко) с количеством 8 кг и ценой 60 рублей за килограмм. Цвет яблока задается как Colour.GREEN.
        Food greenApple = new Apple(8, 60, Colour.GREEN);
        //Food[] products = { meat, redApple, greenApple };: Создает массив products, содержащий объекты типа Food.
        //В массив включены мясо, красные яблоки и зеленые яблоки. Этот массив позже будет использоваться для создания корзины.
        Food[] products = { meat, redApple, greenApple };

        //ShoppingCart cart = new ShoppingCart(products);: Создает объект ShoppingCart (корзина) с массивом продуктов products.
        //Этот объект корзины будет использоваться для вычисления различных сумм.
        ShoppingCart cart = new ShoppingCart(products);
        //Выводит на экран общую сумму всех товаров в корзине без учета скидок. Вызывается метод getTotalPriceWithoutDiscount() объекта cart.
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        //Выводит на экран общую сумму всех товаров в корзине с учетом скидок. Вызывается метод getTotalPriceWithDiscount() объекта cart.
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        //Выводит на экран сумму всех вегетарианских продуктов в корзине без учета скидок. Вызывается метод getTotalVegetarianPriceWithoutDiscount() объекта cart.
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}

/*import model.*;
import service.ShoppingCart;
import constants.Colour;
import constants.Discount;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100);  // Мясо, 5 кг по цене 100 рублей за кг
        Apple redApple = new Apple(10, 50, Colour.RED);  // Красные яблоки, 10 кг по цене 50 рублей за кг
        Apple greenApple = new Apple(8, 60, Colour.GREEN);  // Зелёные яблоки, 8 кг по цене 60 рублей за кг

        // Создание массива продуктов
        Food[] products = {meat, redApple, greenApple};

        // Создание корзины с продуктами
        ShoppingCart cart = new ShoppingCart(products);

        // Вывод информации о корзине
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice() + " рублей.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " рублей.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPrice() + " рублей.");
    }
}

 */

