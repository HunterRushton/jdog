import java.util.Random;

public class APP {


    public static void main(String[] args){
        Random random = new Random();
        int stat1 = random.nextInt(12)+6;
        int stat2 = random.nextInt(12)+6;
        int stat3 = random.nextInt(12)+6;
        int stat4 = random.nextInt(12)+6;
        int stat5 = random.nextInt(12)+6;
        int stat6 = random.nextInt(12)+6;
        System.out.println(stat1);
        System.out.println(stat2);
        System.out.println(stat3);
        System.out.println(stat4);
        System.out.println(stat5);
        System.out.println(stat6);
        Character dog = new Character();
        int stats[] = {stat1, stat2, stat3, stat4, stat5, stat6};

        String[] race = {"Human", "Dragonborn", "Dwarf", "Elf", "Gnome", "Halfling", "Half-Elf", "Half-Orc", "Tiefling",
                "Aarakocra", "Genasi", "Goliath", "Aasimar", "Bugbear", "Firbolg", "Goblin", "Hobgoblin", "Kenku", "Kobold",
                "Lizardfolk", "Orc", "Tabaxi", "Triton", "Yuan-ti Pureblood", "Feral Tiefling", "Tortle", "Gith", "Changeling",
                "Kalashtar", "Shifter", "Warforged", "Centaur", "Loxodon", "Minotaur", "Simic Hybrid", "Vedalken"};
        String meme = race[random.nextInt(35)];
        System.out.println(meme);


    }
}
