public class Archer extends Character{

  private String weaponType;

  public Archer(int maxHealthPoints, int attackPower, String weaponType) {
    super(maxHealthPoints, attackPower);
    this.weaponType = weaponType;
  }
  public Archer(int maxHealthPoints, int attackPower, String armor, String weaponType){
    super(maxHealthPoints, attackPower, armor);
    this.weaponType = weaponType;
  }
  @Override
  public int attack() {
    System.out.println(String.format("Your arrow hit! %d damage.", getAttackPower()));
    return getAttackPower();
  }

  public String getWeaponType() {
    return weaponType;
  }

  public void setWeaponType(String weaponType) {
    this.weaponType = weaponType;
  }
}
