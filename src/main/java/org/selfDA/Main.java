package org.selfDA;

public class Main {

    public static void main(String[] args) {
        Action[] participants = {
                new Human("Митя", 1, 4000),
                new Human("Витя", 1, 2000),
                new Cat("Барсик", 2, 3500),
                new Cat("Лиза", 2, 1500),
                new Robot("Робот1", 0, 2000),
                new Robot("Робот2", 6, 7000),

        };
        Obstacle[] obstacles = {
                new Treadmill(2700),
                new Treadmill(2300),
                new Wall(1),
                new Wall(2),

        };
        for (Action kollektparticipants : participants) {
           for (Obstacle kollektObstacle : obstacles){
               if (kollektObstacle.testSubject(kollektparticipants) == false) {
                   break;
               }
               }
        }
    }
}



