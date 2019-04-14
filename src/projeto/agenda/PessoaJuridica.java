package projeto.agenda;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String cnpj, String nome, String sobreNome, String dataNascimento, String sexo, String rg) {
        super(nome, sobreNome, dataNascimento, sexo, rg);
        this.cnpj = cnpj;
    } 
    
    @Override
    public String toString(){
    
        return super.toString() +" "+ getCnpj();
    }
}
