package com.letscode.celsiustofahrenheit.utils;

import java.util.Scanner;

public class ScannerTemperature {

    public static float getCelsiusTemperature(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius:");
        float celsiusTemperature = sc.nextFloat();
        return celsiusTemperature;
    }
}
