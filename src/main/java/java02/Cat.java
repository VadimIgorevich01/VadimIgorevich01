package java02;

import java.util.Random;

public class Cat extends Alive {
    static int count = 0;
    public boolean isSuccess;
    int localCount;
    int catLimitRun = 4;
    int catLimitJump = 150;

    @Override
    public String toString() {
        return "Кот " + localCount;
    }

    public Cat() {
        Random rn = new Random();
        int randomRun = rn.nextInt(3 + 1);
        this.catLimitRun = catLimitRun + randomRun;
        int randomJump = rn.nextInt(50 + 1);
        this.catLimitJump = catLimitJump + randomJump;
        ++count;
        localCount = count;
        System.out.printf("Случайный кот " + localCount + ". Прыгает максимум: " + catLimitJump + ", бегает: " + catLimitRun + "\n");
    }


    void run (int runningTrack) {
        if (catLimitRun >= runningTrack) {
            isSuccess = true;
            System.out.println("Кот " + localCount + " смог пробежать дистанцию " + runningTrack);
        } else {
            isSuccess = false;
            System.out.println("Кот " + localCount + " не смог пробежать дистанцию " + runningTrack + ". Его лимит " + catLimitRun);
        }
    }
    void jump (int WallHeight) {
        if (catLimitJump >= WallHeight) {
            isSuccess = true;
            System.out.println("Кот " + localCount + " смог перепрыгнуть стенку высоты " + WallHeight);
        } else {
            isSuccess = false;
            System.out.println("Кот " + localCount + " не смог перепрыгнуть стенку высоты " + WallHeight + ". Его лимит " + catLimitJump);
        }
    }
}
