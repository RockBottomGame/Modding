# RockBottomModding
A gradle modding setup with an example mod to be used for modding Rock Bottom

## Setting up a development environment
To set up an environment to make a mod, simply do the following:  
(Note: This setup was created mainly for IntelliJ IDEA and may not work for Eclipse or other IDEs.)

1. Download this repository as a zip or fork and clone it

2. Import the gradle project into your IDE 
    * For IntelliJ, simply use `File` `Open...` and select the `build.gradle` file to import the project.  
    In the window that opens, unselect `Create separate module per source set`. Leave everything else as is.

3. If you don't see existing run configurations in the project, run the gradle tasks `createIntelliJRuns` or `createEclipseRuns` for IntelliJ or Eclipse, respectively. This will create a run configuration that you can use to test your mod.

4. Put a compiled jar of the game into the `/gamedata` folder (you might have to create it first) that will then be used when launching the run configurations.
    * You might have to refresh the gradle project in your IDE after doing this step for it to take effect

5. Set your IDE's compile output path to `/build/classes`
    * For IntelliJ, simply use `File` `Project Structure` `Project` and set the `Project compiler output` option to the above

## Compiling a jar of the mod
To make a jar containing your mod that you can then put into the `/mods` folder of your game instance, simple do the following: 

2. Run the gradle task `gradlew build` to compile a mod jar
1. You can then find the jar in `/build/libs`
