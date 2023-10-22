package cn.edu.njupt.bit.entries1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ItemMapper {

    List<Map<String, Object>> listItem();

    List<Map<String, Object>> listShoppingCart();

    void addToCart(@Param("id") int id);

    void removeFromCart(@Param("id") int id);
}
