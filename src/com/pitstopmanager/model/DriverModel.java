/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    /**
     * Gets the driver's unique identifier.
     * 
     * @return The driver's ID.
     */
    public int getDriverId() {
        return driverId;
    }

    /**
     * Sets the driver's unique identifier.
     * 
     * @param driverId The driver's ID to set.
     */
    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    /**
     * Gets the driver's name.
     * 
     * @return The driver's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the driver's name.
     * 
     * @param name The name to set for the driver.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the driver's age.
     * 
     * @return The driver's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the driver's age.
     * 
     * @param age The age to set for the driver.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the driver's years of experience.
     * 
     * @return The driver's experience in years.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the driver's years of experience.
     * 
     * @param experience The experience to set for the driver.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Gets the driver's current team.
     * 
     * @return The driver's current team.
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the driver's current team.
     * 
     * @param team The team to set for the driver.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Gets the number of wins achieved by the driver.
     * 
     * @return The number of wins.
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the number of wins achieved by the driver.
     * 
     * @param wins The wins to set for the driver.
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Gets the duration of the driver's contract in years.
     * 
     * @return The contract duration in years.
     */
    public int getContractDuration() {
        return contractDuration;
    }

    /**
     * Sets the duration of the driver's contract in years.
     * 
     * @param contractDuration The contract duration to set for the driver.
     */
    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    /**
     * Gets the transfer fee associated with the driver.
     * 
     * @return The transfer fee.
     */
    public double getTransferFee() {
        return transferFee;
    }

    /**
     * Sets the transfer fee associated with the driver.
     * 
     * @param transferFee The transfer fee to set for the driver.
     */
    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }
}