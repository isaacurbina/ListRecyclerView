package com.mobileappsco.training.day6;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 3/2/2016.
 */
public class Person extends SugarRecord {
    String name;
    String age;
    String photo;

    public Person(String name, String age, String photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }

    public Person() {

    }
}