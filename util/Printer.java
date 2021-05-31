
package util;

import battlepet.*;

public class Printer
{
  


    private String[][] menu = {
        {"RexMech", "LaserApe", "DragoSlash", "MetalMane"},
        {"Light Attack", "Heavy Attack", "Special Attack"}
    };


    public Printer() {}

    public void WelcomeMessage()
    {
        System.out.println("\t             ===================");
        System.out.println("\t         ===========================");
        System.out.println("\t     ==========+++++++++++++++=========");
        System.out.println("\t==========+++++===============+++++==========");
        System.out.println("\t + =+=       BATTLE PET DUNGEON CRAWLER      =+=");
        System.out.println("\t==========+++++===============+++++==========");
        System.out.println("\t     ==========+++++++++++++++=======");
        System.out.println("\t         =========================");
        System.out.println("\t             =================");
        System.out.println("\n\t+++YOU HAVE BEEN CHOSEN TO SAVE PETTSBURGH+++\n\t+++SELECT YOUR BATTLE PET YOU WISH TO TRAIN+++\n\t\t+++ AND ENTER THE DUNGEON+++\n");
    }
 

    public void PrintBattlePetChoices()
    {
        System.out.println("PICK YOUR BATTLE PET:\n");
        int rowToPrint = 0;
        for(int col = 0; col < menu[rowToPrint].length; col++)
        {
            System.out.println(col + 1 + ")" + menu[rowToPrint][col]);
        
        }

    }
 

    public void PrintStartingPetStats(BattlePet battlepet, BattlePet ebattlepet)
    {
        System.out.println("Your BattlePet Health is: " + battlepet.getHealth());
        System.out.println("The Enemy BattlePet Health is: " + ebattlepet.getHealth() + "\n");
    }

    public void PrintAttackTypes()
    {
        System.out.println("\nPICK YOUR ATTACK!! FIGHT!!!");
        System.out.println("1)Light Attack\n2)Heavy Attack\n3)Special Attack");
    }

    public void PrintMissMessage(boolean isPlayer)
    {
        if(isPlayer)
        {
            System.out.println("\n+++Great Attempt, however it appears you have missed your attack+++\n");
        }
        else
        {
    
            System.out.println("\n+++You have evaded the attack, now quickly think about your next move!!+++\n");
        }
       
        
    }

    public void PrintContinueMessage(int pChoice, boolean isPlayer)
    {
        System.out.print("\nwould you like to continue into the dungeon");
        System.out.println("\n1)yes\n2)no");
    }

    public void PrintLossMessage()
    {
        System.out.println("\n\n0808080808444444080808080808080");
        System.out.println("###################################");
        System.out.println("YOU HAVE BEEN DEFEATED. EXIT THE GAME, AND TRY AGAIN");
        System.out.println("###################################");
        System.out.println("0808080808444444080808080808080");
    }

    public void PrintBossBatle()
    {
        System.out.println("\n\n###################################");
        System.out.println("###################################");
        System.out.println("YOU HAVE ENCOUNTERED THE FINAL BOSS");
        System.out.println("###################################");
        System.out.println("###################################");
    }


    public void PrintHitMessage(boolean isPlayer, int damage)
    {
        if(isPlayer)
        {
          
            System.out.println("         xxxxxxxxxxxxxx");
            System.out.println("You have struck the enemy for " + damage + " damage");
            System.out.println("         xxxxxxxxxxxxxx\n");
         
        }
        else
        {
            System.out.println("         xxxxxxxxxxxxxx");
            System.out.println("Your BattlePet has been struck for: " + damage + " damage");
            System.out.println("         xxxxxxxxxxxxxx\n");
        }
    }


    public void PrintThanks()
    {
        System.out.println("\n  xcxcxcxcxcxcxcxcxcxcxcxcxcxcxc");
        System.out.println("  xcxcxcxcxcxcxcxcxcxcxcxcxcxcxc");
        System.out.println("THANK YOU FOR PLAYING, GREAT TRAINER");
        System.out.println(" xcxcxcxcxcxcxcxcxcxcxcxcxcxcxc ");
        System.out.println("  xcxcxcxcxcxcxcxcxcxcxcxcxcxcxc\n");

    }
    public void PrintBossDefeated()
    {
        System.out.println("\n  OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println("  POGGERS BUD, BOSS DEAD");
        System.out.println("    YOU HAVE ESCAPED THE DUNGEON WITH YOUR BATTLE PET");
        System.out.println("    CONGRATULATIONS ON YOUR SAVING PETTSBURGH!");
        System.out.println("  OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        System.out.println("  OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }
}// ends printer class
