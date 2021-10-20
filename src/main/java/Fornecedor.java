import java.util.Observable;

    public class Fornecedor extends Observable {

        private String nomeDescicao;
        private Integer Validade;
        private String nomeFornecedor;

        public Fornecedor(String Descicao, Integer Validade, String nomeFornecedor) {
            this.nomeDescicao = nomeDescicao;
            this.Validade = Validade;
            this.nomeFornecedor = nomeFornecedor;
        }

        public void lancarAtualizacao() {
            setChanged();
            notifyObservers();
        }

        @Override
        public String toString() {
            return "Fornecedor{" +
                    "nomeDescrição=" + nomeDescicao +
                    ", data validade=" + Validade +
                    ", nomeFornecedor='" + nomeFornecedor + '\'' +
                    '}';
        }
    }

