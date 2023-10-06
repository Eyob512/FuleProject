package com.flocash.fuel;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
public class FuelStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;

    private String name;

    private String address;

    public FuelStation() {
    }

    public FuelStation(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public FuelStation(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public FuelStation(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
