import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nom = new Scanner(System.in);
        Random nom2 = new Random();
        int javob, son;
        System.out.print("Men bir son oyladim osha sonni top: ");
        javob = nom.nextInt();
        son = nom2.nextInt(99);
        while (true){
            if(javob < son){
                System.out.print("Men oylagan son kattaroq: ");
                javob = nom.nextInt();
            }
            else if(javob > son){
                System.out.print("Men oylagan son kichikroq: ");
                javob = nom.nextInt();
            }
            else {
                System.out.println("Topdingiz");
                break;
            }
        }
    }
}