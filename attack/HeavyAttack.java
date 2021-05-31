package attack;

public class HeavyAttack extends Attack
{
    private int damage = 45;
    private int hitChance = 65; 
    private String type = "Heavy Attack";

    public HeavyAttack()
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
