
package buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        /*Scanner lea = new Scanner(System.in);
        int nivel,espacios[][];
        Tablero tablero;
        
        System.out.println("Hola, estas jugando Buscaminas by Mike");
        System.out.println("Reglas del juego.\n"+
                "El tablero está dividido en celdas, con minas dis"+
                "tribuidas al azar.\nPara ganar, debes abrir todas las celdas "+
                "que no contienen minas.\nAl hacer clic en una celda que no ti"+
                "ene una mina, se revela un número.\nEste número es la cantida"+
                "d de celdas vecinas que contienen una mina.\nCon esta informa"+
                "ción, puedes determinar las celdas que son seguras y las cel"+
                "das que contienen minas.\nLas celdas sospechosas de contener "+
                "minas se pueden marcar con una bandera usando el botón derec"+
                "ho del ratón.");
        System.out.println("Digite el nivel en que desea juagar el juego.\n"+
                "1. Novato\n2. Aficionado\n3. Experimemtado\n4. Salir");
        nivel = lea.nextInt();
        switch(nivel){
            case 1:
                espacios = new int[9][9];
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;i++){
                        espacios[i][j] = 0;
                    }
                }
                tablero = new Tablero(espacios);
                break;                
            case 2:
                espacios = new int[16][16];
                for(int i=0;i<16;i++){
                    for(int j=0;j<16;i++){
                        espacios[i][j] = 0;
                    }
                }
                tablero = new Tablero(espacios);
                break;
            case 3:
                espacios = new int[16][30];
                for(int i=0;i<16;i++){
                    for(int j=0;j<30;i++){
                        espacios[i][j] = 0;
                    }
                }
                tablero = new Tablero(espacios);
                break;
            default:
                System.out.println("Gracias!!");
                
        }*/
        Random random = new Random();

        for(int i = 1; i <=10; i++) {
            int value = random.nextInt((10 - 2) + 2)+1;
            System.out.println(value);
        }
    }
    
}
