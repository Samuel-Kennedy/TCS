package executar;

public class Moto extends Veiculo {
    public String cor = "Preto";
    public String modelo = "Suzuki";
    public int ano = 2015;
    
    public void Status(){
            
            System.out.println("Cor: " + this.cor );
            System.out.println("Modelo: " + this.modelo);            
            System.out.println("Preço: " + this.preco);             
            System.out.println("Ano: " + this.ano);            
            System.out.println("O tanque está em: " + this.abastecer);            
        }                       
    }
