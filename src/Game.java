public class Game {


    int tabla[][] = new int[6][7];


    public int[][] imprimirTablero(){

        for (int i = 0; i < tabla.length; i++){


            for (int j = 0; j < tabla[i].length; j++){


                System.out.print(tabla[i][j]+ " 0 ");
            }
            System.out.println();
        }
        return tabla;

    }










    public void main(){
        imprimirTablero();

    }




}
