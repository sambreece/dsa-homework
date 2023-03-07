abstract class Character {

  private int healthPoints;
  private String armor;
  private int attackPower;
  private int maxHealthPoints;

  public Character(int maxHealthPoints, int attackPower) {
    this.maxHealthPoints = maxHealthPoints;
    this.healthPoints = maxHealthPoints;
    this.attackPower = attackPower;
  }

  public Character(int maxHealthPoints, int attackPower, String armor) {
    this(maxHealthPoints, attackPower);
    this.armor = armor;
  }
  public abstract int attack();

  public void heal(){
    healthPoints = maxHealthPoints;
  }
  public void takeDamage(int damage){
    if(damage < healthPoints) {
      healthPoints -= damage;
    } else {
      healthPoints = 0;
      System.out.println("The damage was too much! K.O.");
    }
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }

  public String getArmor() {
    return armor;
  }

  public void setArmor(String armor) {
    this.armor = armor;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
  }
}
