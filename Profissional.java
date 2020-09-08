package Teste5Profissional;

public class Profissional {
     //Atributos
    public String ativo;
    public String nome;
    private String area;
    private String funcao;
    private String tipo_contrato;
    private float salario;
    
    //Métodos Personalizados
    public void ficha(){
        System.out.println("==============================================================");
        System.out.println("Profissão: " + this.getNome());
        System.out.println("Área de Atuação: " + this.getArea());
        System.out.println("Função na corporação: " + this.getFuncao());
        System.out.println("Tipo de Contrato: " + this.getTipo_contrato());
        System.out.println("Salário: " + this.getSalario()+" R$");
        
    }
    public void Trabalhar(String tr){
        System.out.println("Trabalhando: " +tr);
    }
    
    public void Descansar(String ds){
        System.out.println("Fim do período de Trabalho: " +ds);
        
    }
    public void Ferias(int fe){
        System.out.println("Dias para iniciar férias: " + fe + " dias");
        System.out.println("==============================================================");
    }
    
    //Métodos Especiais

    public Profissional(String at) {
        this.ativo = at;
        System.out.println("Trabalha atualmente?: " + at);
    }

    public String getAtivo() {
       return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
