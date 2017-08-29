package com.example.examplemod;

import de.ellpeck.rockbottom.api.GameContent;
import de.ellpeck.rockbottom.api.IApiHandler;
import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.RockBottomAPI;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.construction.BasicRecipe;
import de.ellpeck.rockbottom.api.construction.resource.ItemUseInfo;
import de.ellpeck.rockbottom.api.construction.resource.ResInfo;
import de.ellpeck.rockbottom.api.construction.resource.ResUseInfo;
import de.ellpeck.rockbottom.api.construction.resource.ResourceRegistry;
import de.ellpeck.rockbottom.api.event.IEventHandler;
import de.ellpeck.rockbottom.api.item.ItemInstance;
import de.ellpeck.rockbottom.api.mod.IMod;
import org.newdawn.slick.util.Log;

public class ExampleMod implements IMod{

    @Override
    public String getDisplayName(){
        return "ExampleMod";
    }

    @Override
    public String getId(){
        return "examplemod";
    }

    @Override
    public String getVersion(){
        return "@VERSION@";
    }

    @Override
    public String getResourceLocation(){
        return "/assets/examplemod";
    }

    @Override
    public String getDescription(){
        return "This is the example mod for RockBottom";
    }

    @Override
    public void init(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        Log.info("Starting ExampleMod for RockBottom");

        //Add a manual construction recipe based on item inputs
        RockBottomAPI.MANUAL_CONSTRUCTION_RECIPES.add(new BasicRecipe(
                new ItemInstance(GameContent.ITEM_SUPER_TOOL),
                new ItemUseInfo(new ItemInstance(GameContent.TILE_DIRT, 100))));

        //Add a construction table recipe based on resource registry inputs
        RockBottomAPI.CONSTRUCTION_TABLE_RECIPES.add(new BasicRecipe(
                new ItemInstance(GameContent.ITEM_SUPER_TOOL),
                new ResUseInfo(ResourceRegistry.PEBBLES, 100)
        ));

        //Add a custom resource
        ResourceRegistry.addResources("test_resource", new ResInfo(GameContent.ITEM_COAL));

        //Etc
    }

    @Override
    public void initAssets(IGameInstance game, IAssetManager assetManager, IApiHandler apiHandler){
        Log.info("Localized text: "+assetManager.localize(RockBottomAPI.createRes(this, "test")));
    }
}
