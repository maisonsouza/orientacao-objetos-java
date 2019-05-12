public class Cnpj {
    private String valor;

    public Cnpj(String valor){
        this.valor = valor;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Cnpj)) {
            return false;
        }
        Cnpj outro = (Cnpj) o;
        return this.valor.equals(outro.valor);
    }

    public int hashCode() {
        return this.valor.hashCode(); // delegamos a geracao do hashCode da classe Cnpj para seu atributo String valor
    }
}