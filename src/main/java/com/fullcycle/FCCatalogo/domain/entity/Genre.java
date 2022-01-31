package com.fullcycle.FCCatalogo.domain.entity;

import java.util.UUID;

public class Genre extends BaseEntity{
    private String name;

    public Genre() {
    }

    public Genre(String name) {
        super.generateUUID();
        this.setName(name);
    }

    public Genre(UUID id, String name) {
        super.setId(id);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("");
        if (name.length() == 0) throw new IllegalArgumentException("");
        this.name = name;
    }
}
