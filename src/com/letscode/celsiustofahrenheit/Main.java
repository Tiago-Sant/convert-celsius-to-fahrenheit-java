package com.letscode.celsiustofahrenheit;

import com.letscode.celsiustofahrenheit.services.Calculator;
import com.letscode.celsiustofahrenheit.utils.ScannerTemperature;

public class Main {

    public static void main(String[] args) {
        final float CELSIUS = ScannerTemperature.getCelsiusTemperature();

        final float FAHRENHEIT = Calculator.convertCelsiusToFahrenheit(CELSIUS);

        System.out.printf("Celsius: %.1f ºC %n Fahrenheit: %.1f ºF", CELSIUS, FAHRENHEIT);
    }
}
