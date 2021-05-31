package battlepet;

public class DragoSlash extends BattlePet
{
    private int minHealth = 200;
    private int maxHealth = 50;
   
    private String type = "DragoSlash";


    public DragoSlash()
    {
        super();
        super.setHealth(randNum.nextInt(maxHealth) + minHealth);
    
    }

    public String GetType()
    {
        return this.type;
    }

 
   



}

