public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-00", 30, "1234567");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa ABC", "12.345.678/0001-90", 5, "123456", "Empresa XYZ");

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        System.out.println("RG: " + pessoaFisica.getRg());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Idade: " + pessoaJuridica.getIdade());
        System.out.println("Razão Social: " + pessoaJuridica.getRazaoSocial());
    }
}
