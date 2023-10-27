/*
Загальний клас для визначення тарифу. Тут визначається інформація, яка спільна для будь-якого типу тарифу.
Саме цей клас будуть наслідувати підкласи різних типів тарифів.
Наслідування - один з принципів ООП, який дозволяє створювати нові класи на основі вже існуючого
 */

public class Tariff {
    /*
    Приватні поля, які визначають загальну інформацію.
    Ці поля приватні, тому доступ до них обмежений і доступитися можна лише через getters
     */
    private String name;
    private double subscriptionFee;
    private int numberOfCustomers;

    //Конструктор, який використовується для створення та ініціалізації об'єктів
    public Tariff(String name, double subscriptionFee, int numberOfCustomers){
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.numberOfCustomers = numberOfCustomers;
    }

    /*
    Методи get використовуються для отримання значень приватних полів.
    Саме ці методи дають можливість доступитися до значень, але не дозволяють їх змінювати.
    Через ці методи реалізован один із принципів ООП - інкапсуляція
     */

    public String getName(){
        return name;
    }

    public double getSubscriptionFee(){
        return subscriptionFee;
    }

    public double getNumberOfCustomers(){
        return numberOfCustomers;
    }

    /*
    Методи set використовуються для встановлення значень приватних полів класу.
    Саме ці методи дають можливість змінювати значення полів з інших класів
     */

    public void setName(String name){
        this.name = name;
    }

    public void setSubscriptionFee(double subscriptionFee){
        this.subscriptionFee = subscriptionFee;
    }

    public void setNumberOfCustomers(int numberOfCustomers){
        this.numberOfCustomers = numberOfCustomers;
    }

    /*
    Метод, який виводить загальну інформацію про тариф.
    Цей метод перевизначений у кожному підкласі, де в рядок додається додаткова інформація про тариф
    Через перевизначення цього методу продемонстрован інший принцип ООП - поліморфізм
    Поліморфізм дозволяє об'єктам різних класів виконувати однікові дії за допомогою методів з однаковою назвою,
    але з різною реалізацією
    */

    public void printTariff(){
        System.out.println("Тип тарифу: " + name + "\nВартість тарифу: " + subscriptionFee + "" +
                "\nКількість можливих клієнтів: " + numberOfCustomers);
    }
}
