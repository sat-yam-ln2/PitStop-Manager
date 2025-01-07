/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitstopmanager.controllers.algorithms;
    
import com.pitstopmanager.model.DriverModel;

/**
 *
 * @author satyam
 */
public class SelectionSortByDriverID {

    public static void selectionSortAsc(DriverModel[] driverArray) {
        int n = driverArray.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (driverArray[j].getDriverId() < driverArray[minIndex].getDriverId()) {
                    minIndex = j;
                }
            }

            // Swap
            DriverModel temp = driverArray[i];
            driverArray[i] = driverArray[minIndex];
            driverArray[minIndex] = temp;
        }
    }

    public static void selectionSortDesc(DriverModel[] driverArray) {
        int n = driverArray.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (driverArray[j].getDriverId() > driverArray[maxIndex].getDriverId()) {
                    maxIndex = j;
                }
            }

            // Swap
            DriverModel temp = driverArray[i];
            driverArray[i] = driverArray[maxIndex];
            driverArray[maxIndex] = temp;
        }
    }
}
