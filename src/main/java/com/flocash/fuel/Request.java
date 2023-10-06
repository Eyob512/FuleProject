package com.flocash.fuel;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import jakarta.persistence.*;
import org.hibernate.annotations.Parameter;

import java.sql.Date;

@Component
@Entity
public class Request {

    @Id
    @GeneratedValue(generator = "Transaction-generator")
    @GenericGenerator(name = "Transaction-generator",
            parameters = @Parameter(name = "prefix", value = "CBEF00000000"),
            strategy = "com.flocash.fuel.MyGenerator")
    private String id;

    private String plateNo;
    private String fuleType;
    private float amount;
    private Date date;
    private String cardNumber;

    private String plateRegion;
    private String plateCode;
    private int sourceId = 4;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserData user;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "fuelStationId", referencedColumnName = "id")
    private FuelStation fuelStation;

    public Request() {
    }

    public Request(String id) {
        this.id = id;
    }

    public Request(String plateNo, String fuleType, float amount, Date date, String cardNumber, String plateRegion, String plateCode, int sourceId, FuelStation fuelStation, UserData user) {
        this.plateNo = plateNo;
        this.fuleType = fuleType;
        this.amount = amount;
        this.date = date;
        this.cardNumber = cardNumber;
        this.plateRegion = plateRegion;
        this.plateCode = plateCode;
        this.sourceId = sourceId;
        this.fuelStation = fuelStation;
        this.user = user;
    }

    public Request(String id, String plateNo, String fuleType, float amount, Date date, String cardNumber, String plateRegion, String plateCode, int sourceId, FuelStation fuelStation, UserData user) {
        this.id = id;
        this.plateNo = plateNo;
        this.fuleType = fuleType;
        this.amount = amount;
        this.date = date;
        this.cardNumber = cardNumber;
        this.plateRegion = plateRegion;
        this.plateCode = plateCode;
        this.sourceId = sourceId;
        this.fuelStation = fuelStation;
        this.user = user;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getId() {
        return id;
    }

    public String getPlateRegion() {
        return plateRegion;
    }

    public void setPlateRegion(String plateRegion) {
        this.plateRegion = plateRegion;
    }

    public String getPlateCode() {
        return plateCode;
    }

    public void setPlateCode(String plateCode) {
        this.plateCode = plateCode;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public FuelStation getFuelStation() {
        return fuelStation;
    }

    public void setFuelStation(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }
}
