package org.selfDA;

public class Wall implements Obstacle {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public boolean testSubject (Action subject) {
        return subject.jump(wallHeight);

    }
}
