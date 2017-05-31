package edu.itstep.chef.ingredients.baseclasses;

import java.util.Comparator;

/**
 * Created by User on 14.05.2017.
 */
public abstract class Ingridient implements Comparator<Ingridient>, Comparable<Ingridient> {

    protected String name;

    protected int energy;

    protected String type;

    public Ingridient() {
        //
    }

    public Ingridient(String name, int energy, String type) {
        this.name = name;
        this.energy = energy;
        this.type = type;
    }

    public abstract String getName();

    public abstract int getEnergy();

    public abstract String getType();

    @Override
    public String toString() {
        return name + " " + energy + " " + type;
    }

    public int compare(Ingridient a, Ingridient b) {

        if (a.getEnergy() > b.getEnergy())
            return 1;
        else if (a.getEnergy() < b.getEnergy())
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Ingridient ingridient) {
        if (ingridient == null) {
            throw new NullPointerException();
        }
        if (ingridient.energy == this.energy) {
            return 0;
        } else {
            return -1;
        }
    }
}
