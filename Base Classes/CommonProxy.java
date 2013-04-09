package megateam.megamanxrpg;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
	public void registerRenderInformation() //Client side texture registering
	{
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
		return null;
	}
	
	public void registerTiles(){ //For registering TileEntities
	}
	
	public void registerBlocks(){ //For registering Blocks
		GameRegistry.registerBlock(mod_megamanxrpg.EnergyOre, "Energy Ore");
	}
	
	public void addNames(){ //For adding Item's ingame names
		LanguageRegistry.addName(mod_megamanxrpg.EnergyOre, "Energy Ore");
		LanguageRegistry.addName(mod_megamanxrpg.ZBlade, "ZSaber");
		LanguageRegistry.addName(mod_megamanxrpg.XBlade, "XBlade");
	}
	
	public void addRecipes(){ //For adding your Item's recipes
	}
	
	public void registerRenders() {
			MinecraftForge.EVENT_BUS.register(new DoubleJumpEventHook());
	}
	
	public void registerHandlers()
	{
	}
}