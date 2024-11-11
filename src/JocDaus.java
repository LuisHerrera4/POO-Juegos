public class JocDaus {

    Dau dau1= new Dau();;
    Dau dau2= new Dau();;
    Dau dau3= new Dau();;

    public JocDaus() {
        this.dau1 = dau1;
        this.dau2 = dau2;
        this.dau3 = dau3;
    }

    public int jugar(){
        int ganar=0;
        int perder=0;

        dau1.tirar();
        dau2.tirar();
        dau3.tirar();

        if(dau1.equals(dau2) && dau1.equals(dau3) && dau2.equals(dau3)){
            ganar++;
        }else {
            perder++;
        }
        return ganar;

    }
}
