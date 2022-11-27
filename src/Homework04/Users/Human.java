package Homework04.Users;

import Homework04.Users.User;

public class Human extends User {

    public Human(double maxRunLength, double maxJumpHeight) {
        super(maxRunLength, maxJumpHeight);
    }

    @Override
    public double run(double length) {
        return super.run(length);
    }

    @Override
    public double jump(double height) {
        return super.jump(height);
    }

    @Override
    public double getMaxRunLength() {
        return super.getMaxRunLength();
    }

    @Override
    public void setMaxRunLength(double maxRunLength) {
        super.setMaxRunLength(maxRunLength);
    }

    @Override
    public double getMaxJumpHeight() {
        return super.getMaxJumpHeight();
    }

    @Override
    public void setMaxJumpHeight(double maxJumpHeight) {
        super.setMaxJumpHeight(maxJumpHeight);
    }

    @Override
    public String toString() {
        return "Human";
    }
}
