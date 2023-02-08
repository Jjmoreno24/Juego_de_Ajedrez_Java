public class CalcPos {
    public boolean validar(int x, int y){
        //El metodo validad se utiliza para que los indices no sean mayores a 8 o menores que 0 retornando un valor de cierto falso
        if(x>=0 && x<8 && y>=0 && y<8){
            return true;
        }
        else return false;
    }
    public int determinar(int[][] posiciones, int[] pos){
        //El metodo "determinar" retorna un valor entero con el numero de posiciones calculadas
        //Declaracion de variables
        int F;
        int C;
        int i=0;
        //posicion 1 determinar 
        F=pos[0]+2;
        C=pos[1]+1;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 2 determinar
        F=pos[0]+1;
        C=pos[1]+2;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 3 determinar
        F=pos[0]-1;
        C=pos[1]+2;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 4 determinar
        F=pos[0]-2;
        C=pos[1]+1;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 5 determinar
        F=pos[0]-2;
        C=pos[1]-1;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 6 determinar
        F=pos[0]-1;
        C=pos[1]-2;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 7 determinar
        F=pos[0]+1;
        C=pos[1]-2;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        //posicion 8 determinar
        F=pos[0]+2;
        C=pos[1]-1;
        if(validar(F, C)){
            posiciones[i][0]=F;
            posiciones[i][1]=C;
            i++;
        }
        return i;//la variable i contiene el numero de posiciones calculadas 
    }  
    public boolean ValPos(int lim,int newP[],int[][] posiciones) {
        //El metodo valPos valida que la posicion introducida es una posicion valida para que el caballo se pueda mover
        //retorna un valor booleano
        int i;
        boolean control=false;
        for(i=0;i<lim;i++){
            if((posiciones[i][0]==newP[0])&&(posiciones[i][1]==newP[1])){
                control=true;
                break;
            }
        }
        if(control==false){
            System.out.println("Esta posicion no cumple con el patron del movimiento del caballo, vuelva a introducirla");
        }
        return control;
    }
}
