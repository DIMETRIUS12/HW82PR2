//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amout = 300;
        int replenish = 1300;
        int balance = amout + replenish;


        int bonus = replenish / 100;
        if (replenish < 1100) {
            bonus = 0;
        }

        if (replenish > 1000) {
            bonus = bonus;
        }


        System.out.println("Итоговая сумма = " + (balance + bonus));
    }
}