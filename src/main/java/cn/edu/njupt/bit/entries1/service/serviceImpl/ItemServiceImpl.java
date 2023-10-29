package cn.edu.njupt.bit.entries1.service.serviceImpl;

import cn.edu.njupt.bit.entries1.mapper.ItemMapper;
import cn.edu.njupt.bit.entries1.pojo.Item;
import cn.edu.njupt.bit.entries1.service.ItemService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Override
    public List<Item> listItem() {
        return itemMapper.listItem();
    }

    @Override
    public List<Item> listShoppingCart() {
        return itemMapper.listShoppingCart();
    }

    @Override
    public void addToCart(int id) {
        itemMapper.addToCart(id);
    }

    @Override
    public void removeFromCart(int id) {
        itemMapper.removeFromCart(id);
    }
}
