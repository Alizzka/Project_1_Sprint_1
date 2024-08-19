//Определяет пакет, в который будет помещён класс Meat
package model;

//public: Класс доступен из любого места
//class: Объявление нового класса
//Meat: Имя класса
//extends Food: Указывает, что класс Meat наследует от класса Food
//Это означает, что Meat получает все поля и методы Food
public class Meat extends Food {

    //Конструктор класса Meat, который инициализирует поля amount и price
    //Также устанавливает isVegetarian в false (мясо не является вегетарианским)
    public Meat(int amount, double price) {
        //super(amount, price, false): Вызов конструктора родительского класса Food для инициализации полей
        super(amount, price, false);
    }
}

/*package model;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false);  // false, так как мясо не является вегетарианским
    }

    @Override
    public double getDiscount() {
        return 0;  // Мясо не имеет скидки по умолчанию
    }
}
*/




