package edu.itstep.chef.compare;

import edu.itstep.chef.ingredients.baseclasses.Ingridient;

import java.util.Comparator;

/**
 * Created by User on 14.05.2017.
 */
public class CompareSortByEnergy implements Comparator<Ingridient> {

    @Override
    public int compare(Ingridient ingridient1, Ingridient ingridient2) {

        int energy1 = ingridient1.getEnergy();
        int energy2 = ingridient2.getEnergy();

        if (energy1 > energy2) {
            return 1;
        } else if (energy1 < energy2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Comparator<Ingridient> reversed() {
        return null;
    }
}
