public class Traductor {
    public boolean traducirA(int x, char y, int[] newP){
        boolean control=false;
        if(x==8){
            newP[0]=0;
        }
        else if(x==7){
            newP[0]=1;
        }
        else if(x==6){
            newP[0]=2;
        }
        else if(x==5){
            newP[0]=3;
        }
        else if(x==4){
            newP[0]=4;
        }
        else if(x==3){
            newP[0]=5;
        }
        else if(x==2){
            newP[0]=6;
        }
        else if(x==1){
            newP[0]=7;
        }
        else{
            System.out.println("La posicion introducida es invalida");
            return control;
        }
        if(y=='A'||y=='a'){
            newP[1]=0;
        }
        else if(y=='B'||y=='b'){
            newP[1]=1;
        }
        else if(y=='C'||y=='c'){
            newP[1]=2;
        }
        else if(y=='D'||y=='d'){
            newP[1]=3;
        }
        else if(y=='E'||y=='e'){
            newP[1]=4;
        }
        else if(y=='F'||y=='f'){
            newP[1]=5;
        }
        else if(y=='G'||y=='g'){
            newP[1]=6;
        }
        else if(y=='H'||y=='h'){
            newP[1]=7;
        }
        else{
            System.out.println("La posicion introducida es invalida");
            return control;
        }
        control=true;
        return control; 
    }  
}
