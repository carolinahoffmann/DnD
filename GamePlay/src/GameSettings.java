package GamePlay.src;


public class GameSettings {

    private Scripts scripts;

    public GameSettings()
    {
        scripts = new Scripts();
    }

    public void gameStart() {
        System.out.println("Start\nChoose your character\n\nAre you a hunter or the hunted?");
        new Scripts().startScript();
    }

    public void endAndSaveGame(){
        new Scripts().endgame();
    }

    public void createJsonHunterRooms(){
        HunterSerializer roomSerializer = new HunterSerializer("GamePlay/src/hunterRooms.json");
        roomSerializer.deserializeHunter();
    }
    public void createJsonHuntedSettings() {
        HuntedSerializer serializer = new HuntedSerializer("Gameplay/src/huntedCharacter.json");
        serializer.deserializeHunted();
    }

    public void createJsonHunterSettings() {
        HunterSerializer serializer1 = new HunterSerializer("Gameplay/src/hunterCharacter.json");
        serializer1.deserializeHunter();
    }

    //public void createJsonMilestonesHunter(){
      //  MilestonesHunter milestonesHunter = new MilestonesHunter("GamePlay/src/milestonesHunter.json");
    //}
}