package cn.edu.njupt.bit.entries1.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Item {

    private final String name, brand, type;
    private final int price;
    private boolean mode = false;
}
