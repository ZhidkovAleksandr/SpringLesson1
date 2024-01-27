package Task2.entity;

import Task2.Interfaces.Save;

public class MagicRope implements Save {
    @Override
    public void tosave() {
        System.out.println("With this magic rope the knight have saved the princess from the tower");
    }
}
