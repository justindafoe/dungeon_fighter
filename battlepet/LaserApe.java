package battlepet;

public class LaserApe extends BattlePet  
{
    private int minHealth = 200;
    private int maxHealth = 70;
    
    private String type = "LaserApe";


    public LaserApe()
    {
        super();
        super.setHealth(randNum.nextInt(maxHealth) + minHealth);
        
    }

    public String GetType()
    {
        return this.type;
    }

  







}

