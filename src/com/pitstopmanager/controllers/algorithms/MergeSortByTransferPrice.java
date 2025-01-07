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
public class MergeSortByTransferPrice {

    public static void mergeSortAsc(DriverModel[] driverArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSortAsc(driverArray, left, mid);
            mergeSortAsc(driverArray, mid + 1, right);

            // Merge the sorted halves
            merge(driverArray, left, mid, right, true);
        }
    }

    public static void mergeSortDesc(DriverModel[] driverArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSortDesc(driverArray, left, mid);
            mergeSortDesc(driverArray, mid + 1, right);

            // Merge the sorted halves
            merge(driverArray, left, mid, right, false);
        }
    }

    private static void merge(DriverModel[] driverArray, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        DriverModel[] leftArray = new DriverModel[n1];
        DriverModel[] rightArray = new DriverModel[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = driverArray[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = driverArray[mid + 1 + j];
        }

        // Merge the temp arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if ((ascending && leftArray[i].getTransferFee() <= rightArray[j].getTransferFee())
                    || (!ascending && leftArray[i].getTransferFee() >= rightArray[j].getTransferFee())) {
                driverArray[k] = leftArray[i];
                i++;
            } else {
                driverArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < n1) {
            driverArray[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < n2) {
            driverArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

