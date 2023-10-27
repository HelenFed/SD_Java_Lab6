import java.util.ArrayList;

public class Lab6 {
    public static void main(String[] args){
        //Залікова книга - 1128
        //Визначення варіанту C13 (=10)
        final int c13 = 1128 % 13;
        System.out.println("Варіант завдання: " + c13 + "\n");

        //Створюємо список тарифів і додаємо туди стандартний набір тарифів, в яких вже всі поля визначені
        ArrayList<Tariff> tariffs = new ArrayList<>();
        tariffs.add(new BasicTariff());
        tariffs.add(new PremiumTariff());
        tariffs.add(new FamilyTariff());

        //Уявляємо ситуацію, що компанія захотіла змінити деяку інформацію про тарифи
        //Ми перевизначаємо цю інформацію за допомогою сеттерів
        //Визначаємо нові параметри для нихки тарифів і також додаємо їх у список

        FamilyTariff familyTariff_changeDiscount = new FamilyTariff();
        familyTariff_changeDiscount.setFamilyDiscount(0.1);

        PremiumTariff premiumTariff_changeFee = new PremiumTariff();
        premiumTariff_changeFee.setSubscriptionFee(320);

        BasicTariff basicTariff_changeDataLimit = new BasicTariff();
        basicTariff_changeDataLimit.setDataLimit(2500);

        tariffs.add(familyTariff_changeDiscount);
        tariffs.add(basicTariff_changeDataLimit);
        tariffs.add(premiumTariff_changeFee);

        //В роботі реалізрваний шаблон MVC, тому створюємо нову модель, представлення та контроллер
        //Саме в цих класах буде відбуватися обробка та вивід потрібних даних

        Model model = new Model(tariffs);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processTariffs();
    }
}
