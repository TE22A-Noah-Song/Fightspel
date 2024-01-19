import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        //Slumpar tal
        Random tärning= new Random();
        int SpelareSlumpStart = tärning.nextInt(10)+1;
        int DatorSlumpStart = tärning.nextInt(10)+1;

        // Meny och Vem börjar
        Scanner t=new Scanner(System.in);
        System.out.println("Välkommen till fightspel. Välj val:\n 1. Starta\n 2. Avsluta");
        String val=t.nextLine();
        if (val.equalsIgnoreCase("Starta"))
        {
            System.out.println("Döp din spelare:");
            String SpelarNamn=t.nextLine();
            System.out.println("Döp din motståndare:");
            String DatorNamn=t.nextLine();



            System.out.println("Nu slumpas vem som ska börja. Den som får högst börjar!");
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" fick: "+SpelareSlumpStart);
            Thread.sleep(2000);
            System.out.println(DatorNamn+" fick: "+DatorSlumpStart);

            String VemsTur;

            if (SpelareSlumpStart>DatorSlumpStart)
            {
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" fick högst! " +SpelarNamn+ " börjar");
            VemsTur="Spelare";
            }

            else{
            Thread.sleep(2000);
            System.out.println(DatorNamn+" fick högst! "+DatorNamn+ " börjar");
            VemsTur="Dator";
            }
        }

        else if (val.equalsIgnoreCase("Avsluta"))
        {
            System.out.println("Avslutar spelet....");    
        }

        else{
            System.out.println("Fel inmatning! Vänligen välj Starta/Avsluta");
            }

        int SpelareHP=10;
        int DatorHP=10;

        while (SpelareHP > 0 && DatorHP > 0)
        {
        
        }
    }
}
