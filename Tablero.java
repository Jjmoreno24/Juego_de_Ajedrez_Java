import java.io.*;
public class Tablero{
    public static void main(String[] args) throws Exception {

        //bloque de declaracion de variables y objetos
        //filas columnas
        int[][] posiciones =new int[8][2];  //Arreglo que guarda las posiciones disponibles
        int[] posB ={7,1};   //arreglo que guarda la posicion del caballo blanco
        int[] posN= {0,6};   //arreglo que guarda la posicion del caballo negro
        int[] newP= new int[2]; //arreglo que guartda la nueva posicion
        int i,lim,fila;           //variables para los ciclos for 
        boolean control=true,control2=true;
        char colu;
        CalcPos posis=new CalcPos();   //clase Calcpos encargada de determinar las posiciones disponibles
        Traductor trac=new Traductor();
        prtTab prt=new prtTab();
        BufferedReader objread= new BufferedReader(new InputStreamReader(System.in));

        String[][] tb={{"  ","  ","  ","  ","  ","  ","CN","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","  ","  ","  ","  ","  ","  ","  "},
                       {"  ","CB","  ","  ","  ","  ","  ","  "}};//arreglo de cadenas que llevan las posiciones del tablero

        String ganador="",jugadorB="Jugador Blanco",jugadorN="Jugador Negro",columna;//cadenas para los jugadores y ganador 

        //Entrada del nombre de los jugadores

        System.out.print("---------------Bienvenido a Ajedrez en java---------------\n");
        System.out.print("Ingrese el nombre del jugador de fichas blancas: ");
        jugadorB=objread.readLine();
        System.out.print("Ingrese el nombre del jugador de fichas negras: ");
        jugadorN=objread.readLine();
        prt.printTab(tb);
        while(control){
                System.out.println("Turno de: "+jugadorB);
                System.out.println("Posiciones Disponibles Blancas: ");
                lim=posis.determinar(posiciones, posB);
                for(i=0;i<lim;i++){
                    System.out.println("Posicion n"+(i+1)+": "+(posiciones[i][0]) +", "+(posiciones[i][1]));
                }

                while(control2){
                    try {
                        System.out.print("Digite la letra de la columna: ");
                        columna=objread.readLine();
                        //validacion que el valor de la columa introducido no tenga mas de un caracter
                        while(columna.length()>1){
                            System.out.print("Vuelva a introducir la letra de la columna: ");
                            columna=objread.readLine();
                        }
                        colu=columna.charAt(0);
                        //se introduce el valor numero de la fila
                        System.out.print("Digite la fila: ");
                        fila=Integer.parseInt(objread.readLine());
                        //El primer if llama a la funcion que valida si los valores introducidos hacen referencia a un valor real del tablero
                        if(trac.traducirA(fila, colu, newP)){
                            //el segundo if valida que la posicion introducida es una posicion valida para que el caballo se pueda mover
                            if(posis.ValPos(lim, newP, posiciones)){
                                prt.actTabB(tb, newP, posB);
                                control2=false;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("******Ha ocurrido un error******");
                    }
                }
                control2=true;
                //fin turno blanco
                prt.printTab(tb);
                if((posN[0]==posB[0])&&(posB[1]==posN[1])){
                    ganador=jugadorB;
                    control=false;
                    break;
                }
                //inicio turno negro
                System.out.println("Turno de: "+jugadorN);
                lim=posis.determinar(posiciones, posN);
                System.out.println("Posiciones Disponibles Negras: ");
                for(i=0;i<lim;i++){
                    System.out.println("Posicion n"+(i+1)+": "+(posiciones[i][0]) +", "+(posiciones[i][1]));
                }
                while(control2){
                    try {
                        System.out.print("Digite la letra de la columna: ");
                        columna=objread.readLine();
                        //validacion que el valor de la columa introducido no tenga mas de un caracter
                        while(columna.length()>1){
                            System.out.print("Vuelva a introducir la letra de la columna: ");
                            columna=objread.readLine();
                        }
                        colu=columna.charAt(0);
                        //se introduce el valor numero de la fila
                        System.out.print("Digite la fila: ");
                        fila=Integer.parseInt(objread.readLine());
                        //El primer if llama a la funcion que valida si los valores introducidos hacen referencia a un valor real del tablero
                        if(trac.traducirA(fila, colu, newP)){
                            //el segundo if valida que la posicion introducida es una posicion valida para que el caballo se pueda mover
                            if(posis.ValPos(lim, newP, posiciones)){
                                prt.actTabN(tb, newP, posN);
                                control2=false;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("******Ha ocurrido un error******");
                    }
                }
                if((posN[0]==posB[0])&&(posB[1]==posN[1])){
                    ganador=jugadorN;
                    control=false;
                }
                control2=true;
                prt.printTab(tb);
        }
        System.out.println("El ganador es: "+ganador);
    }
}