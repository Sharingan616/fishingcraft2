package fishingcraft2.common.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import fishingcraft2.common.items.fish.ItemFish;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

/**
 * Class responsible for adding all Fishing Craft items.
 * @author Sharingan616
 *
 */
public class FCItems
{
	//Misc
	public static final Item worm = new GenItem("Worm").setFull3D();
	public static final Item fishbones = new GenItem("Fish_Bones").setFull3D();
	public static final Item frogeggs = new GenItem("Frog_Eggs").setFull3D();
	public static final Item honeyComb = new GenItem("Honey_Comb").setFull3D();
	
    //Fish
    public static final Item fishCat = (new ItemFish(2, "Catfish")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishBlueGill = (new ItemFish(1, "Bluegill")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishSucker = (new ItemFish(2, "Suckerfish")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishCarp = (new ItemFish(2, "Carp")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishBass = (new ItemFish(2, "Bass")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishPike = (new ItemFish(2, "Pike")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishPeaBass = (new ItemFish(3, "Peacock_Bass")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishSmallPiranha = (new ItemFish(1, "Small_Piranha")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishGoldFish = (new ItemFish(1, "Goldfish")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishTench = (new ItemFish(2, "Tench")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
    public static final Item fishMackerel = (new ItemFish(2, "Mackerel")).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);


}
