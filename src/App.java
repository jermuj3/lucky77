import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
       Random random = new Random();

       int numero1;
       int numero2;
       int numero3;
       int saldo = 0;
        int seiskat = 0;
        String rahnu;
      
    //    if (numero1 == 7 || numero2 == 7 || numero3 ==7) {
    //     System.out.println("voitit");
    //    }
    //    else {
    //     System.out.println("hävisit");
        
    //    }// Kysytään paljonko käyttäjällä on rahaa?
        System.out.println("Kuinka paljon on rahnua?");
            rahnu = in.nextLine();
            saldo = Integer.parseInt(rahnu);
            

        
        int x = 0;
        while(saldo > 0) {
            saldo--;
            x++;
            seiskat = 0;
            numero1 = random.nextInt(10) + 1;
            numero2 = random.nextInt(10) +1;
            numero3 = random.nextInt(10) +1;
            System.out.println("arvotut numerot ovat: " +numero1 +" ,"  + numero2 +" ," + numero3);
            if (numero1 == 7) {
                seiskat++;
            }
            if (numero2 == 7) {
                seiskat++;
            }
            if (numero3 == 7) {
                seiskat++;
            }
            System.out.println("seiskojen lukumäärä " +seiskat);
            
            if (seiskat == 1) {
                saldo = saldo + 3;
                System.out.println("voitit kolme euroa");
            }
            if (seiskat == 2) {
                saldo = saldo + 5;
                System.out.println("Voitit viisi euroa");
            }
            if (seiskat == 3) {
                saldo = saldo + 10;
                System.out.println("voitit kymmenen euroe");
            }
            System.out.println("sinulla on saldoa " + saldo);
            System.out.println("haluatko pelata uudestaan");
            rahnu = in.nextLine();
            if (rahnu.equals("ei")) {                
                System.out.println("Saldosi on " + saldo);
                break;
                
            }

        }
        System.out.println(x);
        in.close();
        




    }
}
