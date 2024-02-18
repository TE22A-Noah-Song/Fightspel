//Noah Söng TE22A

import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        // Meny och Vem börjar
        Scanner t=new Scanner(System.in);
        String val="1";
        Random tärning = new Random();
        
        // Start meny
        System.out.println("Välkommen till fightspel. Välj val:\n 1. Starta\n 2. Avsluta");
        val=t.nextLine();

        String spelar_namn = ""; 
        String dator_namn = "";
        String vems_tur = "";
    

        switch (val.toLowerCase()) {
            case "starta":
            case "1":
                System.out.println("Döp din spelare:");
                spelar_namn = t.nextLine();
                System.out.println("Döp din motståndare:");
                dator_namn = t.nextLine();

                        //Slumpar tal
                int spelare_slump_start = tärning.nextInt(10)+1;
                int dator_slump_start = tärning.nextInt(10)+1;

                System.out.println("Nu slumpas vem som ska börja. Den som får högst börjar!");
                Thread.sleep(2000);
                System.out.println(spelar_namn + " fick:" + spelare_slump_start);
                Thread.sleep(2000);
                System.out.println(dator_namn + " fick:" + dator_slump_start);

                if (spelare_slump_start > dator_slump_start || spelare_slump_start == dator_slump_start) {
                    Thread.sleep(2000);
                    System.out.println(spelar_namn + " fick högst! " + spelar_namn + " börjar");
                    vems_tur = "Spelare";
                } else {
                    Thread.sleep(2000);
                    System.out.println(dator_namn + " fick högst! " + dator_namn + " börjar");
                    vems_tur = "Dator";
                }
                break;

            case "avsluta":
            case "2":
                System.out.println("Avslutar spelet....");
                System.exit(0);
                break;

            default:
                System.out.println("Fel inmatning! Vänligen välj Starta/Avsluta");
        }
        
        int[] hälsopoäng = { 10, 10 };

        while (hälsopoäng[0] > 0 && hälsopoäng[1] > 0)
        {
            
        //Spelarens tur

        if (vems_tur.equals("Spelare")) {
            Thread.sleep(2000);
            System.out.println(spelar_namn+" HP:"+hälsopoäng[0]);
            Thread.sleep(2000);
            System.out.println(dator_namn+" HP:"+hälsopoäng[1]);
            Thread.sleep(2000);
            System.out.println("Det är "+spelar_namn+"s" +" tur att agera.");
            Thread.sleep(2000);
            System.out.println("Välj nästa drag:\n 1. Anfall\n 2. Stort anfall (riskabelt)");
            String fight_val=t.nextLine();
        
        int spelare_tal = tärning.nextInt(5) + 1;
        int dator_tal = tärning.nextInt(5) + 1;

        //Anfall

        if (fight_val.equalsIgnoreCase("Anfall")||fight_val.equals("1"))
        {
             spelare_tal= tärning.nextInt(5)+1; 
            System.out.println(spelar_namn+" Attackerar med siffran "+spelare_tal); 
            Thread.sleep(2000);
             dator_tal= tärning.nextInt(5)+1;
            System.out.println(dator_namn+" Försvarar med siffran "+dator_tal); 
            if (spelare_tal>dator_tal)
        {
        int skada=spelare_tal-dator_tal;
        Thread.sleep(2000);
        System.out.println(spelar_namn+" träffade "+dator_namn+" med skadan "+skada);
        hälsopoäng[1]-=skada;
        vems_tur="Dator";
        }

        else{
            Thread.sleep(2000);
            System.out.println(dator_namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            vems_tur="Dator";
            }
        }
        
        //Stort Anfall

        else if (fight_val.equalsIgnoreCase("Stort Anfall")||fight_val.equals("2")) {
            spelare_tal = tärning.nextInt(5) + 1;
            System.out.println(spelar_namn + " Attackerar med siffran " + spelare_tal);
            Thread.sleep(2000);
            dator_tal = tärning.nextInt(10) + 1;
            System.out.println(dator_namn + " Försvarar med siffran " + dator_tal);
        
            if (spelare_tal > dator_tal) {
                int Skada2 = spelare_tal * 2 - dator_tal;
                Thread.sleep(2000);
                System.out.println(spelar_namn + " träffade " + dator_namn + " med skadan " + Skada2+", DUBBELSKADA!");
                hälsopoäng[1] -= Skada2;
                vems_tur = "Dator";
            } 
            
            else {
                Thread.sleep(2000);
                System.out.println(dator_namn + " blockar attacken! Ingen skadas");
                Thread.sleep(2000);
                vems_tur = "Dator";
            }
        } 

        else{
        System.out.println("Fel inmatning. Välj mellan Anfall/Stort Anfall");
        vems_tur="Spelare";
        }
    }

    //Datorns tur

    else if(vems_tur.equals("Dator")){
        Thread.sleep(2000);
        System.out.println(spelar_namn+" HP:"+hälsopoäng[0]);
        Thread.sleep(2000);
        System.out.println(dator_namn+" HP:"+hälsopoäng[1]);
        Thread.sleep(2000);
        System.out.println("Det är "+dator_namn+"s" +" tur att agera.");
        Thread.sleep(2000);
        int dator_val= tärning.nextInt(2)+1;

        //Dator Anfall

        if (dator_val==1){
            Thread.sleep(2000);
            System.out.println(dator_namn+" valde Anfall");
            Thread.sleep(2000);
            int dator_tal_2 = tärning.nextInt(5)+1;
            Thread.sleep(2000);
            System.out.println(dator_namn+" Attackerar med siffran "+dator_tal_2); 
            Thread.sleep(2000);
            int Spelare_Tal_2= tärning.nextInt(5)+1;
            System.out.println(spelar_namn+" Försvarar med siffran "+Spelare_Tal_2); 
        
            if (dator_tal_2>Spelare_Tal_2) {
            int Skada=dator_tal_2-Spelare_Tal_2;
            Thread.sleep(2000);
            System.out.println(dator_namn+" träffade "+spelar_namn+" med skadan "+Skada);
            hälsopoäng[0]-=Skada;
            vems_tur="Spelare";
            }

            else{
            Thread.sleep(2000);
            System.out.println(spelar_namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            vems_tur="Spelare";
            }
        }

        //Dator Stort Anfall

        else{
            System.out.println(dator_namn+" valde Stort Anfall");
            int dator_tal = tärning.nextInt(5) + 1;
            Thread.sleep(2000);
            System.out.println(dator_namn + " Attackerar med siffran " +dator_tal);
            Thread.sleep(2000);
            int Spelare_Tal = tärning.nextInt(10) + 1;
            System.out.println(spelar_namn + " Försvarar med siffran " + Spelare_Tal);

            if (dator_tal>Spelare_Tal){
            int skada=dator_tal*2-Spelare_Tal;
            Thread.sleep(2000);
            System.out.println(dator_namn+" träffade "+spelar_namn+" med skadan "+skada+", DUBBELSKADA!");
            hälsopoäng[0]-=skada;
            vems_tur="Spelare";
            }
            else{
            Thread.sleep(2000);
            System.out.println(spelar_namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            vems_tur="Spelare";
            }
        }
     }
  }

//Vinnarmeddelande
if (hälsopoäng[0] <= 0) {
    Thread.sleep(2000);
    System.out.println(dator_namn + " vinner! " + spelar_namn + " är besegrad.");
} 
    
else if (hälsopoäng[1] <= 0) {
    Thread.sleep(2000);
    System.out.println(spelar_namn + " vinner! " + dator_namn + " är besegrad.");
}
Thread.sleep(2000);
System.out.println("Spelet är slut! vill du köra nytt spel?\n Ja/Nej");
String nytt_spel=t.nextLine();
if (nytt_spel.equalsIgnoreCase("Ja")){
hälsopoäng[0] = 10;
hälsopoäng[1] = 10;
    }
 }
}
 

