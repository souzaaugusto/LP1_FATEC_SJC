package Teste1Lugar;

public class Lugar {
     //Atributos
    private String country;
    private String local;
    private String climate;
    private String politics;
    public boolean expensive;
    
    //Métodos personalizados
    public void ficha(){
        System.out.println("================================================");
        System.out.println("Local: " + this.getLocal());
        System.out.println("País: " + this.getCountry());
        System.out.println("Clima: " + this.getClimate());
        System.out.println("Lugar caro?: " + this.isExpensive());
    }
    
     public String getPolitics() {
        return politics;
    }

    public void Politics(String politics) {
        this.politics = politics;
        System.out.println("Política: " + politics);
    }

    public boolean isExpensive() {
        return true;
        
    }
    public void setExpensive(boolean expensive) {
        this.expensive = expensive; 
    }
    
    public void falar(String oque){
        System.out.println("Frase:  " + oque);
    }
    
    //Metodos especiais
    public Lugar(String l) {
        local = l;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }
}
