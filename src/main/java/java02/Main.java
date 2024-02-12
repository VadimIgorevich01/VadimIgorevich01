package java02;

public class Main {
    public static void main(String[] args) {
        Participants human = new Human();
        Participants human2 = new Human();
        Participants cat = new Cat();
        Participants cat2 = new Cat();
        Participants robot = new Robot();
        Participants robot2 = new Robot();

        Competition competition1 = new Competition();
        competition1.addToParticipantsGroup(human);
        competition1.addToParticipantsGroup(cat);
        competition1.addToParticipantsGroup(human2);
        competition1.addToParticipantsGroup(robot);
        competition1.addToParticipantsGroup(cat2);
        competition1.addToParticipantsGroup(robot2);
        competition1.showParticipants();

        Obstacles wall = new Wall();
        Obstacles runningTrack = new RunningTrack();

        competition1.addToObstaclesGroup(runningTrack);
        competition1.addToObstaclesGroup(wall);
        competition1.showObstacles();

        competition1.startCompetition(competition1.listParticipants, competition1.listObstacles, 3);
        competition1.showParticipants();
    }
}
