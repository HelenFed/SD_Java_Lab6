/*Наслідування досягається за допомогою ключвого слова extends.
Підклас вказує ім'я батьківського класу після ключового слова extends,
і отримує всі властивості та методи батьківського класу.
 */

public class PremiumTariff extends Tariff{
    /*
    Приватне поле, яке характерне тільки для цього підкласу.
    Робимо це поле final, бо ми його ніколи не будемо перевизначати
     */
    private final boolean unlimitedCalls;

    /*
    Конструктор підкласу може мати свої власні параметри,
    а також викликати конструктор батьківського класу через super.
    Заздалегідь задаємо якісь початкові значення.
     */
    public PremiumTariff(){
        super("Premium", 300, 500);
        this.unlimitedCalls = true;
    }

    //По суті метод get, але так як значення яке повртається має тип boolean, то замість get маємо is
    public boolean isUnlimitedCalls(){
        return unlimitedCalls;
    }

    //Метод, який виводить інформацію про цей тип тарифу, включаючи інформацію, яка властива тільки цьому типу
    public void printTariff(){
        System.out.println("Тип тарифу: " + getName() + "\nВартість тарифу: " + getSubscriptionFee() +
                "\nКількість можливих клієнтів: " + getNumberOfCustomers() +
                "\nМожливість безлімітних дзвінків: " + unlimitedCalls + "\n");
    }
}
