/*
Один з класів, який входить в реалізацію шаблону MVC, а саме View.
Вид відповідає за представлення даних користувачу. В нашому випадку виводить текстову інформацію в консоль.
Клас отримує дані з моделі та відображає їх користувачу.
Він не має власної логіки та не зберігає стану даних.
 */

public class View {
    /*
    Цей клас не має власних полів, а конструктор ініціалізує модуль, в якій і зберігається інформація
     */
    public void printTariffs(Model model){
        model.printTariffs();
    }


    //Метод, який виводить інформацію про загальну кількість клієнтів
    public void printTotalCustomers(int totalCustomers){
        System.out.println("\nЗагальна кількість клієнтів: " + totalCustomers);
    }

    //Метод, який виводить відсортований список тарифів
    public void printSortedTariffs(Model model){
        System.out.println("\nСписок тарифів відсортованих за вартістю: ");
        model.printTariffs();
    }

    //Метод, який виводить список тарифів, вартість яких не перевищує заданого діапазону
    public void printTariffsInPriceRange(double min, double max, Model tariffs){
        System.out.printf("\nСписок тарифів, які за вартістю впадають в діапазон [%.3f - %.3f]: \n", min, max);
        tariffs.printTariffs();
    }
}
