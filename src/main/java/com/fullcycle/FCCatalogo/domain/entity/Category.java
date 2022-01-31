package com.fullcycle.FCCatalogo.domain.entity;

import java.util.UUID;

public class Category {
  private UUID id;
  private String name;

  public Category(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public Category(String name) {
    this.name = name;
  }

  public Category() {
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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
