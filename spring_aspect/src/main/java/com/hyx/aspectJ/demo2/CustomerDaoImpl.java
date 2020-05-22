package com.hyx.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao{
    public void save(){
        System.out.println("保存客户。。。。。");
    }
    public String delete(){
        System.out.println("删除客户。。。。。");
        return "hello ";
    }
    public void update(){
        System.out.println("修改客户。。。。。");
    }
    public void find(){

        System.out.println("查询客户。。。。。");
    }
    public void findAll(){
        System.out.println("显示所有客户。。。。");
    }
}
