public class TraductorDmovimiento {
    /*Movimientos Posibles segun la posicion del CB y CN*/
    public boolean traducirA(char y, int x, int[] newP){
        boolean control=false;
        if(newP[1]==0){
            y = 'A';
        }
        else if(newP[1]==1){
            y = 'B';
        }
        else if(newP[1]==2){
            y = 'C';
        }
        else if(newP[1]==3){
            y = 'D';
        }
        else if(newP[1]==4){
            y = 'E';
        }
        else if(newP[1]==5){
            y = 'F';
        }
        else if(newP[1]==6){
            y = 'G';
        }
        else if(newP[1]==7){
            y = 'H';
        }
        else{
            return control;
        }
        if(newP[0]==0){
            x=8;
        }
        else if(newP[0]==1){
            x=7;
        }
        else if(newP[0]==2){
            x=6;
        }
        else if(newP[0]==3){
            x=5;
        }
        else if(newP[0]==4){
            x=4;
        }
        else if(newP[0]==5){
           x=3;
        }
        else if(newP[0]==6){
            x=2;
        }
        else if(newP[0]==7){
            x=1;
        }
        else{
            return control;
        }
        control=true;
        return control; 
    }  
}