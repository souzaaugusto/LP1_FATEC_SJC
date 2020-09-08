package Teste4InstMusical;

public class InstMusical {
    //Atributos
    public String nome;
    public String tipo;
    private String familia;
    private String afinacao;
    private String genero;
    private float valor;
    
    //Métodos Personalizados
    public void ficha(){
        System.out.println("==============================================================");
        System.out.println("Nome do Instrumento: " + this.getNome());
        System.out.println("Tipo do instrumento: " + this.getTipo());
        System.out.println("Familia: " + this.getFamilia());
        System.out.println("Afinação padrão: " + this.getAfinacao());
        System.out.println("Valor: " + this.getValor()+" R$");
    }
    
    public void Afinar(String af){
       this.afinacao = af;
       System.out.println("Necessita de afinação: "+af);
    }
    
    public void Tocar(){
       System.out.println("Lá-Dó-Ré...Lá-Dó-Ré#-Ré...");
    }
    public void Manutencao(String man){
       this.tipo = man;
       System.out.println("Necessita de manutneção: "+ man);  
    }
    public void Harmonizar(String p){
        this.familia = p;
        System.out.println("Acompanhar o piano: "+ p); 
        System.out.println("==============================================================");
    }

    public InstMusical(String g) {
       this.genero = g;
       System.out.println("Genero Musical: "+g);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}


