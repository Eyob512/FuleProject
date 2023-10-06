package com.flocash.fuel;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UserDto {

    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private long fuelStationId;

    private String errorMessage;

    public UserDto() {
    }

    public UserDto(long id, String firstName, String middleName, String lastName, String userName, long fuelStationId) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.fuelStationId = fuelStationId;
    }

    public UserDto(String userName, String errorMessage) {
        this.userName = userName;
        this.errorMessage = errorMessage;
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

    public long getFuelStationId() {
        return fuelStationId;
    }

    public void setFuelStationId(long fuelStationId) {
        this.fuelStationId = fuelStationId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
