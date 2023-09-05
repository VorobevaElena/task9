package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) throws IOException {
            System.out.println("Введите размер массива");
            Scanner scanSize = new Scanner(System.in);
            int size = scanSize.nextInt();
            double[] array = new double[size];
            System.out.println("Заполните массив через энтер");
            for (int i=0; i<array.length; i++)
            {
                Scanner Date = new Scanner(System.in);
                double arrayDate = Date.nextDouble();
                array[i]=arrayDate;
            }
            double sum=0;
            for (int i = 0; i < size; i++) {
               sum=sum+ array[i];
            }
            double aver=sum/size;
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]*aver + " ");
            }
        }
    }
