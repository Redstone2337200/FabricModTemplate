package net.redstone233.template.mod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.redstone233.template.mod.datagen.*;

public class TemplateModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	
			FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
			
		pack.addProvider(ModModlesProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		
	}
}
