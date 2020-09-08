package Teste6Calcado;


public class Teste6Calcado {

    public static void main(String[] args) {
       Calcados cl1 = new Calcados(true);
       cl1.setTipo("Tênis");
       cl1.setMaterial("Borracha e Linha");
       cl1.setCor("Preto");
       cl1.setOcasiao("Esportivo");
       cl1.setCusto(200);
       cl1.ficha();
       
       cl1.Calcar("ok");
       cl1.Engraxar("não");
       cl1.Amarrar("ok");
       
       
       //Novo Calçado
       Calcados cl2 = new Calcados(true);
       cl2.setTipo("Sapato");
       cl2.setMaterial("Couro");
       cl2.setCor("Marrom");
       cl2.setOcasiao("Trabalho");
       cl2.setCusto(280);
       cl2.ficha();
       
       cl2.Calcar("ok");
       cl2.Engraxar("sim");
       cl2.Amarrar("não");
       
    }
    
}
