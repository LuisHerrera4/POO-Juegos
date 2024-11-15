public class JocDaus {
    private int ganar;
    private int perder;
    Dau dau1= new Dau();;
    Dau dau2= new Dau();;
    Dau dau3= new Dau();;

    public JocDaus() {
        this.dau1 = dau1;
        this.dau2 = dau2;
        this.dau3 = dau3;
        this.ganar= 0;
        this.perder=0;
    }

    public int jugar(){

        dau1.tirar();
        dau2.tirar();
        dau3.tirar();

        if(dau1.equals(dau2) && dau1.equals(dau3) && dau2.equals(dau3)){
            ganar++;
            return ganar;
        }else {
            perder++;
            return perder;
        }
    }

    public void resultadoGanar(){
        if(ganar==0){
            System.out.println("No has ganado ninguna vez");
        } else if (ganar ==1) {
            System.out.println("Has ganado 1 vez");
        } else if (ganar > 1) {
            System.out.println("Has ganado " + ganar+ " veces" );
        }
    }

    public void resultadoPerder(){
        if(perder==0){
            System.out.println("No has perdido ninguna vez");
        } else if (perder ==1) {
            System.out.println("Has perdido 1 vez");
        } else if (perder > 1) {
            System.out.println("Has perdido " + perder + " veces" );
        }
    }

}
