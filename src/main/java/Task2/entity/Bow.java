package Task2.entity;

import Task2.Interfaces.Kill;

public class Bow implements Kill {
    @Override
    public void toKill() {
        System.out.println("The knight killed an enemy with his bow");
    }
}

