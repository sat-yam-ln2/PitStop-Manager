/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitstopmanager.controllers.algorithms;

import com.pitstopmanager.model.DriverModel;

/**
 * MergeSortByTransferPrice class provides methods for sorting an array of DriverModel objects
 * by their transfer fee in either ascending or descending order using the Merge Sort algorithm.
 * 
 * This class contains:
 * - mergeSortAsc: Sorts the array in ascending order based on the transfer fee.
 * - mergeSortDesc: Sorts the array in descending order based on the transfer fee.
 * - merge: Merges two sorted subarrays into one.
 * 
 * @author satyam dulal
 */
public class MergeSortByTransferPrice {

    /**
     * Sorts the array of DriverModel objects in ascending order based on their transfer fee.
     * The method divides the array into halves recursively and merges them in sorted order.
     * 
     * @param driverArray The array of DriverModel objects to sort.
     * @param left The starting index of the array/subarray.
     * @param right The ending index of the array/subarray.
     */
    public static void mergeSortAsc(DriverModel[] driverArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortAsc(driverArray, left, mid);
            mergeSortAsc(driverArray, mid + 1, right);

            merge(driverArray, left, mid, right, true);
        }
    }

    /**
     * Sorts the array of DriverModel objects in descending order based on their transfer fee.
     * The method divides the array into halves recursively and merges them in sorted order.
     * 
     * @param driverArray The array of DriverModel objects to sort.
     * @param left The starting index of the array/subarray.
     * @param right The ending index of the array/subarray.
     */
    public static void mergeSortDesc(DriverModel[] driverArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortDesc(driverArray, left, mid);
            mergeSortDesc(driverArray, mid + 1, right);

            merge(driverArray, left, mid, right, false);
        }
    }

    /**
     * Merges two sorted subarrays into one sorted array based on the transfer fee.
     * The merging is done in either ascending or descending order depending on the `ascending` flag.
     * 
     * @param driverArray The array of DriverModel objects to merge.
     * @param left The starting index of the left subarray.
     * @param mid The ending index of the left subarray (and the middle point).
     * @param right The ending index of the right subarray.
     * @param ascending Boolean flag indicating whether to merge in ascending (true) or descending (false) order.
     */
    private static void merge(DriverModel[] driverArray, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left + 1;  
        int n2 = right - mid;     

        // Create temporary arrays for the left and right subarrays
        DriverModel[] leftArray = new DriverModel[n1];
        DriverModel[] rightArray = new DriverModel[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = driverArray[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = driverArray[mid + 1 + j];
        }

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

        while (i < n1) {
            driverArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            driverArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
