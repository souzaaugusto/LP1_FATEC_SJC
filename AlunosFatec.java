package Teste3AlunosFatec;

public class AlunosFatec {
    //Atributos
    private String matricula;
    public String nome;
    public String curso;
    private int periodo_letivo;
    private String residencia;
    public String transporte;
    
    //Métodos personalizos
    public void ficha(){
        System.out.println("==============================================================");
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Matriculado no Curso: " + this.getCurso());
        System.out.println("Período Letivo Atual: " + this.getPeriodo_letivo()+ " semestre");
        
    }
     public void Modo_Transporte(String tran) {
        this.transporte = tran;
        System.out.println("Modo de Transporte para Faculdade: " +tran);
    }
    public void Cidade_Moradia(String city) {
        this.residencia = city;
        System.out.println("Cidade onde mora: " +city);
        System.out.println("==============================================================");
    }
    //Métodos especiais

    public AlunosFatec(String m) {
       this.matricula = m;
       System.out.println("Matriculado: "+m);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo_letivo() {
        return periodo_letivo;
    }

    public void setPeriodo_letivo(int periodo_letivo) {
        this.periodo_letivo = periodo_letivo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
}
