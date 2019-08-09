package executar;

public class Carro extends Veiculo {
    public String cor = "Azul";
    public String modelo = "Astra";
    public int ano = 2013;
    
    public void Status(){
            
            System.out.println("Cor: " + this.cor );
            System.out.println("Modelo: " + this.modelo);            
            System.out.println("Preço: " + this.preco);             
            System.out.println("Ano: " + this.ano);
            System.out.println("O tanque está em: " + this.abastecer);            
        }
}
