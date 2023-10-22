package cn.edu.njupt.bit.entries1.controller;

import cn.edu.njupt.bit.entries1.mapper.ItemMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ItemController {

    @Resource
    private ItemMapper itemMapper;

    @CrossOrigin(origins = "http://localhost:63343")
    @GetMapping("/listItem")
    public List<Map<String, Object>> listItem() {
        return itemMapper.listItem();
    }

    @CrossOrigin(origins = "http://localhost:63343")
    @GetMapping("/listShoppingCart")
    public List<Map<String, Object>> listShoppingCart() {
        return itemMapper.listShoppingCart();
    }

    @CrossOrigin(origins = "http://localhost:63343")
    @PostMapping("/addToCart")
    public void addToCart(@RequestParam int id) {
        itemMapper.addToCart(id);
    }

    @CrossOrigin(origins = "http://localhost:63343")
    @PostMapping("/removeFromCart")
    public void removeFromCart(@RequestParam int id) {
        itemMapper.removeFromCart(id);
    }
}
