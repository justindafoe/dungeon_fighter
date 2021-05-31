

package battlepet;

import java.util.Random;

public abstract class BattlePet 
{
    protected Random randNum = new Random();

    private int health;
   


    public BattlePet() {}

    //getters

    public int getHealth()
    {
        return this.health;
    }
    
   


    //setters

    public void setHealth( int health)
    {
        this.health = health;
    }
   public void TakeDamage(int damage)
   {
       if(damage > 0)
       this.health -= damage;
   }

   public void generateHealth()
   {

       this.health += 175;
       
   }
}
