package ru.Company.firstTask;

import java.util.*;

public class Shop01 {
    int capacity = 100;
    LinkedHashMap <Integer, ArrayList<String>> purchase = new LinkedHashMap<>();

    String adress = "First Sk Street";
    String owner = "Andrey A.A.";

    public void addToLog(int id, ArrayList<String> goods) {
        purchase.put(id, goods);
    }

    /**
     * Вывести на консоль покупки посетителей магазина
     */
    public void showLog() {

        System.out.println("Ниже ID покупателей и их покупки в итоге: \n" + purchase);
    }

    Category category1 = new Category ();
    String [] shopGoods = new String[ ] {category1.name1, category1.name2, category1.name3,
            category1.name4, category1.name5, category1.name6, category1.name7};


    /**
     * Вывести на консоль каталог продуктов. (все продукты магазина)
     */
    public void showShopGoods() {
        System.out.println("Все продукты магазина изначально: " + Arrays.toString(shopGoods));
    }

    /**
     * После покупки из магазина удаляется товар
     */
    public void showRemainingGoods() {
        ArrayList<ArrayList<String>> purchaseValuesTwoDim = new ArrayList<>(purchase.values());
        ArrayList <String> purchaseValues = new ArrayList<>();
        for (ArrayList<String> strings : purchaseValuesTwoDim) {
            purchaseValues.addAll(strings);
        }

        System.out.println("Выводим список всех покупок: " + purchaseValues);

        List<String> remainingGoods = new LinkedList<String>(Arrays.asList(shopGoods));
        for (int i = 0; i < purchaseValues.size(); i++) {
            for (int j = 0; j < remainingGoods.size(); j++) {
                if ( purchaseValues.get(i).equals(remainingGoods.get(j)) ) {
                    remainingGoods.remove(j);
                    j = remainingGoods.size();
                }
            }
        }

        System.out.println("Выводим список оставшихся товаров в магазине: " + remainingGoods);
    }
}
