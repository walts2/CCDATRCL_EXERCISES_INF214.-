public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
          // Weapon Class

          Weapon Maul = new Weapon();

          Maul.name = "Skull Basher";
          Maul.damage = 25;
          Maul.weight = 12;
          Maul.rarity = "Common"; 
          Maul.description = "deal 100 bonus physical damage. Bash chance for ranged heroes is 10%.";
          Maul.weaponDescription();
          
  
          Weapon Staff = new Weapon();
  
          Staff.name = "Monkey King Bar";
          Staff.damage = 40; 
          Staff.weight = 30;
          Staff.rarity = "Rare";
          Staff.description = "Grants each attack a 80% chance to pierce through evasion and deal 70 bonus magical damage.";
          Staff.weaponDescription();
  
          Weapon Scythe = new Weapon();
  
          Scythe.name = "Desolator";
          Scythe.damage = 50; 
          Scythe.weight = 6;
          Scythe.rarity ="Epic";
          Scythe.description = "Your attacks reduce the target's armor by 6 for 7 seconds.";
          Scythe.weaponDescription();
    }
}
