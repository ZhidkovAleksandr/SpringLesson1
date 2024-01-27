package Task2.entity;

import Task2.Interfaces.Kill;

public class Sword implements Kill {
    @Override
    public void toKill() {
        System.out.println("With the sword the knight have killed the dragon");
    }
}

