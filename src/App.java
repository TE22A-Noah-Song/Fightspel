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
            System.out.println(SpelarNamn+" fick:"+SpelareSlumpStart);
            Thread.sleep(2000);
            System.out.println(DatorNamn+" fick:"+DatorSlumpStart);

            if (SpelareSlumpStart>DatorSlumpStart)
            {
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" fick högst! " +SpelarNamn+ " börjar");
            VemsTur="Spelare";
            }

            else if (SpelareSlumpStart==DatorSlumpStart){
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
            System.exit(0);  
        }

        else{
            System.out.println("Fel inmatning! Vänligen välj Starta/Avsluta");
            }

        int SpelareHP=10;
        int DatorHP=10;

        while (SpelareHP > 0 && DatorHP > 0)
        {
            
        //Spelarens tur

        if (VemsTur.equals("Spelare")) {
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" HP:"+SpelareHP);
            Thread.sleep(2000);
            System.out.println(DatorNamn+" HP:"+DatorHP);
            Thread.sleep(2000);
            System.out.println("Det är "+SpelarNamn+"s" +" tur att agera.");
            Thread.sleep(2000);
            System.out.println("Välj nästa drag:\n 1. Anfall\n 2. Stort anfall (riskabelt)");
            String TurVal=t.nextLine();
        
        int SpelareTal = tärning.nextInt(5) + 1;
        int DatorTal = tärning.nextInt(5) + 1;

        //Anfall

        if (TurVal.equalsIgnoreCase("Anfall"))
        {
             SpelareTal= tärning.nextInt(5)+1; 
            System.out.println(SpelarNamn+" Attackerar med siffran "+SpelareTal); 
            Thread.sleep(2000);
             DatorTal= tärning.nextInt(5)+1;
            System.out.println(DatorNamn+" Försvarar med siffran "+DatorTal); 
            if (SpelareTal>DatorTal)
        {
        int Skada=SpelareTal-DatorTal;
        Thread.sleep(2000);
        System.out.println(SpelarNamn+" träffade "+DatorNamn+" med skadan "+Skada);
        DatorHP-=Skada;
        VemsTur="Dator";
        }
        }
        
        //Stort Anfall

        else if (TurVal.equalsIgnoreCase("Stort Anfall")) {
            SpelareTal = tärning.nextInt(5) + 1;
            System.out.println(SpelarNamn + " Attackerar med siffran " + SpelareTal);
            Thread.sleep(2000);
            DatorTal = tärning.nextInt(10) + 1;
            System.out.println(DatorNamn + " Försvarar med siffran " + DatorTal);
        
            if (SpelareTal > DatorTal) {
                int Skada2 = SpelareTal * 2 - DatorTal;
                Thread.sleep(2000);
                System.out.println(SpelarNamn + " träffade " + DatorNamn + " med skadan " + Skada2+", DUBBELSKADA!");
                DatorHP -= Skada2;
                VemsTur = "Dator";
            } else {
                Thread.sleep(2000);
                System.out.println(DatorNamn + " blockar attacken! Ingen skadas");
                Thread.sleep(2000);
                VemsTur = "Dator";
            }
        } 
    }

    //Datorns tur

    else if(VemsTur.equals("Dator")){
        Thread.sleep(2000);
        System.out.println(SpelarNamn+" HP:"+SpelareHP);
        Thread.sleep(2000);
        System.out.println(DatorNamn+" HP:"+DatorHP);
        Thread.sleep(2000);
        System.out.println("Det är "+DatorNamn+"s" +" tur att agera.");
        Thread.sleep(2000);
        int DatorVal= tärning.nextInt(2)+1;

        //Dator Anfall

        if (DatorVal==1){
            Thread.sleep(2000);
            System.out.println(DatorNamn+" valde Anfall");
            Thread.sleep(2000);
            int DatorTal2 = tärning.nextInt(5)+1;
            Thread.sleep(2000);
            System.out.println(DatorNamn+" Attackerar med siffran "+DatorTal2); 
            Thread.sleep(2000);
            int SpelareTal2= tärning.nextInt(5)+1;
            System.out.println(SpelarNamn+" Försvarar med siffran "+SpelareTal2); 
        
            if (DatorTal2>SpelareTal2) {
            int Skada=DatorTal2-SpelareTal2;
            Thread.sleep(2000);
            System.out.println(DatorNamn+" träffade "+SpelarNamn+" med skadan "+Skada);
            SpelareHP-=Skada;
            VemsTur="Spelare";
            }

            else{
            Thread.sleep(2000);
            System.out.println(SpelarNamn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            VemsTur="Spelare";
            }
        }

        //Dator Stort Anfall

        else{
            System.out.println(DatorNamn+" valde Stort Anfall");
            int DatorTal = tärning.nextInt(5) + 1;
            System.out.println(DatorNamn + " Attackerar med siffran " +DatorTal);
            Thread.sleep(2000);
            int SpelareTal = tärning.nextInt(10) + 1;
            System.out.println(SpelarNamn + " Försvarar med siffran " + SpelareTal);

            if (DatorTal>SpelareTal){
            int Skada=DatorTal*2-SpelareTal;
            Thread.sleep(2000);
            System.out.println(DatorNamn+" träffade "+SpelarNamn+" med skadan "+Skada);
            SpelareHP-=Skada;
            VemsTur="Spelare";
            }
        }
     }
  }
 }
}
 

