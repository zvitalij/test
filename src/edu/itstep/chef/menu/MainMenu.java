package edu.itstep.chef.menu;

import edu.itstep.chef.compare.CompareSortByEnergy;
import edu.itstep.chef.ingredients.baseclasses.Ingridient;
import edu.itstep.chef.ingredients.baseclasses.Vegetable;
import edu.itstep.chef.ingredients.ingridients.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by User on 14.05.2017.
 */
public class MainMenu {

    private ArrayList<Ingridient> salad = new ArrayList<Ingridient>();

    public void getMainMenu() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("---------------\n" +
                    "Menu level 1:\n" +
                    "1. Создать салат\n" +
                    "2. Просмотр салата\n" +
                    "3. Сортировка по калорийности\n" +
                    "4. Поиск по калорийности\n" +
                    "0. Выход");
            int menu1 = Integer.valueOf(bf.readLine());

            switch (menu1) {
                case 0:
                    System.out.println("Выход");
                    System.exit(0);
                    break;
                case 1:
                    boolean while2 = true;
                    while (while2) {
                        System.out.println("Добавьте ингридиент:");
                        System.out.println("1. Огурец\n" +
                                "2. Томат\n" +
                                "3. Масло\n" +
                                "4. Сметана\n" +
                                "5. Соль\n" +
                                "0. Выход");
                        int menu2 = Integer.valueOf(bf.readLine());
                        switch (menu2) {
                            case 0:
                                while2 = false;
                                break;
                            case 1:
                                salad.add(new Cucumber());
                                break;
                            case 2:
                                salad.add(new Tomat());
                                break;
                            case 3:
                                salad.add(new SunflowerOil());
                                break;
                            case 4:
                                salad.add(new SourCream());
                                break;
                            case 5:
                                salad.add(new Salt());
                                break;
                        }
                    }
                    break;
                case 2:
                    Iterator iterator = salad.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    salad.sort(new CompareSortByEnergy());
                    break;
                case 4:
                    System.out.println("Введите калорийность:");
                    int energy = Integer.valueOf(bf.readLine());
                    int pos = Collections.binarySearch(salad, new Vegetable(null, energy, null));
                    if (pos >= 0) {
                        System.out.println(salad.get(pos).toString());
                    } else System.out.println("Ничего не найдено!");
                    break;
            }
        }
    }
}
