//package model;: Эта строка указывает, что класс Apple принадлежит к пакету model.
//Пакеты используются для организации классов в логические группы и управления их доступностью в других частях проекта.
package model;
//import constants.Colour;: Импортирует класс Colour из пакета constants.
//Это позволяет использовать в классе Apple предопределенные значения, связанные с цветом, например, Colour.RED.
//import constants.Discount;: Импортирует класс Discount из пакета constants.
//Это позволяет использовать предопределенные значения скидок, например, Discount.RED_APPLE.
import constants.Colour;
import constants.Discount;

//public: Модификатор доступа, который делает класс Apple доступным из любого другого класса в проекте.
//class: Ключевое слово для объявления класса в Java.
//Apple: Имя класса. Он представляет собой конкретный тип продукта (яблоко).
//extends Food: Указывает, что класс Apple наследует от абстрактного класса Food.
//Это значит, что Apple является специальным типом Food и унаследует все его поля и методы.
//implements Discountable: Указывает, что класс Apple реализует интерфейс Discountable, что требует реализации метода getDiscount().
public class Apple extends Food implements Discountable {
    //private: Модификатор доступа, который ограничивает доступ к этому полю только внутри класса Apple.
    //String: Тип данных поля colour, который хранит значение цвета яблока в виде строки.
    //colour: Имя поля, которое хранит цвет яблока.
    private String colour;
    //public Apple(int amount, double price, String colour): Это конструктор класса Apple, который используется для создания объектов этого класса.
    //int amount: Параметр конструктора, указывающий количество яблок (в килограммах).
    //double price: Параметр конструктора, указывающий цену за килограмм яблок.
    //String colour: Параметр конструктора, указывающий цвет яблок.
    public Apple(int amount, double price, String colour) {
        //super(amount, price, true);: Эта строка вызывает конструктор родительского класса Food. С помощью super() передаются параметры amount, price, и true в конструктор Food.
        //Значение true указывает, что яблоки являются вегетарианским продуктом.
        super(amount, price, true);
        //this.colour = colour;: Присваивает значение параметра colour полю colour объекта Apple, устанавливая цвет яблока.
        this.colour = colour;
    }
    //@Override: Аннотация, указывающая, что метод getDiscount() переопределяет метод из интерфейса Discountable.
    @Override
    //public double getDiscount(): Метод, который реализует интерфейс Discountable. Он должен возвращать размер скидки для яблок.
    public double getDiscount() {
        //if (Colour.RED.equals(colour)): Проверяет, соответствует ли цвет яблока значению Colour.RED. Использование метода equals вместо == позволяет корректно сравнивать строки.
        if (Colour.RED.equals(colour)) {
            //return Discount.RED_APPLE;: Если цвет яблока красный, метод возвращает значение скидки для красных яблок, определенное в классе Discount (например, 60%).
            return Discount.RED_APPLE;
        }
        //return 0;: Если цвет яблока не красный, метод возвращает 0, то есть скидки нет.
        return 0;
    }
}

/*package model;

public class Apple extends Food implements Discountable {
    private String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);  // true, так как яблоки являются вегетарианскими
        this.colour = colour;
    }
    @Override
    public double getDiscount() {
        if ("red".equals(colour)) {
            return 60;  // Скидка 60% для красных яблок
        }
        return 0;
    }
    public String getColour() {
        return colour;
    }
}
*/


