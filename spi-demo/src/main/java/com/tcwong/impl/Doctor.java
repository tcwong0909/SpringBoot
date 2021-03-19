package com.tcwong.impl;

import com.tcwong.service.Person;

/**
 * Description
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
public class Doctor implements Person {
    @Override
    public void eatFood() {
        System.out.println("医生————>多吃蔬菜");
    }

    @Override
    public void doSport() {
        System.out.println("医生————>多多休息");
    }
}
