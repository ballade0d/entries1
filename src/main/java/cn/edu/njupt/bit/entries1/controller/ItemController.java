package cn.edu.njupt.bit.entries1.controller;

import cn.edu.njupt.bit.entries1.pojo.Item;
import cn.edu.njupt.bit.entries1.service.ItemService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
@RestController
public class ItemController {

    @Resource
    private ItemService itemService;

    @GetMapping("/listItem")
    public List<Item> listItem() {
        return itemService.listItem();
    }

    @GetMapping("/listShoppingCart")
    public List<Item> listShoppingCart() {
        return itemService.listShoppingCart();
    }

    @PostMapping("/addToCart")
    public void addToCart(@RequestParam int id) {
        itemService.addToCart(id);
    }

    @PostMapping("/removeFromCart")
    public void removeFromCart(@RequestParam int id) {
        itemService.removeFromCart(id);
    }
}
