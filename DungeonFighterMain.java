import util.*;
import battlepet.*;
import java.util.Scanner;
import java.util.Random;
import attack.*;


public class DungeonFighterMain
{
    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Printer printer = new Printer();
    private static boolean gameOver = false;
    private static boolean playerTurn = true;

    //player
    private static int pChoice;
    private static BattlePet pBattlePet;
    private static int pDamage;
    private static LightAttack pLightAttack = new LightAttack();
    private static HeavyAttack pHeavyAttack = new HeavyAttack();
    private static SpecialAttack pSpecialAttack = new SpecialAttack();
    private static int EnemiesDefeated = 0;
   
    //computer
    private static int eChoice;
    private static BattlePet eBattlePet;  
    private static int eDamage; 
    private static LightAttack eLightAttack = new LightAttack();
    private static HeavyAttack eHeavyAttack = new HeavyAttack();
    private static SpecialAttack eSpecialAttack = new SpecialAttack();
 
   public static void main(String[] args) 
   {
    printer.WelcomeMessage();
    //////////////////////////////////////////////////
        //Player Setup Section
   
    printer.PrintBattlePetChoices();
    pChoice = input.nextInt();
    CreateBattlePet(pChoice, playerTurn);
    
    //player attack selection--DONT FORGET ABOUT ME
   //printer.PrintAttackSelection();
    //pChoice = input.nextInt();

        playerTurn = false;
    /////////////////////////////////////////////////
        //Enemy Setup Section
        CreateBattlePet(randNum.nextInt(4) + 1, playerTurn);

        playerTurn = true;

           ///////////////Print Initial BattlePet Selection
    //print battlePet type, and healthx2

    printer.PrintStartingPetStats(pBattlePet, eBattlePet);

    ///////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    // MAIN GAME LOOP//
        
        while(!gameOver)
        {
           
            //print stats for each turn
          if(playerTurn)// players turn
          {
            
            printer.PrintAttackTypes();
            pChoice = input.nextInt(); 

            if(pChoice == 1)// light attack
            {
               
                pDamage = pLightAttack.Strike();
               
            }
            else if(pChoice == 2)// heavy attack
            {
                pDamage = pHeavyAttack.Strike();
              
            }
            else//special attack
            {
                pDamage = pSpecialAttack.Strike();
            }

             //get the damage amount from the strike

             //print what happens ie:player misses
             if(pDamage <= 0)// missed
             {
                 printer.PrintMissMessage(playerTurn);
             }
             else// hit!
             {
                 printer.PrintHitMessage(playerTurn, pDamage);
                 //eBattlePet.TakeDamage(pDamage);
                 int enemyhp = eBattlePet.getHealth();
                 int enemyhpafterhit = Math.max(0, enemyhp - pDamage);// comparing the larger number. zero, or damage casted(possibly a negative number)
                 eBattlePet.setHealth(enemyhpafterhit);
                 if(eBattlePet.getHealth() <= 0)
                 {
                     EnemiesDefeated++;
                     if(EnemiesDefeated == 3) //GAME OVER
                         {
                             // GAME OVER //
                             printer.PrintBossDefeated();
                             printer.PrintThanks();
                             System.exit(0);
                         }                                                       
                    
                     System.out.println("You have defeated the enemy, continue into the dungeon,\nand see what awaits for you and your BattlePet!\n\n");
                     printer.PrintContinueMessage(pChoice, playerTurn);
                     pChoice=input.nextInt();
                    if(pChoice == 1)
                    {
                       
                        if(EnemiesDefeated == 2)
                        {                                                                                               
                            printer.PrintBossBatle();
                            pBattlePet.generateHealth();
                            CreateBattlePet(randNum.nextInt(4) + 1, !playerTurn);// i just need an enemy to spawn
                            //eBattlePet.generateHealth();
                            printer.PrintStartingPetStats(pBattlePet, eBattlePet);  
                            
                        }
                        else if(EnemiesDefeated < 2)
                        {
                            pBattlePet.generateHealth();
                            CreateBattlePet(randNum.nextInt(4) + 1, !playerTurn);// i just need an enemy to spawn                                                    
                            printer.PrintStartingPetStats(pBattlePet, eBattlePet); 
                        }                                                                                                                                                               
                    }
                    if(pChoice == 2)
                    {
                      printer.PrintThanks();
                      System.exit(0);                       
                    }                 
                  }                                                      
             }        
          }// player turn ends 
         ////////////////////////////////////////////////////////////////////
          else// enemys turn
          {
           System.out.println("++++GET READY FOR AN ENEMY ATTACK++++\n ");
             eChoice = (randNum.nextInt(3) + 1); 

            if(eChoice == 1)// light attack
            {               
                eDamage = eLightAttack.Strike();               
            }
            else if(eChoice == 2)// heavy attack
            {
                eDamage = eHeavyAttack.Strike();               
            }
            else//special attack
            {
                eDamage = eSpecialAttack.Strike();
            }
            if(eDamage <= 0)// missed
            {
                 printer.PrintMissMessage(playerTurn);
            }
             else// hit!
             {
                 printer.PrintHitMessage(playerTurn, pDamage);
                 pBattlePet.TakeDamage(eDamage);
                 if(pBattlePet.getHealth() <= 0)
                 {
                     printer.PrintLossMessage();
                     gameOver = true;
                 }
                 else
                 {
                     //do nothing, enemy is still alive.
                 }
             }// enemy hit message
            
            
          }// enemys turn else
          playerTurn = !playerTurn; // flips the boolean, and toggles the turn
          
        }// game loop logic
   }// main

   public static void CreateBattlePet(int choice, boolean player)
   {
        switch(choice)
        {
            case 1: //rexmech
            {
                if(player)
                {
                    pBattlePet = new RexMech();
                    System.out.println("You have selected RexMech,\nthe greatest Dino BattlePet in the Galaxy! May he bring you VICTORY.\n");
                }
                else{
                    eBattlePet = new RexMech();
                    System.out.println("Your ENEMY is RexMech,\nthe greatest Dino BattlePet in the Galaxy!\n");
                }
                
                break;
            }
            case 2: //laserape
            {
                if(player){
                    pBattlePet = new LaserApe();
                    System.out.println("You have selected LaserApe,\nthe dealiest Primate Battlepet in the Galaxy! May he bring you VICTORY.\n");
                }
                else{
                    eBattlePet = new LaserApe();
                    System.out.println("Your ENEMY is LaserApe,\nthe greatest Primate BattlePet in the Galaxy!\n");
                }    
                break;           
            }
            case 3:// dragoslash
            {
                if(player){
                    pBattlePet = new DragoSlash();
                    System.out.println("You have selected DragoSlash,\nthe deadliest flying BattlePet in the Galaxy! May he bring you VICTORY.\n");
                }
                else{
                    eBattlePet = new DragoSlash();
                    System.out.println("Your ENEMY is DragoSlash,\nthe greatest flying BattlePet in the Galaxy!\n");
                }  
                break;
            }
            case 4:// metalmane
            {
                if(player){
                    pBattlePet = new MetalMane();
                    System.out.println("You have selected MetalMane,\nthe deadliest feline BattlePet in the Galaxy! May he bring you VICTORY.\n");
                }
                else{
                    eBattlePet = new MetalMane();
                    System.out.println("Your enemy is MetalMane,\nthe greatest feline BattlePet in the Galaxy!\n");
                }  
                break;       
            }
            
        }//switch
    }// BattlePet select
}// class
