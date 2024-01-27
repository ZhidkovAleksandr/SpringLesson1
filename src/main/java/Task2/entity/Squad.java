package Task2.entity;

import Task2.Interfaces.Defend;

public class Squad implements Defend {
    @Override
    public void toDefend() {
        System.out.println("The squad of the knight have helped to defend the castle");
    }
}
