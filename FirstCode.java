import javax.swing.JOptionPane;
class Strings {
public static void main (String []args)
{
    double freque,var1,var2,var3,altura,peso,IMC;
    String sexo,idade,nome;
    JOptionPane.showMessageDialog(null, "Registros Médicos");
    nome=JOptionPane.showInputDialog("Qual é seu nome completo?");
    sexo=JOptionPane.showInputDialog("Qual é seu sexo?");
    var1=Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?"));
    altura=Double.parseDouble(JOptionPane.showInputDialog("Qual é sua altura?"));
    peso=Double.parseDouble(JOptionPane.showInputDialog("Qual é sua massa?"));
    freque=220-var1;
    var2=freque*0.85;
    var3=freque*0.5;
    IMC=peso/(altura*altura);
    
    JOptionPane.showMessageDialog(null,"Paciente " + nome);
    JOptionPane.showMessageDialog(null,"Sexo: " + sexo + "\n" + "Idade: " + var1 + "\n" + "Altura: " + altura + "\n" + "Massa: " + peso);
    JOptionPane.showMessageDialog(null, "Frequência cardíaca máxima por minuto: " + freque);
    JOptionPane.showMessageDialog(null, "Frequência cardíaca estável é de " + var3 + "-" + var2 + " Batimentos por segundos");
    JOptionPane.showMessageDialog(null, "Valor do IMC: " + IMC);
    JOptionPane.showMessageDialog(null, "Tabela do IMC: " + "\n" + "Abaixo do peso: abaixo de 18.5" + "\n" + "Normal: entre 18.5 e 24.9" + "\n" + "Sobre-peso: entre 25 e 29.9" + "\n" + "Obeso: acima de 30");
    
    if(IMC<18.5)
        JOptionPane.showMessageDialog(null,"Paciente está abaixo do peso");
    else if (IMC<25)
        JOptionPane.showMessageDialog(null,"Paciente está normal");
    else if (IMC<30)
        JOptionPane.showMessageDialog(null,"Paciente está sobre-peso");
    else
        JOptionPane.showMessageDialog(null,"Paciente está obeso");
    
    
}
    }   

