package com.tcwong;

import com.tcwong.service.Person;

import java.util.ServiceLoader;

public class SpiDemoApplication {

    public static void main(String[] args) {
        ServiceLoader<Person> serviceLoader = ServiceLoader.load(Person.class);
        serviceLoader.forEach(person -> {
            person.doSport();
            person.eatFood();
        });
    }
}
