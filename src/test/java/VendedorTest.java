import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class VendedorTest {

    private Fornecedor cadastrar;

    @Test
        void deveNotificarUmVendedor() {
            Fornecedor Fornecedor = new Fornecedor("Leite", 30,"Param");
            Vendedor vendedor = new Vendedor("Vendedor 2");
            vendedor.cadastrar(Fornecedor);
            cadastrar.lancarAtualizacao();
            assertEquals("Vendedor 2, {Descricao=Leite, Validade=30, nomeDisciplina='Param'}", vendedor.getUltimaNotificacao());
        }

}