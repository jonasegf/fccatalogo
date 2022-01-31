package com.fullcycle.FCCatalogo.domain.entity;

import java.util.HashMap;
import java.util.Map;

enum CastMemberType {
    TYPE1(1),
    TYPE2(2);

    private Integer type;
    private final static Map values = new HashMap<>();

    private CastMemberType(Integer type) {
        this.type = type;
    }

    static {
        for (CastMemberType type : CastMemberType.values()) {
            values.put(type.type, type);
        }
    }

    public Integer getType() {
        return type;
    }

    public static Boolean valueOf(CastMemberType type) {
        CastMemberType castMemberType = (CastMemberType) values.get(type);
        return castMemberType != null;
    }


}
