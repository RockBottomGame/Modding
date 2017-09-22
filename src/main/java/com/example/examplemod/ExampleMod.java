package com.example.examplemod;

import de.ellpeck.rockbottom.api.IApiHandler;
import de.ellpeck.rockbottom.api.IGameInstance;
import de.ellpeck.rockbottom.api.RockBottomAPI;
import de.ellpeck.rockbottom.api.assets.IAssetManager;
import de.ellpeck.rockbottom.api.event.IEventHandler;
import de.ellpeck.rockbottom.api.mod.IMod;
import de.ellpeck.rockbottom.api.util.reg.IResourceName;

import java.util.logging.Logger;

public class ExampleMod implements IMod{

    public static ExampleMod instance;

    private Logger modLogger;

    public ExampleMod(){
        instance = this;
    }

    public static Logger getLogger(){
        return instance.modLogger;
    }

    public static IResourceName createRes(String name){
        return RockBottomAPI.createRes(instance, name);
    }

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
    public void prePreInit(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        this.modLogger = apiHandler.createLogger(this.getDisplayName());
    }

    @Override
    public void preInit(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        this.modLogger.info("Starting ExampleMod for RockBottom");
    }

    @Override
    public void init(IGameInstance game, IApiHandler apiHandler, IEventHandler eventHandler){
        //Etc
    }

    @Override
    public void initAssets(IGameInstance game, IAssetManager assetManager, IApiHandler apiHandler){
        this.modLogger.info("Localized text: "+assetManager.localize(RockBottomAPI.createRes(this, "test")));
    }
}
