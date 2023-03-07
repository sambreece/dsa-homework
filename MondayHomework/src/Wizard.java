public class Wizard extends Character{

  private String spell;

  public Wizard(int maxHealthPoints, int attackPower, String spell) {
    super(maxHealthPoints, attackPower);
    this.spell = spell;
  }
  public Wizard(int maxHealthPoints, int attackPower, String armor, String spell){
    super(maxHealthPoints, attackPower, armor);
    this.spell = spell;
  }


  @Override
  public int attack() {
    System.out.println(String.format("Your spell hit! %d", getAttackPower()));
    return getAttackPower();
  }

  public String getSpell() {
    return spell;
  }

  public void setSpell(String spell) {
    this.spell = spell;
  }
}
