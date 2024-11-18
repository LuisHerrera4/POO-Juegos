public class JocDaus {
    private int ganar;
    private int perder;
    Dau dau1;
    Dau dau2;
    Dau dau3;

    public JocDaus() {
        this.dau1 = new Dau();
        this.dau2 = new Dau();
        this.dau3 = new Dau();
        this.ganar= 0;
        this.perder=0;
    }

    public int getGanar() {
        return ganar;
    }

    public int getPerder() {
        return perder;
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
        if(getGanar() ==0){
            System.out.println("No has ganado ninguna vez");
        } else if (getGanar() ==1) {
            System.out.println("Has ganado 1 vez");
        } else if (getGanar() > 1) {
            System.out.println("Has ganado " + getGanar() + " veces" );
        }
    }

    public void resultadoPerder(){
        if(getPerder()==0){
            System.out.println("No has perdido ninguna vez");
        } else if (getPerder() ==1) {
            System.out.println("Has perdido 1 vez");
        } else if (getPerder() > 1) {
            System.out.println("Has perdido " + getPerder() + " veces" );
        }
    }

}
