package Teste2Pessoa;
public class Teste2Pessoa {

    public static void main(String[] args) {	
        Pessoa C = new Pessoa("Carlos",'M');
        
        C.setNome("Carlos");
        C.setContinente("Sul-Americano");
        C.setAltura(175);
        C.setMassa(70);
        C.ficha();
	C.falar("Olá Mundo!");
        C.beber("Heineken");
        
        //Nova pessoa criada
        Pessoa K = new Pessoa("Kurt",'M');
        
        K.setNome("Kurt");
        K.setContinente("Anglo-Saxônico");
        K.setAltura(190);
        K.setMassa(85);
        K.ficha();
	K.falar("Hello World!");
        K.beber("Malbec Wine");
	} 
}
