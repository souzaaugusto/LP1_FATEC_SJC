package Teste1Lugar;
public class Teste1Lugar {
     public static void main(String[] args) {	
       Lugar destino1 = new Lugar("Cairo");
        
        destino1.falar("Esse é o lugar onde quero conhecer");
        
        destino1.setLocal("Cairo");
        destino1.setCountry("Egito");
        destino1.setClimate("calor");
        destino1.isExpensive();
        destino1.ficha();
        destino1.Politics("Democracia");
        
        
        //Nova destino criado
       Lugar destino2 = new Lugar("Jerusalem");
        
        destino2.falar("Esse é um outro luhar onde quero conhecer");
        
        destino2.setLocal("Jerusalem");
        destino2.setCountry("Israel");
        destino2.setClimate("calor");
        destino2.isExpensive();
        destino2.ficha();
        destino2.Politics("Democracia");
     }   
}