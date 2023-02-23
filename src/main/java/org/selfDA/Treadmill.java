package org.selfDA;

public class Treadmill implements Obstacle {
    private int treadmillLength;
    public Treadmill(int treadmillLength){
        this.treadmillLength = treadmillLength;
    }

    public boolean testSubject (Action subject) {
        return subject.run(treadmillLength);
        }
}
