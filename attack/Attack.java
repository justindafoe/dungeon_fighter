package attack;

import java.util.Random;


public abstract class Attack 
{
    protected Random randNum = new Random();
    private int attackDamage;

    public Attack() {}

    public int GetAttackDamage()
    {
        return this.attackDamage;
    }
    public void SetAttackDamage(int damage)
    {
        this.attackDamage = damage;
    }



    public abstract int Strike();
}
