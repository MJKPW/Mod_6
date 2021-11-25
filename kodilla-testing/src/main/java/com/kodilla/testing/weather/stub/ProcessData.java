package com.kodilla.testing.weather.stub;

import java.util.Map;

public class ProcessData{

    public static void mergeSort(double[] data, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(data, start, mid);
            mergeSort(data,mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    private static void merge(double[] data, int start, int mid, int end){
        double[] temp = new double[end-start+1];
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end)
            temp[k++] = (data[i] <= data[j])? data[i++]: data[j++];
        while(i <= mid)
            temp[k++] = data[i++];
        while(j <= end)
            temp[k++] = data[j++];
        for(int n=start;n<=end;n++)
            data[n] = temp[n-start];
    }

    public static double[] toArr(Map<String, Double> data){
        int index = 0;
        double[] values = new double[data.size()];
        for(String key : data.keySet()){
            values[index] = data.get(key);
            index++;
        }
        return values;
    }
}