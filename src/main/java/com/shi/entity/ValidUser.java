package com.shi.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class ValidUser {

    @Max(value = 100)
    @Min(value = 18)
    private int age;

    @NotEmpty(message = "密码不能为空")
    private String pass;

    @NotEmpty(message = "姓名不能为空")
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ValidUser{" +
                "age=" + age +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
