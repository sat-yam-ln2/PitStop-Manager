/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitstopmanager.controllers.algorithms;

import com.pitstopmanager.model.DriverModel;

/**
 * Insertion Sort Algorithm for sorting DriverModel objects by driver name.
 *
 * This class provides methods to sort an array of DriverModel objects
 * in ascending or descending order based on the driver's name.
 *
 * @author satyam
 */
public class InsertionSortByDriverName {

    /**
     * Sorts the array of DriverModel objects in ascending order by name.
     *
     * @param driverArray Array of DriverModel objects to sort.
     */
    public static void insertionSortAsc(DriverModel[] driverArray) {
        int n = driverArray.length;
        for (int i = 1; i < n; i++) {
            DriverModel key = driverArray[i];
            int j = i - 1;

            // Move elements of driverArray[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && driverArray[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                driverArray[j + 1] = driverArray[j];
                j = j - 1;
            }
            driverArray[j + 1] = key;
        }
    }

    /**
     * Sorts the array of DriverModel objects in descending order by name.
     *
     * @param driverArray Array of DriverModel objects to sort.
     */
    public static void insertionSortDesc(DriverModel[] driverArray) {
        int n = driverArray.length;
        for (int i = 1; i < n; i++) {
            DriverModel key = driverArray[i];
            int j = i - 1;

            // Move elements of driverArray[0..i-1] that are less than key
            // to one position ahead of their current position
            while (j >= 0 && driverArray[j].getName().compareToIgnoreCase(key.getName()) < 0) {
                driverArray[j + 1] = driverArray[j];
                j = j - 1;
            }
            driverArray[j + 1] = key;
        }
    }
}

