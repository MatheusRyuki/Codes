
public class Crescimento_demográfico {

public static void main (String [] args ){

    long popmundial=7507298440L;
    double taxadecresc=0.004,cresc;
            
    for (int i=1;i<76;i++)
    {
        cresc=popmundial*taxadecresc;
        System.out.println("Ano " + i + " População esperada: " + popmundial + " Aumento da população nesse ano: " + cresc);
        popmundial+=cresc;
        
        if(popmundial>(7507298440L*2))
        {
         System.out.println("É nesse ano que a população vai ter o dobro de hoje");
        }
        }
}
}
