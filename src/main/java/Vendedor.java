import java.util.Observable;
import java.util.Observer;

public class Vendedor implements Observer {

    private String produto;
    private String ultimaNotificacao;

    public Vendedor(String produto) {
        this.produto = produto;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Fornecedor Fornecedor) {
        Fornecedor.addObserver(this);
    }

    public void update(Observable fornecedor, Object arg1) {
        this.ultimaNotificacao = this.produto + ", novo produto disponivel no  " + fornecedor.toString();
    }
}