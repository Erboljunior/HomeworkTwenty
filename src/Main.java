
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Parallelepiped parallelepiped = new Parallelepiped(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            parallelepiped.S();
            parallelepiped.V();

            if (parallelepiped.getHeight() > 20 ) {
                throw new RuntimeException();
            }
            if (parallelepiped.getWidth() > 20 ) {
                throw new RuntimeException();
            }
            if (parallelepiped.getLength() > 20 ) {
               throw new RuntimeException();
            }
            System.out.println("height: "+parallelepiped.getHeight()+"\n"+"width: "+parallelepiped.getWidth()
                    +"\nlength: "+parallelepiped.getLength());
            System.out.println("\nVolume: "+parallelepiped.V()+"\nArea: "+ parallelepiped.S());
        }catch(InputMismatchException e){
            System.err.println("LETTERS ARE NOT ALLOWED HERE");
        }catch (RuntimeException e) {
            System.err.println("LOOK CAREFULLY");
        }

    }
}