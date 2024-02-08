package ru.Company.firstTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GoodsMap {
    LinkedHashMap<Integer, ArrayList<String>> smartAddToBasket (String product, Integer id, LinkedHashMap <Integer, ArrayList<String>> goods) {
        if (goods.containsKey(id)) {
            ArrayList <String> numbersPhBook = new ArrayList<>(goods.get(id));
            numbersPhBook.add(product);
            goods.put(id, numbersPhBook);
        }
        else {
            ArrayList <String> numbersPhBook = new ArrayList<>();
            numbersPhBook.add(product);
            goods.put(id, numbersPhBook);
        }
        return goods;
    }
}
