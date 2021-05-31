package battlepet;

public class RexMech extends BattlePet 
{
    private int minHealth = 200;
    private int maxHealth = 80;
  
    private String type = "RexMech";


    public RexMech()
    {
        super();
        super.setHealth(randNum.nextInt(maxHealth) + minHealth);
       
    }

    public String GetType()
    {
        return this.type;
    }


   





}

