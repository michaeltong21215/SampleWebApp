package com.sb.sampleWebApp.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cluster {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Cluster{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public Cluster(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
