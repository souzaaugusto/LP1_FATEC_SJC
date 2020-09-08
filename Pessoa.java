package Teste2Pessoa;

public class Pessoa {
    //Atributos
    private char sexo;
    private float altura;
    private float massa;
    private String nome;
    public String continente;  
    
   //Métodos personalizados
    public void ficha() {
        System.out.println("==============================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getContinente());
        System.out.println("Altura: " + this.getAltura() + "cm");
        System.out.println("Massa: " + this.getMassa() + "kg");
    }
    public void falar(String oque){
        System.out.println("Frase:  " + oque);
    }
    public void beber(String oque){
        System.out.println("Bebida favorita:  " + oque);
    }
    //Metodos especiais
    public Pessoa(String n,char sexo)//Constructor
    {
    	nome=n;
    	this.sexo=sexo;
    }
    public char getSexo() {
	return sexo;
    }
    public void setSexo(char sexo) {
	this.sexo = sexo;
    }
    public float getAltura() {
	return altura;
    }
    public void setAltura(float altura) {
	this.altura = altura;
    }
    public float getMassa() {
	return massa;
    }
    public void setMassa(float massa) {
	this.massa = massa;
    }
    public String getNome() {
	return nome;
    }
    public void setNome(String nome) {
	this.nome = nome;
    }
    public String getContinente() {
	return continente;
    }
    public void setContinente(String continente) {
	this.continente = continente;
    }
}