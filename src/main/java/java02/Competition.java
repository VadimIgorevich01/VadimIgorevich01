package java02;

import java.util.ArrayList;

public class Competition {

    ArrayList <Participants> listParticipants = new ArrayList<>();
    public void addToParticipantsGroup(Participants participant) {
        listParticipants.add(participant);
    }

    public void showParticipants() {
        System.out.println("Список участников на данный момент: " + listParticipants);
    }

    ArrayList <Obstacles> listObstacles = new ArrayList<>();
    public void addToObstaclesGroup(Obstacles obstacle) {
        listObstacles.add(obstacle);
    }
    public void showObstacles() {
        System.out.println("Список припятствий: " + listObstacles);
    }
    boolean result;
    public void startCompetition (ArrayList<Participants> listParticipants, ArrayList<Obstacles> listObstacles, int level) {
        System.out.println("___________________________________________________");
        if (level >= 5 || level <= 0) {
            System.out.println("Уровень сложности состязания только от 1 до 4. Вы указали " + level);
        } else {
            for (int i = 0; i < listObstacles.size(); i++) {
                for (int j = 0; j < listParticipants.size(); j++) {
                    if (listParticipants.get(j) instanceof Human) {
                        Human human = (Human) listParticipants.get(j);
                        if (listObstacles.get(i) instanceof Wall) {
                            human.jump(listObstacles.get(i).createSize(level));
                        } else {
                            human.run(listObstacles.get(i).createSize(level));
                        }
                        result = human.isSuccess;
                    } else if (listParticipants.get(j) instanceof Cat) {
                        Cat cat = (Cat) listParticipants.get(j);
                        if (listObstacles.get(i) instanceof Wall) {
                            cat.jump(listObstacles.get(i).createSize(level));
                        } else {
                            cat.run(listObstacles.get(i).createSize(level));
                        }
                        result = cat.isSuccess;
                    } else {
                        Robot robot = (Robot) listParticipants.get(j);
                        if (listObstacles.get(i) instanceof Wall) {
                            robot.jump(listObstacles.get(i).createSize(level));
                        } else {
                            robot.run(listObstacles.get(i).createSize(level));
                        }
                        result = robot.isSuccess;
                    }

                    if (!result) {
                        System.out.println("Из списка участников удален " + listParticipants.get(j));
                        listParticipants.remove(j);
                        --j;
                    }
                }
            }
        }
    }
}
