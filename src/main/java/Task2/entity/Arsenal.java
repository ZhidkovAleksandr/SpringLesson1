package Task2.entity;

import Task2.Interfaces.Defend;

public class Arsenal implements Defend {
    @Override
    public void toDefend() {
        System.out.println("With the help of weapons the knight defended the castle");
    }
}
