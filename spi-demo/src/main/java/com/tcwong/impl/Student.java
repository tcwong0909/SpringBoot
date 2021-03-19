package com.tcwong.impl;

import com.tcwong.service.Person;

/**
 * Description
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
public class Student implements Person {
    @Override
    public void eatFood() {
        System.out.println("学生————>多喝牛奶");
    }

    @Override
    public void doSport() {
        System.out.println("学生————>多做运动");
    }
}
