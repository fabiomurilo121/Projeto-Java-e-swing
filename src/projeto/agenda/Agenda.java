package projeto.agenda;

import java.util.ArrayList;

public class Agenda {
    
    private  ArrayList<PessoaFisica>agendaF = new ArrayList<>();
    private  ArrayList<PessoaJuridica>agendaJ = new ArrayList<>();

    public ArrayList<PessoaFisica> getAgendaF() {
        return agendaF;
    }

    public void setAgendaF(ArrayList<PessoaFisica> agendaF) {
        this.agendaF = agendaF;
    }

    public ArrayList<PessoaJuridica> getAgendaJ() {
        return agendaJ;
    }

    public void setAgendaJ(ArrayList<PessoaJuridica> agendaJ) {
        this.agendaJ = agendaJ;
    }

    public  void addPessoa(PessoaFisica pessoaF){
        agendaF.add(pessoaF);
    }
    
    public  void addPessoa(PessoaJuridica pessoaJ){
        agendaJ.add(pessoaJ);
    }
    
    public void listarFisicos(){
    for (PessoaFisica i : agendaF) {
        System.out.println(i);
        }
    }
    
    public void listarJuricos(){
    for (PessoaJuridica i : agendaJ) {
        System.out.println(i);
        } 
    }
    
    public String numeroPF(){
        return agendaF.size()+ " ";
    }
    
    public String numeroPJ(){
    return agendaJ.size()+ " ";
    }
}
