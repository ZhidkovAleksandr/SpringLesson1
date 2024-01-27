package Task2;

import Task2.entity.Knight;
import Task2.entity.MagicRope;
import Task2.entity.Sword;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Knight whiteKnight = ctx.getBean("whiteKnight", Knight.class);
        Knight silverKnight = ctx.getBean("silverKnight", Knight.class);

//        Sword s = ctx.getBean("sword", Sword.class);
//        MagicRope magicRope = ctx.getBean("magicRope", MagicRope.class);

        whiteKnight.savePrincess();
        whiteKnight.getSave().tosave();
        whiteKnight.defendCastle();
        whiteKnight.getDefend().toDefend();
        whiteKnight.killDragon();
        whiteKnight.getKill().toKill();
//
        silverKnight.savePrincess();
        silverKnight.getSave().tosave();
        silverKnight.defendCastle();
        silverKnight.getDefend().toDefend();
        silverKnight.killDragon();
        silverKnight.getKill().toKill();
    }
}