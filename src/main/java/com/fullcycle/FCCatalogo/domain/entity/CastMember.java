package com.fullcycle.FCCatalogo.domain.entity;

import java.util.UUID;

public class CastMember extends BaseEntity{
    private String name;
    private CastMemberType castMemberType;

    public CastMember() {
    }

    public CastMember(UUID id, String name, CastMemberType castMemberType) {
        super.setId(id);
        this.setName(name);
        this.setCastMemberType(castMemberType);
    }

    public CastMember( String name, CastMemberType castMemberType) {
        super.generateUUID();
        this.setName(name);
        this.setCastMemberType(castMemberType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("");
        if (name.length() == 0) throw new IllegalArgumentException("");
        this.name = name;
    }

    public CastMemberType getCastMemberType() {
        return castMemberType;
    }

    public void setCastMemberType(CastMemberType castMemberType) {
        if (castMemberType == null) throw new IllegalArgumentException("");
        if (!CastMemberType.valueOf(castMemberType)) throw new IllegalArgumentException("");
        this.castMemberType = castMemberType;
    }
}
