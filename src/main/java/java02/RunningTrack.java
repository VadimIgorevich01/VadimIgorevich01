package java02;

public class RunningTrack implements Obstacles{
    @Override
    public String toString() {
        return "Беговая дорожка";
    }

    @Override
    public int createSmallSize() {
        return 1;
    }

    @Override
    public int createModerateSize() {
        return 3;
    }

    @Override
    public int createBigSize() {
        return 7;
    }

    @Override
    public int createInsaneSize() {
        return 20;
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
