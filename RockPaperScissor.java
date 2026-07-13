import java.util.Scanner;

public class RockPaperScissor
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lets play Rock-Paper-Scissor");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Type yes if  you are ready ");
        String response=scan.nextLine();
        if(response.equals("yes"))
        {
            System.out.println("Great!");
            System.out.println("Rock-Paper-Scissor Shoot!");
            String userChoice=scan.nextLine();
            String compChoice=computerChoice();
            String finalResult=result(userChoice,compChoice);
            printResult(userChoice, compChoice, finalResult);
        }
        else
        {
            System.out.println("Darn....some other time.");
        }
        scan.close();
    }

    public static String result(String userChoice,String compChoice)
    {  
        if(userChoice.equals("rock")&&compChoice.equals("scissor"))
        {
            return "You win";
        }
        else if(userChoice.equals("scissor")&& compChoice.equals("paper"))
        {
            return "You win";
        }
        else if(userChoice.equals("paper")&& compChoice.equals("rock")){
             return "You win";

        }
        else if ( compChoice.equals("scissor")&&userChoice.equals("paper"))
         {
            return "Computer wins";
        }
        else if(compChoice.equals("rock")&&userChoice.equals("scissor"))
        {
            return "Computer wins";
        }
        else if( compChoice.equals("paper")&&userChoice.equals("rock"))
        {
            return "Computer wins";
        }
        else if(userChoice.equals(compChoice))
        {
            return "Tie";
        }
        else
        {
            return "Invalid choice";
            
        }
            
        }
        public static void printResult(String userChoice,String compChoice,String finalResult)
        {
            System.out.println("\n\tUser choice: "+userChoice);
            System.out.println("\tComputer choice: "+ compChoice);
            System.out.println("\t"+finalResult);
        }
    

public static String computerChoice()
{
    double randomNumber=Math.random()*3;
    int randomInt=(int)randomNumber;
   switch(randomInt)
    {
        case 0:
            return "rock";
          
        case 1:
            return "paper";
            
        case 2:
            return "scissor";
            
        default:
            return " ";
           
    }
}
}