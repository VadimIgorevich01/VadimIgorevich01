package ru.Company.firstTask;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> goods = new ArrayList<>();
    Shop01 shop01 = new Shop01();
    
    protected String[] goodsArr = new String[shop01.capacity];
    int counter = 0;

    /**
     * Согласно задания создается здесь массив купленных товаров
     * @param product что купили
     */
    public void putInBasket(String product) {
        goods.add(product);
        goodsArr [counter] = product;
        ++counter;
    }

    public ArrayList<String> getGoods() {
        return goods;
    }
}
