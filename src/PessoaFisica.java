class PessoaFisica extends Pessoa {
    private String rg;

    public PessoaFisica(String nome, String cpf, int idade, String rg) {
        super(nome, cpf, idade);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }
}