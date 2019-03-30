package com.panion.space.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: springboot-jpa
 * @desciption: 用户
 * @author: QiMing
 * @create: 2019-03-30 16:37
 */
@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue//自增
    private int id;

    @Column(length = 20)
    private String name;

    @Column
    private int age;

    @Column
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User() {
    }
}
