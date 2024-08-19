//Определяет, что класс Food находится в пакете model
package model;
//Определяет абстрактный класс Food. Абстрактные классы не могут быть инстанцированы напрямую и могут содержать абстрактные методы.
public abstract class Food {

    //Поле для хранения количества продукта в килограммах. Доступно только в этом классе и его подклассах.
    protected int amount;
    //Поле для хранения цены за единицу продукта. Доступно только в этом классе и его подклассах.
    protected double price;
    //Поле для хранения информации о том, является ли продукт вегетарианским. Доступно только в этом классе и его подклассах.
    protected boolean isVegetarian;

    //Конструктор, который инициализирует поля amount, price и isVegetarian.
    //Поскольку это protected, конструктор доступен только в этом классе и его наследниках.
    protected Food(int amount, double price, boolean isVegetarian) {
        //Присваивание значений параметров конструктора соответствующим полям класса.
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //Метод-геттер для получения значения поля isVegetarian.
    //public: Метод доступен из любого места.
    public boolean isVegetarian() {
        //Возвращает значение поля isVegetarian.
        return isVegetarian;
    }

    //Метод-геттер для получения значения поля amount
    public int getAmount() {
        //Возвращает значение поля amount
        return amount;
    }

    //Метод-геттер для получения значения поля price
    public double getPrice() {
        //Возвращает значение поля price
        return price;
    }
}


