package com.sb.sampleWebApp.model;

import java.util.List;

public class Cluster {
    private int name;
    private int id;

    @Override
    public String toString() {
        return "Cluster{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public Cluster(int name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
