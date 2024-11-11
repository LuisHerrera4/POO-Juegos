import java.util.Scanner;


public class Menu {
    Scanner sc = new Scanner(System.in);

    JocDaus jocDaus;

    public Menu(JocDaus jocDaus) {
        this.jocDaus = jocDaus;
    }

    public void menuPrincipal(){
        System.out.println("Bienvenid@, elija el juego que le gustaria jugar");
        System.out.println("1: Daus");
        System.out.println("2: Parxís");
        System.out.println("3: Tic Tac Toe");
        System.out.println("-1: exit");
    }

    public void menuJoc(){
        int opcionJoc= sc.nextInt();
        while(true){
            switch (opcionJoc){
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
    }

    public void opcioDaus(){
        System.out.println("1: tirar");
        System.out.println("2: acabar joc");

    }

    public void menuDaus(){
        int opcionDaus= sc.nextInt();
        switch (opcionDaus){
            case 1:
                jocDaus.jugar();
                break;
            case 2:
                menuPrincipal();
            default:
                System.exit(-1);

        }

    }
}
