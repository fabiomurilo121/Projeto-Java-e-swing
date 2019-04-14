package projeto.agenda;

public abstract class Pessoa {
    
    private String nome;
    private String sobreNome;
    private String dataNascimento;
    private String sexo;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public Pessoa(String nome, String sobreNome, String dataNascimento, String sexo, String rg) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.rg = rg;
    }
  
    @Override
    public String toString(){
    
        return getNome() +" "+ getSobreNome() +" "+ getDataNascimento() +" "+ getSexo() +" "+ getRg();
    }

}
