import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MojaPrvaAplikacija {
    public static void main(String[] args) {
        // Kreiramo skener za unos podataka sa tastature
        Scanner input = new Scanner(System.in);

        System.out.println("--- DOBRODOŠLI U MOJU JAVA APLIKACIJU ---");
        
        // Unos imena
        System.out.print("Kako se zoveš? ");
        String ime = input.nextLine();
        
        System.out.println("\nZdravo " + ime + "! Drago mi je što testiraš ovaj kod.");
        
        // Rad sa datumima
        LocalDate danas = LocalDate.now();
        LocalDate krajGodine = LocalDate.of(danas.getYear(), 12, 31);
        long danaDoKraja = ChronoUnit.DAYS.between(danas, krajGodine);
        
        System.out.println("Danas je: " + danas);
        System.out.println("Do kraja ove godine ima još tačno " + danaDoKraja + " dana!");
        
        // Mala simulacija logike
        System.out.println("\n-----------------------------------------");
        System.out.print("Unesi bilo koji broj da ga dupliram: ");
        if(input.hasNextInt()) {
            int broj = input.nextInt();
            System.out.println("Rezultat je: " + (broj * 2));
        } else {
            System.out.println("To nije bio ceo broj, ali nema veze!");
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Hvala što koristiš onlajn kompajler. Pozdrav!");
        
        input.close();
    }
}