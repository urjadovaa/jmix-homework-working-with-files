package com.sample.drivers.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "DOCUMENT", indexes = {
        @Index(name = "IDX_DOCUMENT_DRIVER", columnList = "DRIVER_ID")
})
@Entity
public class Document {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "TYPE_", nullable = false)
    @NotNull
    private String type;

    @JoinColumn(name = "DRIVER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DocumentType getType() {
        return type == null ? null : DocumentType.fromId(type);
    }

    public void setType(DocumentType type) {
        this.type = type == null ? null : type.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}