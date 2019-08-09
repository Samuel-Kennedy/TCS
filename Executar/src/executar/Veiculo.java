package executar;
import java.util.Scanner;

public abstract class Veiculo implements InterfaceZinha{    
    protected float preco = 4;
    protected int abastecer; 
    protected boolean motor;        
    protected boolean rodas = false;
    
    @Override
    public void Abastecer(){               
        if(this.motor == true){
            System.out.println("Desligue o seu veiculo para abastecer");
        }
        else if(abastecer >= 50){
            System.out.println("O tanque está cheio");
        }
        else{
            this.abastecer +=  10;
            System.out.println("O tanque foi abastecido com " + abastecer + " Reais");         
        }
    }
    @Override
    public void Acelerar(){
        if(this.motor == true && this.abastecer > 0){
           this.abastecer -= 10;            
            System.out.println("Você acelerou, sua gasolina está em " + this.abastecer);
        }
        else{
            System.out.println("O MOTOR ESTÁ DESLIGADO!!!!!!!!! OU VOCÊ ESTÁ SEM GASOLINA!!!");
        }
    }
    
    @Override
    public void Roda(){
        if(rodas == true){
            System.out.println("O PNEU ESTÁ FURADO!!!!!");
        }
        else{
            System.out.println("O seu pneu está ótimo");
        }
    }
    
    @Override
    public void Ligar(){       
        this.motor = true;
        if(this.motor == true){
            System.out.println("O motor está ligado");
        }
        else{
            System.out.println("O motor está desligado");
        }
        
        }
    @Override
    public void Desligar(){
        this.motor = false;
        if(this.motor == false){
            System.out.println("O motor está desligado");
        }
        else{
            System.out.println("O motor está ligado");
        }
    }
    
}
