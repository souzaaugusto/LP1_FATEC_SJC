package Teste4InstMusical;

public class Teste4InstMusical {

    public static void main(String[] args) {
        InstMusical inst1 = new InstMusical("clássica");
        inst1.setNome("Clarineta");
        inst1.setTipo("Sopro");
        inst1.setFamilia("Madeira");
        inst1.setAfinacao("Sib");
        inst1.setValor(2000);
        inst1.ficha();
        
        inst1.Afinar("Não");
        inst1.Manutencao("Não");
        inst1.Harmonizar("Sim");
        
        //Novo Instrumento
        InstMusical inst2 = new InstMusical("jazz");
        inst2.setNome("Saxophone Alto");
        inst2.setTipo("Sopro");
        inst2.setFamilia("Metal");
        inst2.setAfinacao("Mib");
        inst2.setValor(4000);
        inst2.ficha();
        
        inst2.Afinar("Não");
        inst2.Manutencao("Sim");
        inst2.Harmonizar("Sim");
    }  
}
