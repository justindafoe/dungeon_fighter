package attack;

public class SpecialAttack extends Attack
{
    private int damage = 70;
    private int hitChance = 50; // 45 % chacne to hit
    private String type = "Special Attack";

    public SpecialAttack()
    {
        super();
        super.SetAttackDamage(damage);
    }


    public String GetType()
    {
        return this.type;
    }

    @Override
    public int Strike()
    {
        int damageAmount = 0;
        if(randNum.nextInt(100) + 1 <= hitChance)
        {
            damageAmount = damage;
        }
         else
        {
            // do nothing
        }
        return damageAmount;
    }
}
