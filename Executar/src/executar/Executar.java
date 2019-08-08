package executar;
import java.io.Console;
import java.util.Scanner;

public class Executar {

    
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao();
        Carro c2 = new Carro();
        Moto c3 = new Moto();
                     
        int recebe = 100 ;
        int recebe1 = 0;
        int recebe2 = 0;
        int recebe3 = 0;
        while(recebe != 0){
        System.out.println("                       ### Sistema De Veiculos ##");
        System.out.println ("                         ===================");
        System.out.println("                          1 - Caminhão");
        System.out.println("                          2 - Carro");
        System.out.println("                          3 - Moto");
        System.out.println("                          0 - Feche o sistema");
        Scanner sc = new Scanner(System.in);
        recebe = sc.nextInt();  
        switch(recebe){            
        case 1:  
            while(recebe1 != 10){
            System.out.println("Você escolheu o caminhão, o que deseja fazer com ele? ");
                    System.out.println("                          4 - Ligar");
                    System.out.println("                          5 - Abastecer");
                    System.out.println("                          6 - Acelerar");
                    System.out.println("                          7 - Roda");
                    System.out.println("                          8 - Desligar");
                    System.out.println("                          9 - Status");
                    System.out.println("                          10 - Volte ao menu principal");
                    Scanner sp = new Scanner(System.in);
                    recebe1 = sp.nextInt();
            
            
                    
                    if(recebe1 == 4){
                        c1.Ligar();                                        
                    }
                    else if(recebe1 == 5){
                        c1.Abastecer();
                    }
                    else if(recebe1 == 6){
                        c1.Acelerar();
                    }
                    else if(recebe1 == 7){
                        c1.Roda();
                    }
                    else if(recebe1 == 8){
                        c1.Desligar();
                    }
                    else if(recebe1 == 9){
                        c1.Status();
                    }
                    else if(recebe1 == 10){
                        break;
                    }
                }
        break;            
        case 2:
            while(recebe2 != 10){
            System.out.println("Você escolheu o carro, o que deseja fazer com ele? ");
                    System.out.println("                          4 - Ligar");
                    System.out.println("                          5 - Abastecer");
                    System.out.println("                          6 - Acelerar");
                    System.out.println("                          7 - Roda");
                    System.out.println("                          8 - Desligar");
                    System.out.println("                          9 - Status");
                    System.out.println("                          10 - Volte ao menu principal");
                    Scanner scc = new Scanner(System.in);
                    recebe2 = scc.nextInt();
                    
                    if(recebe2 == 4){
                        c2.Ligar();                                        
                    }
                    else if(recebe2 == 5){
                        c2.Abastecer();
                    }
                    else if(recebe2 == 6){
                        c2.Acelerar();
                    }
                    else if(recebe2 == 7){
                        c2.Roda();
                    }
                    else if(recebe2 == 8){
                        c2.Desligar();
                    }
                    else if(recebe2 == 9){
                        c2.Status();
                    }
                    else if(recebe2 == 10){
                        break;
                    }
                }
           break;
        case 3:
            while(recebe3 != 10){
            System.out.println("Você escolheu a moto, o que deseja fazer com ela? ");
                    System.out.println("                          4 - Ligar");
                    System.out.println("                          5 - Abastecer");
                    System.out.println("                          6 - Acelerar");
                    System.out.println("                          7 - Roda");
                    System.out.println("                          8 - Desligar");
                    System.out.println("                          9 - Status");
                    System.out.println("                          10 - Volte ao menu principal");
                    Scanner sl = new Scanner(System.in);
                    recebe3 = sl.nextInt();
                    
                    if(recebe3 == 4){
                        c3.Ligar();                                        
                    }
                    else if(recebe3 == 5){
                        c3.Abastecer();
                    }
                    else if(recebe3 == 6){
                        c3.Acelerar();
                    }
                    else if(recebe3 == 7){
                        c3.Roda();
                    }
                    else if(recebe3 == 8){
                        c3.Desligar();
                    }
                    else if(recebe3 == 9){
                        c3.Status();
                    }
                    else if(recebe3 == 10){
                        break;
                    }
                }
        break;
        default:  
            break;                 
        } 
        }
    }
}