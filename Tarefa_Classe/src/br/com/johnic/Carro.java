package br.com.johnic;

public class Carro {

	private String modeloCarro;
    private String cor;
    private String fabricante;
    private int anoFabricaco;
    
    public void setModelo (String modeloCarro){
        this.modeloCarro = modeloCarro;
    }

    public String getModelo (){
        return modeloCarro;
    }
    
    
   
    public void setCor (String cor){
        this.cor = cor;
    }

    public String getCor (){
        return cor;
    }

    
    public void setFabricante (String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante (){
        return fabricante;
    }
    
    
    public void setAnoFabricacao (int anoFabricaco){
        this.anoFabricaco = anoFabricaco;
    }

    public int getAnoFabricacao (){
        return anoFabricaco;
    }
    
    public String acelerarCarro() {
    	String acelerar = "Acelerando ... vrum vrum vrumm";
    	return acelerar;
    }
    
    public void dadosVeiculo(String modelo, String cor, String fabricante, int anoFabricacao) {
    	setModelo(modelo);
    	setCor(cor);
    	setFabricante(fabricante);
    	setAnoFabricacao(anoFabricacao);
    }
    
    
    public static void main(String args[]) {
    	
    	Carro novoCarro = new Carro();
    	novoCarro.setModelo("Prisma");
    	novoCarro.setCor("Black");
    	novoCarro.setFabricante("GM");
    	novoCarro.setAnoFabricacao(2015);
    	System.out.println(novoCarro.getModelo());
    	System.out.println(novoCarro.getCor());
    	System.out.println(novoCarro.getFabricante());
    	System.out.println(novoCarro.getAnoFabricacao());
    	System.out.println(novoCarro.acelerarCarro());
    	System.out.println("");
    	System.out.println("Alterando dados______:");
    	System.out.println("");
    	novoCarro.dadosVeiculo("Gol", "blue", "VW", 2000);
    	
    	System.out.println(novoCarro.getModelo());
    	System.out.println(novoCarro.getCor());
    	System.out.println(novoCarro.getFabricante());
    	System.out.println(novoCarro.getAnoFabricacao());
    	
    }
    

}




