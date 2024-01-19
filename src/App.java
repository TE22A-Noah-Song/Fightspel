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

        String SpelarNamn = ""; 
        String DatorNamn = "";
        String VemsTur = "";
        if (val.equalsIgnoreCase("Starta"))
        {
            System.out.println("Döp din spelare:");
            SpelarNamn=t.nextLine();
            System.out.println("Döp din motståndare:");
            DatorNamn=t.nextLine();



            System.out.println("Nu slumpas vem som ska börja. Den som får högst börjar!");
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" fick: "+SpelareSlumpStart);
            Thread.sleep(2000);
            System.out.println(DatorNamn+" fick: "+DatorSlumpStart);

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
        System.out.println(SpelarNamn+" HP:"+SpelareHP);
        System.out.println(DatorNamn+" HP:"+DatorHP);

        if (VemsTur.equals("Spelare")) {
            System.out.println("Det är spelarens tur att agera.");
            Thread.sleep(2000);
            System.out.println("Välj nästa drag:\n 1. Anfall\n 2. Försvara");
            String TurVal=t.nextLine();
        
        }

     }
  }
}
