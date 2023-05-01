public class contaBanco {

    private String nome;
    private String sobrenNome;
    private Double cpf;
    private Double saldo;
    private Double deposito = null;
    private Double retirada = null;

    public contaBanco() {

    }

    public contaBanco(String nome, String sobrenNome, Double cpf, Double saldo, Double deposito, Double retirada) {
        this.nome = nome;
        this.sobrenNome = sobrenNome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.deposito = deposito;
        this.retirada = retirada;
    }
    public contaBanco( Double cpf, Double saldo, Double deposito, Double retirada) {

        this.cpf = cpf;
        this.saldo = saldo;
        this.deposito = deposito;
        this.retirada = retirada;
    }

    public String getNome() {
        return nome;
    }

    public String setNome() {
        this.nome = nome;
        return nome;
    }

    public String getSobrenNome() {
        return sobrenNome;
    }

    public void setSobrenNome(String sobrenNome) {
        this.sobrenNome = sobrenNome;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo(Double saldo) {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public Double setDeposito() {
        this.deposito = deposito;
        return deposito;
    }

    public Double getRetirada() {

        return retirada;
    }

    public void setRetirada(Double retirada) {

        this.retirada = retirada;
    }
}