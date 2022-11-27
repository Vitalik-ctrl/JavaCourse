package Homework04.Users;

import Homework04.Obstructions.Obstruction;
import Homework04.Obstructions.Track;
import Homework04.Obstructions.Wall;

public class User {

    private double maxRunLength;
    private double maxJumpHeight;

    public User(double maxRunLength, double maxJumpHeight) {
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public double run(double length) {
        return length;
    }

    public double jump(double height) {
        return height;
    }

    public double getMaxRunLength() {
        return maxRunLength;
    }

    public void setMaxRunLength(double maxRunLength) {
        this.maxRunLength = maxRunLength;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public void overcomeObstructions(Obstruction[] obstructions) {
        double distance = 0;
        for (Obstruction obstruction : obstructions) {
            if (Wall.class.equals(obstruction.getClass())) {
                if (obstruction.overcome() <= this.getMaxJumpHeight()) {
                    distance += 1;
                    System.out.println(this + " passed an obstruction " + obstruction + " over " + obstruction.overcome() + " meters. All passed distance - " + distance + " meters.");
                } else {
                    System.out.println(this + " didn't passed an obstruction " + obstruction + " at a height of " + obstruction.overcome() + " meters. Passed " + distance + " meters.");
                    return;
                }
            } else if (Track.class.equals(obstruction.getClass())) {
                if (obstruction.overcome() <= this.getMaxRunLength()) {
                    distance += ((Track) obstruction).getLength();
                    System.out.println(this + " passed an obstruction " + obstruction + " over " + obstruction.overcome() + " meters. All passed distance - " + distance + " meters.");
                } else {
                    System.out.println(this + " didn't passed an obstruction " + obstruction + " at a length of " + obstruction.overcome() + " meters. Passed " + distance + " meters.");
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
