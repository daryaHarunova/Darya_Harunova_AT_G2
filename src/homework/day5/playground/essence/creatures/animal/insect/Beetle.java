package homework.day5.playground.essence.creatures.animal.insect;

import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.essence.creatures.plant.vegetable.Carrot;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (mass < home.getMass()) {
            System.out.println(String.format("I am %s and I will nest there with %d my family members!", name, home.getMass() / mass)); //привести к целому
        } else {
            System.out.println(String.format("This carrot is too small for nesting"));
        }
    }
}
