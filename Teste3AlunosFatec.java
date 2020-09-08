package Teste3AlunosFatec;

public class Teste3AlunosFatec {

    public static void main(String[] args) {
        AlunosFatec aluno1 = new AlunosFatec("sim");
        aluno1.setNome("Carlos");
        aluno1.setCurso("Banco de Dados");
        aluno1.setPeriodo_letivo(2);
        aluno1.ficha();
        aluno1.Modo_Transporte("motocicleta");
        aluno1.Cidade_Moradia("SJC");
        
        //Novo Aluno
        AlunosFatec aluno2 = new AlunosFatec("sim");
        aluno2.setNome("Kurt");
        aluno2.setCurso("Análise e Desenvolvimento de Sistemas");
        aluno2.setPeriodo_letivo(4);
        aluno2.ficha();
        aluno2.Modo_Transporte("carro");
        aluno2.Cidade_Moradia("SJC");
        
    }
    
}
