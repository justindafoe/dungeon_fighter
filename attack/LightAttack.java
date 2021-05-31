package attack;


public class LightAttack extends Attack
{
    private int damage = 35;
    private int hitChance = 80; // 80 % chacne to hit
    private String type = "Light Attack";

    public LightAttack()
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
            // miss
        }
        return damageAmount;
    }
}
