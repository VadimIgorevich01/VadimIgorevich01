package java02;

import java.util.Random;

public class Robot extends Tech {
    static int count = 0;
    public boolean isSuccess;
    int localCount;
    @Override
    public String toString() {
        return "Робот " + localCount;
    }

    int remainingBattery = super.batteryValue;
    int robotLimitRun = 100;
    int robotLimitJump = 500;
    int actPowerConsumption = 20;
    public Robot() {
        ++count;
        localCount = count;
        System.out.printf(". Это робот " + localCount + ". Прыгает максимум всегда: " + robotLimitJump + ", бегает всегда: " + robotLimitRun + "\n");
    }

    public Robot(int batteryCharge) {
        super(batteryCharge);
        System.out.printf(". Это робот\n");
    }


    void run (int runningTrack) {
        if (remainingBattery > actPowerConsumption) {
            run1(runningTrack);
        } else {
            isSuccess = false;
            System.out.println("Недостаточно энергии у робота " + localCount + ". Для действия минимум нужно " + actPowerConsumption + ". Текущий заряд " + remainingBattery);
        }
    }
    void jump (int WallHeight) {
        if (remainingBattery > actPowerConsumption) {
            jump1(WallHeight);
        } else {
            isSuccess = false;
            System.out.println("Недостаточно энергии у робота " + localCount + ". Для действия минимум нужно " + actPowerConsumption + ". Текущий заряд " + remainingBattery);
        }
    }


    private void run1 (int runningTrack) {
        if (robotLimitRun >= runningTrack) {
            isSuccess = true;
            remainingBattery -= actPowerConsumption;
            System.out.println("Робот " + localCount + " смог пробежать дистанцию " + runningTrack + ". Его оставшийся заряд " + remainingBattery);
        } else {
            isSuccess = false;
            System.out.println("Робот " + localCount + " не смог пробежать дистанцию " + runningTrack + ". Его лимит " + robotLimitRun);
        }
    }
    private void jump1 (int WallHeight) {
        if (robotLimitJump >= WallHeight) {
            isSuccess = true;
            remainingBattery -= actPowerConsumption;
            System.out.println("Робот " + localCount + " смог перепрыгнуть стенку высоты " + WallHeight + ". Его оставшийся заряд " + remainingBattery);
        } else {
            isSuccess = false;
            System.out.println("Робот " + localCount + " не смог перепрыгнуть стенку высоты " + WallHeight + ". Его лимит " + robotLimitJump);
        }
    }
    void printCount () {
        System.out.println("count = " + count);
    }

}
