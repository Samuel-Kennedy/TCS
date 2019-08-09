package executar;


public class Caminhao extends Veiculo {
    public String cor = "vermelha";
    public String modelo = "Ford";
    public int ano = 1995;
    
    public void Status(){
            
            System.out.println("Cor: " + this.cor );
            System.out.println("Modelo: " + this.modelo);            
            System.out.println("Preço da Gasolina: " + this.preco + " Reais" );             
            System.out.println("Ano: " + this.ano);
            System.out.println("O tanque está em: " + this.gasosa);            
        }
}
