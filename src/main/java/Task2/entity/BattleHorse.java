package Task2.entity;

import Task2.Interfaces.Save;

public class BattleHorse implements Save {
    @Override
    public void tosave() {
        System.out.println("With his battle horse the knight have saved the princess");
    }
}
