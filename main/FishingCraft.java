package fishingcraft2.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import fishingcraft2.common.blocks.FCBlocks;
import fishingcraft2.common.items.FCItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(modid = FishingCraft.MODID, version = FishingCraft.VERSION)

/**
 * Fishing Craft adds multiple fish, blocks, and other items into the Minecraft world,
 * as well as redesigns the fishing functionality.
 * 
 * The goal of this mod is to enhance the fishing experience within the game.
 * 
 * @author Sharingan616 (Benjamin Tovar-Prince)
 * @version 2.0
 */
public class FishingCraft
{
    public static final String MODID = "fishingcraft2";
    public static final String VERSION = "2.0";
    private FCItems modItems;
    private FCBlocks modBlocks;
    
    public static CreativeTabs fcTab = new CreativeTabs("fishingcraft")
    {
		public Item getTabIconItem() {
			return Items.fishing_rod;
		}
    };
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		modItems = new FCItems();
		modBlocks.registerBlocks();
    }
}
