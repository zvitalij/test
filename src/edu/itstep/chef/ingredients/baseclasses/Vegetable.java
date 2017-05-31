package edu.itstep.chef.ingredients.baseclasses;

public class Vegetable extends Ingridient {

    public Vegetable(String name, int energy, String type) {
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
