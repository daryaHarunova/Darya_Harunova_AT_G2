package homework.day5.playground.essence.creatures.animal.insect;


import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    public void fly(String direction){
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), name, direction));
    }
}
