import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
  public class laboratorio {
      public static void Adivinador() throws IOException {
          int chance = 0;
          int i;
              BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
              for (i = 1; i < 4; i++) {
                  {
                      System.out.println("\n\nchance #" + i);
                      System.out.printf("numero: ");
                      chance = Integer.parseInt(k.readLine());
                  }

                  if (chance == 50) {
                      System.out.printf("\nadivinaste");
                  } else if (chance < 50) {
                      System.out.printf("demaciado bajo");
                  } else {
                      System.out.printf("\ndemasiado alto");
                  }

              }
          }3

      public static void main(String[] args) throws IOException {


          System.out.printf("\nLABORATORIO");
          System.out.printf("\nELABORADO POR: JOSBEL MENDOZA");
          System.out.printf("\nPiensa en un numero entre 1 y 100, Adivina cual es, Tienes 3 chance");
          Adivinador();
      }
  }