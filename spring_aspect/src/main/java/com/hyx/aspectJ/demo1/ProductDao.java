package com.hyx.aspectJ.demo1;

public class ProductDao {
    public void save(){
        System.out.println("保存商品。。。。。");
    }
    public String delete(){
        System.out.println("删除商品。。。。。");
        return "hello ";
    }
    public void update(){
        System.out.println("修改商品。。。。。");
    }
    public void find(){
        int i = 1/0;
        System.out.println("查询商品。。。。。");
    }
    public void findAll(){
        System.out.println("显示所有商品。。。。");
    }
}
