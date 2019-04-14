package projeto.agenda;

public class PessoaFisica extends Pessoa {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome, String sobreNome, String dataNascimento, String sexo, String rg) {
        super(nome, sobreNome, dataNascimento, sexo, rg);
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
    
        return super.toString() +" "+ getCpf();
    }
    
}
