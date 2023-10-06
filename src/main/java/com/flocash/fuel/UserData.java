package com.flocash.fuel;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;
import jakarta.persistence.*;

@Component
@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @Column(unique=true)
    private String userName;

    @ManyToOne
    @JoinColumn(name = "fuelStationId", referencedColumnName = "id")
    private FuelStation fuelStation;

    private String password;

    public UserData() {
    }

    public UserData(Long id) {
        this.id = id;
    }

    public UserData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public UserData(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public UserData(String firstName, String middleName, String lastName, String userName, FuelStation fuelStation, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.fuelStation = fuelStation;
        this.password = password;
    }

    public UserData(long id, String firstName, String middleName, String lastName, String userName, FuelStation fuelStation, String password) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.fuelStation = fuelStation;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public FuelStation getFuelStation() {
        return fuelStation;
    }

    public void setFuelStation(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

