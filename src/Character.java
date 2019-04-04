public class Character {
    int str;
    int dex;
    int con;
    int igt;
    int wis;
    int cha;



    public void Character(int str, int dex, int con, int igt, int wis, int cha){
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.igt = igt;
        this.wis = wis;
        this.cha = cha;
        int stats[] = {str, dex, con, igt, wis, cha};
    }

}
