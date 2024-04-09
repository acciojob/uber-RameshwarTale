package com.driver.model;


import javax.persistence.*;

@Entity
@Table(name = "Cab")
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cabId;

    private boolean isAvailable;

    private int perKmRate;


    @OneToOne
    @JoinColumn
    private Driver driver;

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}