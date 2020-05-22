package com.hyx.ioc.demo3;

public class Sex {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
