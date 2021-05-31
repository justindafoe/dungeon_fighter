package battlepet;

public class MetalMane extends BattlePet
{
    private int minHealth = 200;
    private int maxHealth = 20;
 
    private String type = "MetalMane";


    public MetalMane()
    {
        super();
        super.setHealth(randNum.nextInt(maxHealth) + minHealth);
        
    }

    public String GetType()
    {
        return this.type;
    }

  






}


