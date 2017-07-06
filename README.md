# RockBottomModding
A gradle modding setup with an example mod to be used for modding Rock Bottom

## Setting up a development environment
To set up an environment to make a mod, simply do the following:  
(Note: This setup was created mainly for IntelliJ IDEA and may not work for Eclipse or other IDEs.)

1. Download this repository as a zip or fork and clone it

2. Import the gradle project into your IDE 
    * For IntelliJ, simply use `File` `Open...` and select the `build.gradle` file to import the project

3. Run the gradle tasks `createIntelliJRuns` or `createEclipseRuns` for IntelliJ or Eclipse, respectively. This will create a run configuration that you can use to test your mod.

4. Put a compiled jar of the game into the `/gamedata` folder (you might have to create it first) that will then be used when launching the run configurations.
    * You might have to refresh the gradle project in your IDE after doing this step for it to take effect
    
5. To enable hot swapping you need to set you ide compile output path to `/build/classes/`
   * To do this for IntelliJ you should go to your `Project Structure`(Ctrl+Alt+Shift+S), then you should go to the `Project` tab and make sure that you set the above mentioned path as the `Project compiler output`

## Compiling a jar of the mod
To make a jar containing your mod that you can then put into the `/mods` folder of your game instance, simple do the following: 

2. Run the gradle task `gradlew build` to compile a mod jar
1. You can then find the jar in `/build/libs`
