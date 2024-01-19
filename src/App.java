import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner t=new Scanner(System.in);
        Random tärning= new Random();
        int SpelareSlumpStart = tärning.nextInt(10)+1;
        int DatorSlumpStart = tärning.nextInt(10)+1;
        System.out.println("Välkommen till fightspel. Välj val:\n 1. Starta\n 2. Avsluta");
        String val=t.nextLine();
        if (val.equalsIgnoreCase("Starta"))
        {
        System.out.println("Nu slumpas vem som ska börja. Den som får högst börjar!");
        System.out.println("Du fick: "+SpelareSlumpStart);
        System.out.println("Datorn fick: "+DatorSlumpStart);

            

        }
    }
}
