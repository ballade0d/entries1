CREATE DATABASE IF NOT EXISTS entries1;
USE entries1;

DROP TABLE IF EXISTS shoppingList;
CREATE TABLE shoppingList
(
    id       int(10) primary key auto_increment,
    name     varchar(50),
    brand    varchar(50),
    price    int(10),
    category varchar(50),
    mode     TINYINT(1)
);

INSERT INTO shoppingList
    (id, name, brand, price, category, mode)
VALUES (null, '华为mate60', '华为', 6999, '数码产品', 0),
       (null, '华为mate60pro', '华为', 7999, '数码产品', 0),
       (null, '小米13', '小米', 4299, '数码产品', 0),
       (null, '小米13pro', '小米', 4299, '数码产品', 0),
       (null, '小米13u', '小米', 5999, '数码产品', 0),
       (null, '小米12s', '小米', 2599, '数码产品', 0),
       (null, '魅族20pro', '魅族', 2999, '数码产品', 0),
       (null, 'iqoo11', 'iqoo', 2599, '数码产品', 0),
       (null, 'iqoo11s', 'iqoo', 4299, '数码产品', 0),
       (null, 'iphone15', 'iphone', 8999, '数码产品', 0),
       (null, '雕牌洗衣液', '雕牌', 32, '生活用品', 0),
       (null, '蓝月亮洗衣液', '蓝月亮', 42, '生活用品', 0),
       (null, '舒肤佳沐浴露', '舒肤佳', 19, '生活用品', 0),
       (null, '飘柔洗发水', '飘柔', 21, '生活用品', 0),
       (null, '海飞丝洗发水', '海飞丝', 15, '生活用品', 0),
       (null, '黑人牙膏', '黑人牙膏', 18, '生活用品', 0),
       (null, '云南白药牙膏', '云南白药', 26, '生活用品', 0),
       (null, '云南白药创可贴', '云南白药', 5, '生活用品', 0),
       (null, '维达抽纸', 'Vinda', 5, '生活用品', 0),
       (null, '云南白药护手霜', '云南白药', 39, '生活用品', 0),
       (null, '《活着》', '余华作', 64, '图书', 0),
       (null, '《三体》', '刘慈欣作', 96, '图书', 0),
       (null, '《坟》', '鲁迅作', 59, '图书', 0),
       (null, '《百年孤独》', '马尔克斯作', 60, '图书', 0),
       (null, '《围城》', '钱钟书作', 45, '图书', 0),
       (null, '《边城》', '沈从文作', 88, '图书', 0),
       (null, '《呼兰河传》', '萧红作', 30, '图书', 0),
       (null, '《蛙》', '莫言作', 50, '图书', 0),
       (null, '《白鹿原》', '陈忠实作', 58, '图书', 0),
       (null, '《平凡的世界》', '路遥作', 60, '图书', 0);
