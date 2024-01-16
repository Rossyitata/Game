
package game;

public class Game {
    
    public static void main(String[] args) {
       //namaclass nama objek = new namaclass (buat objek)
       Player hero = new Player();
       Player enemy = new Player ();
       
       hero.name = "Jay";
       hero.speed = 60;
       hero.damage = 9;
       hero.armor = 8;
       hero.healthPoin = 0;
       
       enemy.name = "jeno";
       enemy.speed = 60;
       enemy.damage = 10;
       enemy.armor = 9;
       enemy.healthPoin = 10;
       
    
       hero.run();
       hero.attack(enemy.name);
       
       
       if(hero.isDead()){
           System.out.println("Game Over :(");
       }
       
       
       
       Drone dji = new Drone ();
       
       dji.energi = 60;
       dji.ketinggian = 70;
       dji.kecepatan = 40;
       dji.merek = "jay";
       
       dji.terbang();
       dji.belok();
       dji.maju();
       dji.mundur();
       dji.turun();
       dji.matikanMesin();
    
    
    Kucing belangTelon = new Kucing();
    
    belangTelon.berjalan = 5;
    belangTelon.berlari =  8;
    belangTelon.mengeong= 8;
    
    belangTelon.berjalan();
    belangTelon.berlari();
    belangTelon.mengeong();
    }
    
}
