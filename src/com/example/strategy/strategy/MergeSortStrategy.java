package com.example.strategy.strategy;

import java.util.Arrays;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted using Merge Sort: " + Arrays.toString(array));
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftSize)
            array[k++] = leftArray[i++];
        while (j < rightSize)
            array[k++] = rightArray[j++];
    }
}
