package org.selfDA;

public class Cat implements Action {

    private int maxJump;
    private int maxRun;
    private String name;


    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;

    }

    public boolean jump(int height) {
        if (height > maxJump) {
            System.out.println(name + " не смог перепрыгнуть " + height  + " метров.");
            return false;
        }
        else {
            System.out.println(name + " перепрыгнул " + height + " метров.");
            return true;
        }

    }

    public boolean run(int range) {
        if (range > maxRun) {
            System.out.println(name + " не смог пробежать " + range + " метров.");
            return false;
        }
        else {
            System.out.println(name + " пробежал " + range + " метров.");
            return true;
        }
    }
}
