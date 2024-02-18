public class User {
    private String nome;
    private int eta;

    public User() {
        // Valori di default
        this.nome = "Nome di default";
        this.eta = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}
