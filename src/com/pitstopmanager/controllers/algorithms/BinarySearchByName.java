/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitstopmanager.controllers.algorithms;

import com.pitstopmanager.model.DriverModel;

/**
 * Binary search algorithm to search for a driver's name in a sorted array.
 *
 * Ensure that the array is sorted by the driver's name before calling this method.
 * 
 * @author 23048597 Satyam Dulal
 */
public class BinarySearchByName {

    /**
     * Performs binary search to find a driver by name.
     *
     * @param driverArray Sorted array of DriverModel objects.
     * @param targetName The name of the driver to search for.
     * @return The index of the driver if found, or -1 if not found.
     */
    public static int binarySearchByName(DriverModel[] driverArray, String targetName) {
        int low = 0;
        int high = driverArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = driverArray[mid].getName();

            int compareResult = midName.compareToIgnoreCase(targetName);

            if (compareResult == 0) {
                return mid; // Found the target name at index mid
            } else if (compareResult < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Target name not found
    }
}

