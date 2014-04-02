package lycanite.lycanitesmobs.saltwatermobs.item;

import lycanite.lycanitesmobs.api.item.ItemCustomSpawnEgg;
import lycanite.lycanitesmobs.saltwatermobs.SaltwaterMobs;

public class ItemSaltwaterEgg extends ItemCustomSpawnEgg {
	
	// ==================================================
	//                   Constructor
	// ==================================================
    public ItemSaltwaterEgg(int itemID) {
        super(itemID);
        setUnlocalizedName("SaltwaterSpawnEgg");
        this.mod = SaltwaterMobs.instance;
        this.itemName = "SaltwaterEgg";
        this.texturePath = "saltwaterspawn";
    }
}
