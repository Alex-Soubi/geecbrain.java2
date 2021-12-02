package com.company;

public class runningTrack extends Barriers {
    private int length;

    public runningTrack(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Трасса " + super.getName() + " длинной: " + this.length);
        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("пробежал дистанцию");
            return true;
        } else {
            System.out.println("не пробежал дистанцию");
            return false;
        }
    }
}
