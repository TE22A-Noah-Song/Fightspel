//Noah Söng TE22A

import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        //Slumpar tal
        Random tärning= new Random();
        int Spelare_Slump_Start = tärning.nextInt(10)+1;
        int Dator_Slump_Start = tärning.nextInt(10)+1;

        // Meny och Vem börjar
        Scanner t=new Scanner(System.in);
        System.out.println("Välkommen till fightspel. Välj val:\n 1. Starta\n 2. Avsluta");
        String val=t.nextLine();

        String Spelar_Namn = ""; 
        String Dator_Namn = "";
        String Vems_Tur = "";

        switch (val.toLowerCase()) {
            case "starta":
            case "1":
                System.out.println("Döp din spelare:");
                Spelar_Namn = t.nextLine();
                System.out.println("Döp din motståndare:");
                Dator_Namn = t.nextLine();

                System.out.println("Nu slumpas vem som ska börja. Den som får högst börjar!");
                Thread.sleep(2000);
                System.out.println(Spelar_Namn + " fick:" + Spelare_Slump_Start);
                Thread.sleep(2000);
                System.out.println(Dator_Namn + " fick:" + Dator_Slump_Start);

                if (Spelare_Slump_Start > Dator_Slump_Start || Spelare_Slump_Start == Dator_Slump_Start) {
                    Thread.sleep(2000);
                    System.out.println(Spelar_Namn + " fick högst! " + Spelar_Namn + " börjar");
                    Vems_Tur = "Spelare";
                } else {
                    Thread.sleep(2000);
                    System.out.println(Dator_Namn + " fick högst! " + Dator_Namn + " börjar");
                    Vems_Tur = "Dator";
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

        if (Vems_Tur.equals("Spelare")) {
            Thread.sleep(2000);
            System.out.println(Spelar_Namn+" HP:"+hälsopoäng[0]);
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" HP:"+hälsopoäng[1]);
            Thread.sleep(2000);
            System.out.println("Det är "+Spelar_Namn+"s" +" tur att agera.");
            Thread.sleep(2000);
            System.out.println("Välj nästa drag:\n 1. Anfall\n 2. Stort anfall (riskabelt)");
            String Fight_Val=t.nextLine();
        
        int Spelare_Tal = tärning.nextInt(5) + 1;
        int Dator_Tal = tärning.nextInt(5) + 1;

        //Anfall

        if (Fight_Val.equalsIgnoreCase("Anfall")||Fight_Val.equals("1"))
        {
             Spelare_Tal= tärning.nextInt(5)+1; 
            System.out.println(Spelar_Namn+" Attackerar med siffran "+Spelare_Tal); 
            Thread.sleep(2000);
             Dator_Tal= tärning.nextInt(5)+1;
            System.out.println(Dator_Namn+" Försvarar med siffran "+Dator_Tal); 
            if (Spelare_Tal>Dator_Tal)
        {
        int Skada=Spelare_Tal-Dator_Tal;
        Thread.sleep(2000);
        System.out.println(Spelar_Namn+" träffade "+Dator_Namn+" med skadan "+Skada);
        hälsopoäng[1]-=Skada;
        Vems_Tur="Dator";
        }

        else{
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            Vems_Tur="Dator";
            }
        }
        
        //Stort Anfall

        else if (Fight_Val.equalsIgnoreCase("Stort Anfall")||Fight_Val.equals("2")) {
            Spelare_Tal = tärning.nextInt(5) + 1;
            System.out.println(Spelar_Namn + " Attackerar med siffran " + Spelare_Tal);
            Thread.sleep(2000);
            Dator_Tal = tärning.nextInt(10) + 1;
            System.out.println(Dator_Namn + " Försvarar med siffran " + Dator_Tal);
        
            if (Spelare_Tal > Dator_Tal) {
                int Skada2 = Spelare_Tal * 2 - Dator_Tal;
                Thread.sleep(2000);
                System.out.println(Spelar_Namn + " träffade " + Dator_Namn + " med skadan " + Skada2+", DUBBELSKADA!");
                hälsopoäng[1] -= Skada2;
                Vems_Tur = "Dator";
            } else {
                Thread.sleep(2000);
                System.out.println(Dator_Namn + " blockar attacken! Ingen skadas");
                Thread.sleep(2000);
                Vems_Tur = "Dator";
            }
        } 

        else{
        System.out.println("Fel inmatning. Välj mellan Anfall/Stort Anfall");
        Vems_Tur="Spelare";
        }
    }

    //Datorns tur

    else if(Vems_Tur.equals("Dator")){
        Thread.sleep(2000);
        System.out.println(Spelar_Namn+" HP:"+hälsopoäng[0]);
        Thread.sleep(2000);
        System.out.println(Dator_Namn+" HP:"+hälsopoäng[1]);
        Thread.sleep(2000);
        System.out.println("Det är "+Dator_Namn+"s" +" tur att agera.");
        Thread.sleep(2000);
        int Dator_Val= tärning.nextInt(2)+1;

        //Dator Anfall

        if (Dator_Val==1){
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" valde Anfall");
            Thread.sleep(2000);
            int Dator_Tal_2 = tärning.nextInt(5)+1;
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" Attackerar med siffran "+Dator_Tal_2); 
            Thread.sleep(2000);
            int Spelare_Tal_2= tärning.nextInt(5)+1;
            System.out.println(Spelar_Namn+" Försvarar med siffran "+Spelare_Tal_2); 
        
            if (Dator_Tal_2>Spelare_Tal_2) {
            int Skada=Dator_Tal_2-Spelare_Tal_2;
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" träffade "+Spelar_Namn+" med skadan "+Skada);
            hälsopoäng[0]-=Skada;
            Vems_Tur="Spelare";
            }

            else{
            Thread.sleep(2000);
            System.out.println(Spelar_Namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            Vems_Tur="Spelare";
            }
        }

        //Dator Stort Anfall

        else{
            System.out.println(Dator_Namn+" valde Stort Anfall");
            int Dator_Tal = tärning.nextInt(5) + 1;
            Thread.sleep(2000);
            System.out.println(Dator_Namn + " Attackerar med siffran " +Dator_Tal);
            Thread.sleep(2000);
            int Spelare_Tal = tärning.nextInt(10) + 1;
            System.out.println(Spelar_Namn + " Försvarar med siffran " + Spelare_Tal);

            if (Dator_Tal>Spelare_Tal){
            int Skada=Dator_Tal*2-Spelare_Tal;
            Thread.sleep(2000);
            System.out.println(Dator_Namn+" träffade "+Spelar_Namn+" med skadan "+Skada+", DUBBELSKADA!");
            hälsopoäng[0]-=Skada;
            Vems_Tur="Spelare";
            }
            else{
            Thread.sleep(2000);
            System.out.println(Spelar_Namn+" blockar attacken! Ingen skadas");
            Thread.sleep(2000);
            Vems_Tur="Spelare";
            }
        }
     }
  }

if (hälsopoäng[0] <= 0) {
    Thread.sleep(2000);
    System.out.println(Dator_Namn + " vinner! " + Spelar_Namn + " är besegrad.");
} 
    
else if (hälsopoäng[1] <= 0) {
    Thread.sleep(2000);
    System.out.println(Spelar_Namn + " vinner! " + Dator_Namn + " är besegrad.");
}
Thread.sleep(2000);
System.out.println("Spelet är slut! vill du köra nytt spel?\n Ja/Nej");
String Nytt_Spel=t.nextLine();
if (Nytt_Spel.equalsIgnoreCase("Ja")){
hälsopoäng[0] = 10;
hälsopoäng[1] = 10;
}


 }
}
 

