package Teste5Profissional;

public class Teste5Profissional {

    public static void main(String[] args) {
        Profissional prof1 = new Profissional("sim");
           prof1.setNome("Engenheiro");
           prof1.setArea("Hardware e Software");
           prof1.setFuncao("Pesquisador");
           prof1.setTipo_contrato("público");
           prof1.setSalario(20000);
           prof1.ficha();
           prof1.Trabalhar("Sim");
           prof1.Descansar("Não");
           prof1.Ferias(15);
           
           //Nova Profissão
            Profissional prof2 = new Profissional("sim");
           prof2.setNome("Matemático");
           prof2.setArea("Mecânica Quântica");
           prof2.setFuncao("Acadêmico");
           prof2.setTipo_contrato("público");
           prof1.setSalario(10000);
           prof1.ficha();
           prof1.Trabalhar("Não");
           prof1.Descansar("Sim");
           prof1.Ferias(21);
           
    }
    
}
