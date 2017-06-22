# RockBottomModding
A gradle modding setup with an example mod to be used for modding Rock Bottom

## Setting up a development environment
To set up an environment to make a mod, simply do the following:

1. Import the gradle project into your IDE 
    * For IntelliJ, simply use `File` `Open...` and select the `build.gradle` file to import the project
    * For Eclipse, additionally run the gradle task `eclipse` to set up an Eclipse project
    
2. Run the gradle tasks `createIntelliJRuns` or `createEclipseRuns` for IntelliJ or Eclipse, respectively. This will create a run configuration that you can use to test your mod.
    * For Eclipse, to run the project, right-click `Launcher.launch` to launch the project

## Compiling the mod
To make a jar containing your mod that you can then put into the `/mods` folder of your game instance, simple do the following: 

2. Run the gradle task `gradlew build` to compile a mod jar
1. You can then find the jar in `/build/libs`