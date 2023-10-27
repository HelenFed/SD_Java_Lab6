import java.util.ArrayList;

/*
Один з класів, який входить в реалізацію шаблону MVC, а саме Controller.
Контроллер взаємодіє з моделлю, оновлюючи її стан або отримуючи дані з неї.
Він відповідає за керування потоком даних між моделлю та видом
 */

public class Controller {
    /*
    Приватними полями та значеннями в конструкторі для контроллера є саме модель і вид.
    Саме цей клас передає модель у вид
     */
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    /*
    Метод у якому і реалізується передача відповідної інформації з моделі в вид,
    а також виклик відповідних методів моделі
     */
    public void processTariffs(){
        //Передача моделі (список) в вид, з викликом методу виводу інформації
        view.printTariffs(model);

        /*
        Створення змінної зі значенням загальної кількості клієнтів через виклик відповідного методу моделі,
        а також передача до виду цього значення на вивід
        */
        int totalCustomers = model.getTotalCustomers();
        view.printTotalCustomers(totalCustomers);

        /*
        Виклик методу сортування моделі.
        Повторна передача моделі (на цей раз відсортованої) на вивід в вид
         */
        model.sortTariffsByFee();
        view.printSortedTariffs(model);

        /*
        Створення нового списку тарифів в відповідному грощовому діапазоні
        за допомогою виклику методу моделі для відсіювання.
        З цього нового списку створюємо нову модель і передаємо на вивід.
         */
        ArrayList<Tariff> listNeeded = model.findTariffPriceRange(100, 260);
        Model found = new Model(listNeeded);
        view.printTariffsInPriceRange(100, 260, found);
    }
}
