package java02;

import java.util.Random;

public class Human extends Alive {
    boolean isSuccess;
    static int count = 0;
    int localCount;
    int humanLimitRun = 5;
    int humanLimitJump = 80;

    public Human() {
        Random rn = new Random();
        int randomRun = rn.nextInt(5 + 1);
        this.humanLimitRun = humanLimitRun + randomRun;
        int randomJump = rn.nextInt(65 + 1);
        this.humanLimitJump = humanLimitJump + randomJump;
        ++count;
        localCount = count;
        System.out.printf("Случайный человек " + localCount + ". Прыгает максимум: " + humanLimitJump + ", бегает: " + humanLimitRun + "\n");
    }

    @Override
    public String toString() {
        return "Человек " + localCount;
    }


    void run (int runningTrack) {
        if (humanLimitRun >= runningTrack) {
            isSuccess = true;
            System.out.println("Человек " + localCount + " смог пробежать дистанцию " + runningTrack);
        } else {
            isSuccess = false;
            System.out.println("Человек " + localCount + " не смог пробежать дистанцию " + runningTrack + ". Его лимит " + humanLimitRun);
        }
    }
    void jump (int WallHeight) {
        if (humanLimitJump >= WallHeight) {
            System.out.println("Человек " + localCount + " смог перепрыгнуть стенку высоты " + WallHeight);
            isSuccess = true;
        } else {
            isSuccess = false;
            System.out.println("Человек " + localCount + " не смог перепрыгнуть стенку высоты " + WallHeight + ". Его лимит " + humanLimitJump);
        }
    }
}
