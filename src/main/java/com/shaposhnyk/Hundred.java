package com.shaposhnyk;

public class Hundred {

    private final String entity;

    public Hundred(String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return entity;
    }

    public String compute(String source) {
        return source.substring(3, source.lastIndexOf("/"));
    }
}
