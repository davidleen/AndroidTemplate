package com.example.david.beans;

import java.io.Serializable;

/**
 * Created by davidleen29@gmail.com on 14-2-18.
 */
public class Dictionary   implements Serializable {


    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dictionary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
