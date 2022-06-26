package com.company.animals;

public abstract class Bird extends Animal implements Flight{
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
        this.moveType = MoveType.FLY;
    }

    @Override
    public void takeOff() {
        this.flyModeActive = true;
    }

    @Override
    public void landing() {
        this.flyModeActive = false;
    }

    public void isTheBirdFlying () {
        System.out.println(
                this.flyModeActive == true ? "Bird is flying" : "Duck isn't flying"
        );
    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
