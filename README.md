# Pi-Project-Tips

### Helpful tips:
1. Enable the serial port on Raspberry Pi 400:
   - **Terminal**: `sudo raspi-config -> Interface Options -> Serial -> No -> Yes -> sudo reboot`
2. Enable I2C on Raspberry Pi 400:
   - **Terminal**: `sudo raspi-config -> Interface Options -> I2C -> Yes -> sudo reboot`
3. Raspberry Pi 400 serial port: **/dev/ttyS0**
4. Find I2C BME280/BMP280 Address: `i2cdetect -y 1` **(0x76 or 0x77)**
5. LoRa HAT USB => PC: **Set UART selection jumpers to A**
6. LoRa HAT Serial => Raspberry Pi 400: **Set UART selection jumpers to B**
7. Use **Serial Port Utility Tool**

### BME280/BMP280 wiring:

| BME280 | Raspberry Pi |
|--------|--------------|
| Vin    | 3.3V         |
| GND    | GND          |
| SCL    | SCL/GPIO 3   |
| SDA    | SDA/GPIO 2   |

### Helpful tools and drivers:
1. [Windows CP2102 Driver](https://files.waveshare.com/upload/6/62/CP210x_USB_TO_UART.zip)
2. [Windows Serial Port Utility](https://www.alithon.com/)

### Helpful resources:
1. [SX1262 868M LoRa HAT Hardware description](https://www.waveshare.com/wiki/SX1262_868M_LoRa_HAT#Hardware_description)
2. [BME280 Library GitHub Repository](https://github.com/Rablet/BME280)
3. [jSerialComm Usage Examples](https://github.com/Fazecast/jSerialComm/wiki/Usage-Examples)
