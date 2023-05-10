package com.sample.drivers.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;

@JmixEntity
@Embeddable
public class LicenseInfo {
    @Column(name = "LICENSE_NUMBER")
    private String number;

    @Column(name = "EXPIRY_DATE")
    private LocalDate expiryDate;

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String licenseNumber) {
        this.number = licenseNumber;
    }
}