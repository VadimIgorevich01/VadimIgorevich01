package java02;

import java.util.Random;

public class Tech extends Participants {
    int count = 0;
    int batteryValue;
    public Tech () {
        Random r = new Random();
        int randomValue = r.nextInt(100) + 1;
        this.batteryValue = randomValue;
        System.out.printf("Готов к состязанию: Механизм со случайным зарядом батареи. Его процент заряда " + randomValue);
    }
    public Tech (int batteryCharge) {
        if (batteryCharge > 100) {
            this.batteryValue = 100;
        } else if (batteryCharge < 0) {
            this.batteryValue = 0;
        } else {
            this.batteryValue = batteryCharge;
        }
        System.out.printf("Был взят механизм с зарядом " + batteryCharge);
    }
    @Override
    void run() {
        System.out.println("Некий механизм подергался");

    }

    @Override
    void jump() {
        System.out.println("Некий механизм поскакал");
    }

}
