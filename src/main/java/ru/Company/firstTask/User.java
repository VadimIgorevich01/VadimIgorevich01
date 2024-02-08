package ru.Company.firstTask;

import java.util.ArrayList;

public class User {
    private String login = "user01";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login; //TODO: добавить метод создания авто логина
    }

    private String password = "123";
    public void setPassword(String password) {
        this.password = password; //TODO: добавить метод создания авто пароля
    }

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * Согласно задания создан объект класса Basket
     */
    Basket basket = new Basket();

    ArrayList <String> goods = new ArrayList<>();

    /**
     * После покупки у пользователя добавляется товар
     * @param userBasket что у него в корзине
     */
    public void showUserInventory (Basket userBasket) {
        goods = userBasket.getGoods();
        System.out.println("Товары пользователя с ID " + getId() + ": " + goods);
    }
}


