package com.sample.drivers.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum DocumentType implements EnumClass<String> {

    LICENSE("L"),
    INSURANCE("I"),
    PASSPORT("P");

    private String id;

    DocumentType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DocumentType fromId(String id) {
        for (DocumentType at : DocumentType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}