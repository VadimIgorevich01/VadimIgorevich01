package ru.Company.firstTask;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shop01 shop01 = new Shop01 ();
        Category category1 = new Category();
        Category category2 = new Category();

        shop01.showShopGoods();

        User user1 = new User();
        Basket userBasket1 = new Basket();
        user1.setId(1);
        userBasket1.putInBasket(category1.name1);
        userBasket1.putInBasket(category2.name2);
        shop01.addToLog (user1.getId(), userBasket1.getGoods());

        user1.showUserInventory(userBasket1);

        User user2 = new User();
        Basket userBasket2 = new Basket();
        user2.setId(2);
        userBasket2.putInBasket(category1.name7);
        userBasket2.putInBasket(category2.name6);
        userBasket2.putInBasket(category2.name5);
        shop01.addToLog (user2.getId(), userBasket2.getGoods());

        user2.showUserInventory(userBasket2);

        shop01.showLog();
        shop01.showRemainingGoods();
    }
}