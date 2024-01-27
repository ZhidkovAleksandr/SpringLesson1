package Task2.entity;

import Task2.Interfaces.Defend;
import Task2.Interfaces.Kill;
import Task2.Interfaces.Quest;
import Task2.Interfaces.Save;

public class Knight implements Quest {

    private Defend defend;
    private Kill kill;
    private Save save;

    @Override
    public void savePrincess() {
        System.out.println("white knight is going to save princess");
    }

    @Override
    public void defendCastle() {
        System.out.println("white knight is going to defend the castle");
    }

    @Override
    public void killDragon() {
        System.out.println("white knight is going to kill the dragon");
    }

    public Defend getDefend() {
        return defend;
    }

    public void setDefend(Defend defend) {
        this.defend = defend;
    }

    public Kill getKill() {
        return kill;
    }

    public void setKill(Kill kill) {
        this.kill = kill;
    }



    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public Knight(Defend defend, Kill kill, Save save) {
        this.defend = defend;
        this.kill = kill;
        this.save = save;
    }
}
