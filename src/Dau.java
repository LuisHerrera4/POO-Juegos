import java.util.Objects;

public class Dau {
    private int valor;

    public Dau() {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dau dau = (Dau) o;
        return valor == dau.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public int tirar(){

        valor= (int) (Math.random() *6)+1;
        return valor;
    }
}
