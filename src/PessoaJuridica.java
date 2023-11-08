class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String cpf, int idade, String cnpj, String razaoSocial) {
        super(nome, cpf, idade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
}