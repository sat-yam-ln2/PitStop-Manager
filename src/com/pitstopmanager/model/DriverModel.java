package com.pitstopmanager.model;

/**
 * A model class representing a driver with simplified attributes.
 * 
 * Attributes:
 * - driver_id: Unique identifier for the driver.
 * - name: Name of the driver.
 * - age: Age of the driver.
 * - experience: Years of experience.
 * - team: Current team of the driver.
 * - wins: Number of wins achieved by the driver.
 * - contractDuration: Duration of the driver's contract in years.
 * - transferFee: Transfer fee associated with the driver.
 * 
 * @author satyam
 */
public class DriverModel {

    private int driverId;
    private String name;
    private int age;
    private int experience;
    private String team;
    private int wins;
    private int contractDuration;
    private double transferFee;

    /**
     * Constructs a DriverModel instance with specified attributes.
     * 
     * @param driverId Unique identifier for the driver.
     * @param name Name of the driver.
     * @param age Age of the driver.
     * @param experience Years of experience.
     * @param team Current team of the driver.
     * @param wins Number of wins achieved by the driver.
     * @param contractDuration Duration of the driver's contract in years.
     * @param transferFee Transfer fee associated with the driver.
     */
    public DriverModel(int driverId, String name, int age, int experience, 
                       String team, int wins, int contractDuration, double transferFee) {
        this.driverId = driverId;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.team = team;
        this.wins = wins;
        this.contractDuration = contractDuration;
        this.transferFee = transferFee;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }
}
