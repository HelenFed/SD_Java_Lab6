/*Наслідування досягається за допомогою ключвого слова extends.
Підклас вказує ім'я батьківського класу після ключового слова extends,
і отримує всі властивості та методи батьківського класу.
 */

public class BasicTariff extends Tariff{
    //Приватне поле, яке характерне тільки для цього підкласу
    private int dataLimit;

    /*
    Конструктор підкласу може мати свої власні параметри,
    а також викликати конструктор батьківського класу через super.
    Заздалегідь задаємо якісь початкові значення.
     */
    public BasicTariff(){
        super("Basic", 180, 2000);
        this.dataLimit = 2000;
    }

    //Методи get і set для поля, яке властиве лише цьому підкласу
    public int getDataLimit(){
        return dataLimit;
    }

    public void setDataLimit(int dataLimit){
        this.dataLimit = dataLimit;
    }

    //Метод, який виводить інформацію про цей тип тарифу, включаючи інформацію, яка властива тільки цьому типу
    public void printTariff(){
        System.out.println("Тип тарифу: " + getName() + "\nВартість тарифу: " + getSubscriptionFee() +
                "\nКількість можливих клієнтів: " + getNumberOfCustomers() +
                "\nЛіміт на дані (в МБ): " + dataLimit + "\n");
    }
}
