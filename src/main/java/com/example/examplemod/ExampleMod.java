package com.example.examplemod;

import de.ellpeck.rockbottom.ContentRegistry;
import de.ellpeck.rockbottom.api.*;
import de.ellpeck.rockbottom.construction.BasicRecipe;

import org.newdawn.slick.util.Log;

public class ExampleMod implements IMod {

    @Override
    public String getDisplayName() {
        return "ExampleMod";
    }

    @Override
    public String getId() {
        return "examplemod";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getResourceLocation() {
        return "/assets/examplemod";
    }

    @Override
    public String getDescription() {
        return "This is the example mod for RockBottom";
    }

    @Override
    public void preInit(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler) {
        Log.info("Starting ExampleMod for RockBottom");
        RockBottomAPI.MANUAL_RECIPES.add(new BasicRecipe(new ItemInstance(ContentRegistry.ITEM_SUPER_TOOL), new ItemInstance(ContentRegistry.TILE_DIRT, 64)));
    }
}
