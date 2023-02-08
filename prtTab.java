public class prtTab {
    public void printTab(String[][] tb){
        //metodo que imprime el tablero, simplemente metodo que imprime el tablero xD, no hace nada mas
        int x,y,H=8;
        System.out.println("-----------------TABLERO-----------------");
        System.out.println("   A    B    C    D    E    F    G    H  ");
        System.out.println("|----|----|----|----|----|----|----|----|");
        for(x=0;x<8;x++){
            for(y=0;y<8;y++){
                System.out.print("| "+tb[x][y]+" ");
            }
                System.out.println("|"+(H)+"\n|----|----|----|----|----|----|----|----|");
                H--;
        }
    }
    public void actTabB(String[][] tb,int[] newP,int[] posB){
        //actualiza la posicion de las blancas del tablero
        System.out.println("Posicion valida: ");
        tb[posB[0]][posB[1]]="  ";
        tb[newP[0]][newP[1]]="CB";
        posB[0]=newP[0];
        posB[1]=newP[1];
    }
    public void actTabN(String[][] tb,int[] newP,int[] posN){
        //actualiza la posicion de las negro del tablero
        System.out.println("Posicion valida: ");
        tb[posN[0]][posN[1]]="  ";
        tb[newP[0]][newP[1]]="CN";
        posN[0]=newP[0];
        posN[1]=newP[1];
    }
}
