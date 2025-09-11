package GamePlay.src;


public class GameSettings {

    public void gameStart() {
        System.out.println("Start\nChoose your character\n\nAre you a hunter or the hunted?");
        new Scripts().startScript();
    }

    public void createJsonHuntedSettings() {
        HuntedSerializer serializer = new HuntedSerializer("Gameplay/src/huntedCharacter.json");
        serializer.deserializeHunted();
    }

    public void createJsonHunterSettings() {
        HunterSerializer serializer1 = new HunterSerializer("Gameplay/src/hunterCharacter.json");
        serializer1.deserializeHunter();
    }
}


