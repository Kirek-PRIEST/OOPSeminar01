import client.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat nyaasu = new Cat("Мяут", 4, LocalDate.of(2022, 11, 27), new Owner());
        Seel seal = new Seel("Сфил", 39, LocalDate.of(2023, 05, 14), new Owner() );
        FlyingFish flyingFish = new FlyingFish("Шарпедо", 88, LocalDate.of(1975, 7, 18), new Owner());
        System.out.println(nyaasu.getType());
        System.out.println(nyaasu);
        System.out.println("Навыки:");
        nyaasu.skills();
        System.out.println();
        System.out.println(seal.getType());
        System.out.println(seal);
        System.out.println("Навыки:");
        seal.skills();
        System.out.println();
        System.out.println(flyingFish.getType());
        System.out.println(flyingFish);
        System.out.println("Навыки:");
        flyingFish.skills();

    }
}