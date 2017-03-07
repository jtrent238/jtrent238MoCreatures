package com.jtrent238.mocreatures;

import com.jtrent238.mocreatures.Loaders.BlockLoader;
import com.jtrent238.mocreatures.Loaders.EntityLoader;
import com.jtrent238.mocreatures.Loaders.ItemLoader;
import com.jtrent238.mocreatures.Loaders.Recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class MoCreatures {
	@Mod(modid="mocreatures", name="jtrent238's Mo' Creatures Mod", version="1.0.0.0")
	public class mocreatures
	{
	
		private int elec;
		
		
	  @Mod.EventHandler
	  public void preInit(FMLPreInitializationEvent event)
	  {
	  }
	  

	  @Mod.EventHandler
	  public void init(FMLInitializationEvent event)
	  {
	   
		  BlockLoader.loadBlocks();
		  ItemLoader.LoadItems();
		  EntityLoader.LoadEntitys();
		  Recipes.registerRecpies();
			
	  } ;
	  
	  @Mod.EventHandler
	  public void postInit(FMLPostInitializationEvent event) {
		  
		  Recipes.registerRecpies();
	  }
	}
}
