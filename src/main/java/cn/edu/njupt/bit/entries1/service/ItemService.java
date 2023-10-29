package cn.edu.njupt.bit.entries1.service;

import cn.edu.njupt.bit.entries1.pojo.Item;

import java.util.List;

public interface ItemService {

    List<Item> listItem();

    List<Item> listShoppingCart();

    void addToCart(int id);

    void removeFromCart(int id);
}
