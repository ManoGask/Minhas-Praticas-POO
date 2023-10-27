package Atividade6;
import java.util.ArrayList;
public class Empresa {
    private String cnpj;
    private String nome;
ArrayList<Pessoa> funcionarios = new ArrayList<>();
public void adicionarFuncionarios(Pessoa func) {
    funcionarios.add(func);
}
public String mostraFuncionario(){
    String resultado="";
    for(Pessoa contato: funcionarios){
        resultado = resultado + contato.getNome()+",";
    }
    return resultado;
}
   public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
