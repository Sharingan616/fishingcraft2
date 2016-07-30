package fishingcraft2.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fishingcraft2.common.blocks.other.BlockBeeHive;
import fishingcraft2.common.blocks.plants.BlockWaterPlant;
import fishingcraft2.common.blocks.plants.BlockWeedWithEggs;
import fishingcraft2.common.items.GenItem;
import fishingcraft2.common.items.fish.ItemFish;
import net.minecraft.block.Block;
import net.minecraft.item.Item;


/**
 * This class is responsible for adding blocks.
 * 
 * @author Sharingan616
 *
 */
public class FCBlocks
{
    public static Block weed = (new BlockWaterPlant("Weeds"));
    public static Block weedWithEggs = (new BlockWeedWithEggs("Weeds_With_Eggs"));
    public static Block beeHive = new BlockBeeHive("BeeHive");
    
    public static void registerBlocks()
    {
    	GameRegistry.registerBlock(beeHive, "BeeHive");
        GameRegistry.registerBlock(weed, "Weeds");
        GameRegistry.registerBlock(weedWithEggs, "Weeds_With_Eggs");   
    }
}