import javax.swing.JOptionPane;
import java.util.Random;

public class AjudaMatemática {
    private static final Random NúmerosAleatórios = new Random ();
    
    public void Multiplicação()
    {
        int var1,var2,var3,resp,acertos=0,erros=0;
        double total,desem;
           for (int i=0;i<10;i++) {
            
            var1=1+NúmerosAleatórios.nextInt(20);
            var2=1+NúmerosAleatórios.nextInt(20);
            var3=var1*var2;
            
            resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " X " + var2 + "?"));
            
            if (resp==var3)
            {
                int var4=1+NúmerosAleatórios.nextInt(4);
                
                switch (var4) {
                    case 1:    
                JOptionPane.showMessageDialog(null,"Parabéns! Você acertou!");
                acertos++; 
                break;
                  case 2:    
                JOptionPane.showMessageDialog(null,"Excelente!");
                acertos++; 
                 break;
                  case 3:    
                JOptionPane.showMessageDialog(null,"Bom Trabalho!");
                acertos++;  
                break;
                  case 4:    
                JOptionPane.showMessageDialog(null,"Continue trabalhando assim!");
                 acertos++; 
                break;
                }
            }
            
            else
            do {
                 int var5=1+NúmerosAleatórios.nextInt(4);
                
                 switch(var5){
                     case 1:
                     JOptionPane.showMessageDialog(null,"Não. Por favor Tente Novamente!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " X " + var2 + "?"));
                     erros++;
                     break;
                     case 2:
                     JOptionPane.showMessageDialog(null,"Errado! Tente mais uma vez.");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " X " + var2 + "?"));
                      erros++;
                     break;
                     case 3:
                     JOptionPane.showMessageDialog(null,"Não desista!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " X " + var2 + "?"));
                      erros++;
                     break;
                     case 4:
                     JOptionPane.showMessageDialog(null,"Não! Continue Tentando!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " X " + var2 + "?"));
                      erros++;
                     break;
                 }
                 } while(resp!=var3);
           }
        total=acertos+erros;
        desem=(acertos/total)*100;
           
            if (desem<75) 
                JOptionPane.showMessageDialog(null, "Peça ajuda extra a seu professor! Seu desempenho foi: " + desem);
            else
                JOptionPane.showMessageDialog(null, "Parabéns! Você está pronto para avançar para o próximo nível! Seu desempenho foi: " + desem);
           }
    
     public void Adição()
    {
       
        int var1,var2,var3,resp,acertos=0,erros=0;
        double total,desem;
           for (int i=0;i<10;i++) {
               
            var1=1+NúmerosAleatórios.nextInt(20);
            var2=1+NúmerosAleatórios.nextInt(20);
            var3=var1+var2;
            
            resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " + " + var2 + "?"));
            
            if (resp==var3)
            {
                int var4=1+NúmerosAleatórios.nextInt(4);
                
                switch (var4) {
                    case 1:    
                JOptionPane.showMessageDialog(null,"Parabéns! Você acertou!");
                acertos++; 
                break;
                  case 2:    
                JOptionPane.showMessageDialog(null,"Excelente!");
                acertos++; 
                 break;
                  case 3:    
                JOptionPane.showMessageDialog(null,"Bom Trabalho!");
                acertos++;  
                break;
                  case 4:    
                JOptionPane.showMessageDialog(null,"Continue trabalhando assim!");
                 acertos++; 
                break;
                }
            }
            
            else
            do {
                 int var5=1+NúmerosAleatórios.nextInt(4);
                
                 switch(var5){
                     case 1:
                     JOptionPane.showMessageDialog(null,"Não. Por favor Tente Novamente!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " + " + var2 + "?"));
                     erros++;
                     break;
                     case 2:
                     JOptionPane.showMessageDialog(null,"Errado! Tente mais uma vez.");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " + " + var2 + "?"));
                      erros++;
                     break;
                     case 3:
                     JOptionPane.showMessageDialog(null,"Não desista!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " + " + var2 + "?"));
                      erros++;
                     break;
                     case 4:
                     JOptionPane.showMessageDialog(null,"Não! Continue Tentando!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " + " + var2 + "?"));
                      erros++;
                     break;
                 }
                 } while(resp!=var3);
           }
        total=acertos+erros;
        desem=(acertos/total)*100;
           
            if (desem<75) 
                JOptionPane.showMessageDialog(null, "Peça ajuda extra a seu professor! Seu desempenho foi: " + desem);
            else
                JOptionPane.showMessageDialog(null, "Parabéns! Você está pronto para avançar para o próximo nível! Seu desempenho foi: " + desem);
           }
    
     public void Divisão()
    {
        double var1,var2,var3,resp,acertos=0,erros=0,total,desem;
        
           for (int i=0;i<10;i++) {
            
            var1=1+NúmerosAleatórios.nextInt(20);
            var2=1+NúmerosAleatórios.nextInt(5);
            var3=var1/var2;
            
            resp=Double.parseDouble(JOptionPane.showInputDialog("Quanto é " + var1 + " / " + var2 + "?"));
            
            if (resp==var3)
            {
                int var4=1+NúmerosAleatórios.nextInt(4);
                
                switch (var4) {
                    case 1:    
                JOptionPane.showMessageDialog(null,"Parabéns! Você acertou!");
                acertos++; 
                break;
                  case 2:    
                JOptionPane.showMessageDialog(null,"Excelente!");
                acertos++; 
                 break;
                  case 3:    
                JOptionPane.showMessageDialog(null,"Bom Trabalho!");
                acertos++;  
                break;
                  case 4:    
                JOptionPane.showMessageDialog(null,"Continue trabalhando assim!");
                 acertos++; 
                break;
                }
            }
            
            else
            do {
                 int var5=1+NúmerosAleatórios.nextInt(4);
                
                 switch(var5){
                     case 1:
                     JOptionPane.showMessageDialog(null,"Não. Por favor Tente Novamente!");
                      resp=Double.parseDouble(JOptionPane.showInputDialog("Quanto é " + var1 + " / " + var2 + "?"));
                     erros++;
                     break;
                     case 2:
                     JOptionPane.showMessageDialog(null,"Errado! Tente mais uma vez.");
                     resp=Double.parseDouble(JOptionPane.showInputDialog("Quanto é " + var1 + " / " + var2 + "?"));
                      erros++;
                     break;
                     case 3:
                     JOptionPane.showMessageDialog(null,"Não desista!");
                      resp=Double.parseDouble(JOptionPane.showInputDialog("Quanto é " + var1 + " / " + var2 + "?"));
                      erros++;
                     break;
                     case 4:
                     JOptionPane.showMessageDialog(null,"Não! Continue Tentando!");
                      resp=Double.parseDouble(JOptionPane.showInputDialog("Quanto é " + var1 + " / " + var2 + "?"));
                      erros++;
                     break;
                 }
                 } while(resp!=var3);
           }
        total=acertos+erros;
        desem=(acertos/total)*100;
           
            if (desem<75) 
                JOptionPane.showMessageDialog(null, "Peça ajuda extra a seu professor! Seu desempenho foi: " + desem);
            else
                JOptionPane.showMessageDialog(null, "Parabéns! Você está pronto para avançar para o próximo nível! Seu desempenho foi: " + desem);
           }
    
        public void Subtração()
    {
       
        int var1,var2,var3,resp,acertos=0,erros=0;
        double total,desem;
           for (int i=0;i<10;i++) {
               
            var1=21+NúmerosAleatórios.nextInt(20);
            var2=1+NúmerosAleatórios.nextInt(20);
            var3=var1-var2;
            
            resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " - " + var2 + "?"));
            
            if (resp==var3)
            {
                int var4=1+NúmerosAleatórios.nextInt(4);
                
                switch (var4) {
                    case 1:    
                JOptionPane.showMessageDialog(null,"Parabéns! Você acertou!");
                acertos++; 
                break;
                  case 2:    
                JOptionPane.showMessageDialog(null,"Excelente!");
                acertos++; 
                 break;
                  case 3:    
                JOptionPane.showMessageDialog(null,"Bom Trabalho!");
                acertos++;  
                break;
                  case 4:    
                JOptionPane.showMessageDialog(null,"Continue trabalhando assim!");
                 acertos++; 
                break;
                }
            }
            
            else
            do {
                 int var5=1+NúmerosAleatórios.nextInt(4);
                
                 switch(var5){
                     case 1:
                     JOptionPane.showMessageDialog(null,"Não. Por favor Tente Novamente!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " - " + var2 + "?"));
                     erros++;
                     break;
                     case 2:
                     JOptionPane.showMessageDialog(null,"Errado! Tente mais uma vez.");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " - " + var2 + "?"));
                      erros++;
                     break;
                     case 3:
                     JOptionPane.showMessageDialog(null,"Não desista!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " - " + var2 + "?"));
                      erros++;
                     break;
                     case 4:
                     JOptionPane.showMessageDialog(null,"Não! Continue Tentando!");
                     resp=Integer.parseInt(JOptionPane.showInputDialog("Quanto é " + var1 + " - " + var2 + "?"));
                      erros++;
                     break;
                 }
                 } while(resp!=var3);
           }
        total=acertos+erros;
        desem=(acertos/total)*100;
           
            if (desem<75) 
                JOptionPane.showMessageDialog(null, "Peça ajuda extra a seu professor! Seu desempenho foi: " + desem);
            else
                JOptionPane.showMessageDialog(null, "Parabéns! Você está pronto para avançar para o próximo nível! Seu desempenho foi: " + desem);
           }
    
    public static void main (String []args)
    {
        int var1=Integer.parseInt(JOptionPane.showInputDialog("Escolha a Operação a trabalhar\n1-Adição\n2-Subtração\n3-Divisão\n4-Multiplicação"));
        AjudaMatemática programa= new AjudaMatemática ();
        
        switch (var1)
        {
            case 1:
                programa.Adição();
                break;
            case 2:
                programa.Subtração();
                break;
            case 3:
                programa.Divisão();
                break;
            case 4:
                programa.Multiplicação();
                break;
    }
}
}
