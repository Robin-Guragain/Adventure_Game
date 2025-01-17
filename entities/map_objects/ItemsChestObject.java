package entities.map_objects;

import entities.stat_entities.Items.Item;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ItemsChestObject extends Object {

    Item containedItem;
    String description;

    public ItemsChestObject(Item i) {

        name = "Item_Chest";
        containedItem = i;
        description = ("You opened a chest and got a-" + i.getName() + ", Congatulations!");

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/resource/objects/HP_Chest.png"));


        } catch(IOException e) {
            e.printStackTrace();
        }
        collision = false;

    }

    public Item getContainedItem() {
        return containedItem;
    }

    public String getDescription() {
        return description;
    }
}
