/*Наслідування досягається за допомогою ключвого слова extends.
Підклас вказує ім'я батьківського класу після ключового слова extends,
і отримує всі властивості та методи батьківського класу.
 */

public class FamilyTariff extends Tariff{
    //Приватні поля, які характерне тільки для цього підкласу
    private int familyMembers;
    private double familyDiscount;

    /*
    Конструктор підкласу може мати свої власні параметри,
    а також викликати конструктор батьківського класу через super.
    Заздалегідь задаємо якісь початкові значення.
    */
    public FamilyTariff(){
        super("Family", 250, 2000);
        this.familyMembers = 4;
        this.familyDiscount = 0.2;
    }

    //Getters і setters для полів, які властиві лише цьому підкласу
    public int getFamilyMembers(){
        return familyMembers;
    }

    public double getFamilyDiscount(){
        return familyDiscount;
    }

    public void setFamilyMembers(int familyMembers){
        this.familyMembers = familyMembers;
    }

    public void setFamilyDiscount(double familyDiscount){
        this.familyDiscount = familyDiscount;
    }

    //Метод, який виводить інформацію про цей тип тарифу, включаючи інформацію, яка властива тільки цьому типу
    public void printTariff(){
        System.out.println("Тип тарифу: " + getName() + "\nВартість тарифу: " + getSubscriptionFee() +
                "\nКількість можливих клієнтів: " + getNumberOfCustomers() +
                "\nКількість людей у родині: " + familyMembers +
                "\nЗнижка для родини: " + familyDiscount + "\n");
    }
}
