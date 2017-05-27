import javax.swing.JOptionPane;
public class Codigos {  

    public static void main (String [] args){
       int Codigo,i=0,digito;
       String corrente="";
        int vetor[];
        vetor = new int[4];
        int aux[]; 
        aux = new int[4];
        
       Codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser criptografado"));
 
while (Codigo > 0) {
    digito=Codigo % 10;
    vetor[i]=((digito+7)%10);
    JOptionPane.showMessageDialog(null, vetor[i]);
    aux[i]=vetor[i];
    i++; 
    Codigo = Codigo / 10;
}


vetor[0]=aux[2];
vetor[1]=aux[3];
vetor[2]=aux[0];
vetor[3]=aux[1];   

for (int y=0;y<4;y++)
{
    corrente+=vetor[y];
}
    JOptionPane.showMessageDialog(null,"Seu código criptografado é esse: " + corrente);


    
}
}
