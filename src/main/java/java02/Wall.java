package java02;

public class Wall implements Obstacles{

    @Override
    public String toString() {
        return "Стена";
    }

    @Override
    public int createSmallSize() {
        return 30;
    }

    @Override
    public int createModerateSize() {
        return 70;
    }

    @Override
    public int createBigSize() {
        return 140;
    }

    @Override
    public int createInsaneSize() {
        return 200;
    }
    @Override
    public int createSize(int level) {
        if (level == 1) {
            return createSmallSize();
        } else if (level == 2) {
            return createModerateSize();
        } else if (level == 3) {
            return createBigSize();
        } else {
            return createInsaneSize();
        }
    }
}
