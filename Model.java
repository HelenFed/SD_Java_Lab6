import java.util.ArrayList;

/*
Один з класів, який входить в реалізацію шаблону MVC, а саме Model.
Модель представляє дані та бізнес-логіку програми. Вона відповідає за обробку та збереження даних,
а також за виконання операцій над ними.
Модель не залежить від інших компонентів.
 */

public class Model {
    /*
    Конструктор моделі ініціалізує головні дані, в нашому випадку список тарифів,
    з яким ми вже потым можемо проводити необхідні операції
     */

    private ArrayList<Tariff> tariffs;

    public Model(ArrayList<Tariff> tariffs){
        this.tariffs = tariffs;
    }

    /*
    Метод, який проходиться по списку тарифів і виводить інформацію про них за допомогою метода printTariff(),
    який визначений у кожному підкласі
     */

    public void printTariffs(){
        for (Tariff tariff : tariffs){
            tariff.printTariff();
        }
    }

    /*
    Метод, який повертає загальне число клієнтів, яке рахується шляхом виклику методу getNumberOfCustomers у циклі.
    Цей метод визначений у батьківському класі, тому він поширюється для усіх підкласів.
    */
    public int getTotalCustomers(){
        int totalCustomers = 0;
        for (Tariff tariff : tariffs){
            totalCustomers += tariff.getNumberOfCustomers();
        }
        return totalCustomers;
    }

    /*
    Метод, який сортує список тарифів від найдешевшого до найдорожчого за допомогою методу compare та
    getSubscriptionFee, визначений у батьківському класі, тому він поширюється для усіх підкласів
     */

    public void sortTariffsByFee(){
        tariffs.sort((t1, t2) -> Double.compare(t1.getSubscriptionFee(), t2.getSubscriptionFee()));
    }

    /*
    Метод який повертає новий список тарифів, в який через цикл додаються лише ті тарифи, які підпадають у діапазон
    між переданими значеннями minFee та maxFee
     */
    public ArrayList<Tariff> findTariffPriceRange(double minFee, double maxFee){
        ArrayList<Tariff> found = new ArrayList<>();
        for (Tariff tariff : tariffs){
            if (tariff.getSubscriptionFee() >= minFee && tariff.getSubscriptionFee() <= maxFee){
                found.add(tariff);
            }
        }
        return found;
    }
}
