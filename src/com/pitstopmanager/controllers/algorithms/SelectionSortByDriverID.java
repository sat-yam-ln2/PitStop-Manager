/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitstopmanager.controllers.algorithms;

import com.pitstopmanager.model.DriverModel;

/**
 * SelectionSortByDriverID class provides methods for sorting an array of DriverModel objects
 * based on their driver ID using the Selection Sort algorithm.
 * 
 * This class contains:
 * - selectionSortAsc: Sorts the array in ascending order based on the driver ID.
 * - selectionSortDesc: Sorts the array in descending order based on the driver ID.
 * 
 * @author satyam
 */
public class SelectionSortByDriverID {

    /**
     * Sorts the array of DriverModel objects in ascending order based on their driver ID.
     * The method repeatedly selects the minimum element from the unsorted part of the array
     * and swaps it with the first unsorted element.
     * 
     * @param driverArray The array of DriverModel objects to sort.
     */
    public static void selectionSortAsc(DriverModel[] driverArray) {
        int n = driverArray.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  

            for (int j = i + 1; j < n; j++) {
                if (driverArray[j].getDriverId() < driverArray[minIndex].getDriverId()) {
                    minIndex = j;  
                }
            }

            DriverModel temp = driverArray[i];
            driverArray[i] = driverArray[minIndex];
            driverArray[minIndex] = temp;
        }
    }

    /**
     * Sorts the array of DriverModel objects in descending order based on their driver ID.
     * The method repeatedly selects the maximum element from the unsorted part of the array
     * and swaps it with the first unsorted element.
     * 
     * @param driverArray The array of DriverModel objects to sort.
     */
    public static void selectionSortDesc(DriverModel[] driverArray) {
        int n = driverArray.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;  

            for (int j = i + 1; j < n; j++) {
                if (driverArray[j].getDriverId() > driverArray[maxIndex].getDriverId()) {
                    maxIndex = j;  
                }
            }

            DriverModel temp = driverArray[i];
            driverArray[i] = driverArray[maxIndex];
            driverArray[maxIndex] = temp;
        }
    }
}
