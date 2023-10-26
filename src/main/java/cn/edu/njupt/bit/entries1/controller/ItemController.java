package cn.edu.njupt.bit.entries1.controller;

import cn.edu.njupt.bit.entries1.mapper.ItemMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:63343", "http://localhost:63342"})
@RestController
public class ItemController {

    @Resource
    private ItemMapper itemMapper;

    @GetMapping("/listItem")
    public List<Map<String, Object>> listItem() {
        return itemMapper.listItem();
    }

    @GetMapping("/listShoppingCart")
    public List<Map<String, Object>> listShoppingCart() {
        return itemMapper.listShoppingCart();
    }

    @PostMapping("/addToCart")
    public void addToCart(@RequestParam int id) {
        itemMapper.addToCart(id);
    }

    @PostMapping("/removeFromCart")
    public void removeFromCart(@RequestParam int id) {
        itemMapper.removeFromCart(id);
    }
}
