import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


    public class NuevaLinea{
        public static void nuevaLinea(double c){

            double pulg=0;
            double cent;

            pulg = c *0.39370;

            System.out.println("la conversion de " +c + "cm a pulgada es: " +pulg);

        }

        public static void main(String[] args) throws IOException{
        double cent=0;
        double pulg=0;

            BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("digite cantidad de centimetro:");
            cent = Double.parseDouble(k.readLine());

            nuevaLinea(cent);
    }

    }
