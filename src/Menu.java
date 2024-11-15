import java.util.Scanner;


public class Menu {
    Scanner sc = new Scanner(System.in);

    JocDaus jocDaus;

    public Menu(JocDaus jocDaus) {
        this.jocDaus = jocDaus;
    }

    int opcio=0;

    public void menuPrincipal(){
        System.out.println("Bienvenid@, elija el juego que le gustaria jugar");
        System.out.println("1: Daus");
        System.out.println("2: Parxís");
        System.out.println("3: Tic Tac Toe");
        System.out.println("-1: exit");

        opcio=sc.nextInt();
        sc.nextLine();

            switch (opcio){
                case 1:
                    menuDaus();
                    break;
                case 2:
                    System.out.println("Funcionalitat no implementada");
                    break;
                case 3:
                    System.out.println("Funcionalitat no implementada");
                    break;
                default:
                    System.exit(-1);
            }

    }

    public void menuDaus(){
        System.out.println("1: tirar");
        System.out.println("2: acabar joc");
        opcio=sc.nextInt();
        sc.nextLine();

        while(true){
            opcio=sc.nextInt();
            sc.nextLine();
            switch (opcio) {
                case 1:
                    jocDaus.jugar();
                    break;
                case 2:
                    jocDaus.resultadoGanar();
                    jocDaus.resultadoPerder();
                    break;
                default:
                    System.exit(-1);
            }
        }
    }

}
