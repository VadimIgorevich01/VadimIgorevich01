package java02;

public class Alive extends Participants {
    public Alive() {
        System.out.printf("Готов к состязанию: ");
    }

    @Override
    void run () {
        System.out.println("Участник побегал на месте");
    }

    @Override
    void jump() {
        System.out.println("Участник подпрыгнул на месте");
    }
}
