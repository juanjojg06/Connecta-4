import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
int fila = 7;
int columna= 6;


    int tabla[][] = new int[columna][fila];

    int largoTablero = tabla.length;
    public int[][] imprimirTablero(){

        for (int i = 0; i < tabla.length; i++){


            for (int j = 0; j < tabla[i].length; j++){

                tabla[i][j]=0;
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        return tabla;

    }

    public int  tirarFicha(){
        boolean esInvalido = false;
        int poci;
        do {

            System.out.println("Pon un numero ");
            poci = sc.nextInt();

            if (poci >= largoTablero && poci > 0) {

                System.out.println("Pon un numero valido");
                esInvalido = true;

            }else {
                esInvalido = false;
            }

        } while (esInvalido);
        return poci;

    }

    public void colocarFicha(){


    }



    public void jugador1(int [][] tablero ,int poci  ){

        System.out.println();
        tablero[5][poci] = 1;
        for (int i = 0; i < tabla.length; i++){


            for (int j = 0; j < tabla[i].length; j++){

                System.out.print(tabla[i][j] + " ");

            }
            System.out.println();
        }






    }
















    public void main(){
       // imprimirTablero();
       jugador1(imprimirTablero(),tirarFicha());


    }


    /*
    ----MAPA MENTAL----

    -En el el metodo de imprimir llenarlo a 0
    - en el de jugador sustituir el 0 a un 1  o 2
-cando ya me funcione comprobar si primer lugar si en la ultima pocicion de esa columna esta vacia si no sube una pocion mas arriba si no se puede arriba de todo decir que ponga en otra fila
     */

}
