package executar;
import java.util.Scanner;

public abstract class Veiculo{    
    protected float preco = 4;
    protected int abastecer; 
    protected int acelerar;
    protected boolean motor;        
    protected int resultado;
    protected int gasosa;
    protected boolean rodas = false;
    
    void Abastecer(){
        this.abastecer = abastecer + 10;                
        if(this.motor == true){
            System.out.println("Desligue o seu carro para abastecer");
        }
        if(abastecer >= 50){
            System.out.println("O tanque está cheio");
        }
        else{
        System.out.println("O tanque foi abastecido com " + abastecer + " Reais");
        gasosa = abastecer;
        }
    }
    void Acelerar(){
        if(this.motor == true &&this. abastecer > 0){
            this.acelerar = acelerar + 10;
            this.resultado = this.abastecer - this.acelerar;            
            System.out.println("Você acelerou, sua gasolina está em " + this.resultado);
        }
        else{
            System.out.println("O MOTOR ESTÁ DESLIGADO!!!!!!!!! OU VOCÊ ESTÁ SEM GASOLINA!!!");
        }
    }
    
    void Roda(){
        if(rodas == true){
            System.out.println("O PNEU ESTÁ FURADO!!!!!");
        }
        else{
            System.out.println("O seu pneu está ótimo");
        }
    }
    
    void Ligar(){       
        this.motor = true;
        if(this.motor == true){
            System.out.println("O motor está ligado");
        }
        else{
            System.out.println("O motor está desligado");
        }
        
        }
    void Desligar(){
        this.motor = false;
        if(this.motor == false){
            System.out.println("O motor está desligado");
        }
        else{
            System.out.println("O motor está ligado");
        }
    }
}
