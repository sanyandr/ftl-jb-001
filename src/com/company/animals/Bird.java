package com.company.animals;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        super();
        this.canFly = true;
    }

    public final void takeOff() {
        flyModeActive = true;
    }

     public final void landing() {
        flyModeActive = false;
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
