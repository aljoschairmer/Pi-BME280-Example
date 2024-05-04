package com.aljoscha;

import dev.rablet.bme280.BME280Client;
import dev.rablet.bme280.model.BME280Data;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BME280Client bme280 = new BME280Client("linuxfs-i2c", "BME280", 1, 0x76);
        while(true){
            BME280Data data = bme280.getBME280Data();
            System.out.println("Data  = " + data.toString());
        }
    }
}