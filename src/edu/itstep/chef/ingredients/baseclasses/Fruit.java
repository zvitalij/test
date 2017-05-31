package edu.itstep.chef.ingredients.baseclasses;

/**
 * Created by User on 14.05.2017.
 */
public class Fruit extends Ingridient {

    public Fruit(String name, int energy, String type) {
        super(name, energy, type);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public String getType() {
        return type;
    }
}
