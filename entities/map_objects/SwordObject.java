package entities.map_objects;


import entities.stat_entities.Weapons.Battle_Axe;
import entities.stat_entities.Weapons.Katana;
import entities.stat_entities.Weapons.Weapon;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Random;


public class SwordObject extends Object {

    Weapon containedWeapon;
    String description;

    public SwordObject() {
        name = "Sword";

        Battle_Axe battle_axe = new Battle_Axe();


        int randomInteger = new Random().nextInt(99) + 1;

        if (randomInteger >= 1 && randomInteger <= 33) {
            containedWeapon = new Katana();
            description = ("You picked up a katana! It has-been added to your inventory.");
        }

        else if (randomInteger >= 33 && randomInteger <= 66) {
            containedWeapon = new Battle_Axe();
            description = ("You picked up a battle axe! It-has been-added to your inventory.");
        }

        else if (randomInteger >= 66 && randomInteger <= 100) {
            containedWeapon = null;
            description = ("the weapon you picked up was so-rusted, it dissolved into the-air. You should get a tetanus-shot loser.");
        }


        try {
            image = ImageIO.read(getClass().getResourceAsStream("/resource/objects/Sword.png"));


        } catch(IOException e) {
            e.printStackTrace();
        }
        collision = false;

    }

    public Weapon getContainedWeapon() {
        return containedWeapon;
    }

    public String getDescription() {
        return description;
    }
}
