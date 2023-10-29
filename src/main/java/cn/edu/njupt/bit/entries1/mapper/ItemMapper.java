package cn.edu.njupt.bit.entries1.mapper;

import cn.edu.njupt.bit.entries1.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ItemMapper {

    List<Item> listItem();

    List<Item> listShoppingCart();

    void addToCart(@Param("id") int id);

    void removeFromCart(@Param("id") int id);
}
