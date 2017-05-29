    import javax.swing.JOptionPane;

    public class Aquecimento_Global {
     public static void main (String []args) {
         int resp1,resp2,resp3,resp4,resp5,acertos=0, erros=0;

         JOptionPane.showMessageDialog(null, "5 perguntas sobre Aquecimento global");
         JOptionPane.showMessageDialog(null, "Digite o número para a alternativa que achar correta, qualquer número inválido será considerado erro");

    //Primeira Pergunta
         JOptionPane.showMessageDialog(null, "Uma das medidas internacionais de combate ao aquecimento global mais divulgadas pela imprensa em todo o mundo foi o Protocolo de Kyoto, que teve como objetivo principal:");
          resp1=Integer.parseInt(JOptionPane.showInputDialog("1-Proliferar ações de aumento da vegetação existente no planeta." + "\n" + "2-Diminuir as emissões de gases poluentes na atmosfera." + "\n" + "3-Pressionar os países desenvolvidos a contribuir menos com a elevação das temperaturas."  + "\n" + "4-Conservar as algas marinhas, responsáveis pela disponibilidade do oxigênio na atmosfera."));
    //Verificação da resposta
         switch (resp1){
             case 1:
                 erros++;
                 break;
             case 2:
                 acertos++;
                 break;
             case 3:
                 erros++;
                 break;
             case 4:
                 erros++;
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Alternativa inválida");
                 erros++;
         }

         //Segunda Pergunta
         JOptionPane.showMessageDialog(null, "Suponha que, ao invés de aquecimento, o planeta sofresse uma queda de temperatura, resfriando-se \n" +
    "como numa era glacial, nesse caso");
         resp2=Integer.parseInt(JOptionPane.showInputDialog("1- a camada de geleiras, bem como o nível do mar, diminuiriam" + "\n" + "2-as geleiras aumentariam, acarretando alterações no relevo do continente e no nível do mar" + "\n" + "3- o equilíbrio do clima do planeta seria restabelecido, uma vez que ele está em processo de aquecimento" + "\n" + "4-) a fauna e a flora das regiões próximas ao círculo polar ártico e antártico nada sofreriam com a\n" +
    "glaciação."));
         //Verificação da resposta
          switch (resp2){
             case 1:
                 erros++;
                 break;
             case 2:
                 acertos++;
                 break;
             case 3:
                 erros++;
                 break;
             case 4:
                 erros++;
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Alternativa inválida");
                 erros++;
         }

          //Terceira Pergunta
          JOptionPane.showMessageDialog(null, "Entre os elementos que possivelmente estão relacionados com o aquecimento global, podemos EXCLUIR:");
          resp3=Integer.parseInt(JOptionPane.showInputDialog("1- Emissão de gases poluentes na atmosfera" + "\n" + "2-Efeito Estufa" + "\n" + "3-Diminuição das coberturas vegetais" + "\n" + "4-Inversão térmica"));
          //Verifcação da Resposta
          switch (resp3){
             case 1:
                 erros++;
                 break;
             case 2:
                 erros++;
                 break;
             case 3:
                 erros++;
                 break;
             case 4:
                 acertos++;
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Alternativa inválida");
                 erros++;
        }

         //Quarta Pergunta
         JOptionPane.showMessageDialog(null,"Nos últimos anos, um dos temas ambientais de maior destaque está no debate sobre o aquecimento do planeta Terra e nas mudanças climáticas globais. Analise as afirmativas abaixo e assinale a alternativa INCORRETA.");
         resp4=Integer.parseInt(JOptionPane.showInputDialog("1-Além dos fatores internos ao planeta, com destaque para as consequências das ações humanas, fatores externos, como as explosões solares, influenciam no aumento da temperatura da Terra.\n" + "\n" + "2-Existem pesquisadores que discordam da teoria de que estamos vivendo uma mudança climática em virtude da ação antrópica,\n"+ "pois consideram que houve outros períodos de aquecimento e de resfriamento do planeta antes da existência do homem e de sua interferência na Terra.\n" + "\n" + "3-Além das florestas, os oceanos são fundamentais na regulação do clima no planeta, pois as plantas aquáticas são responsáveis pela absorção de CO2 da atmosfera.\n"+ "No entanto, a degradação ambiental de origem antrópica nos oceanos vem sendo intensa, reduzindo a vida marinha.\n" + "\n" + "4-Os relatórios do IPCC, composto por um grupo de pesquisadores que vem analisando o impacto das ações antrópicas sobre o clima, constituem-se na principal fonte de informações sobre o aquecimento global.\n"+"O IPCC trabalha com projeções de cenários futuros e tais projeções vêm sendo consideradas exatas e acertadas por toda a comunidade científica."));
         //Verificação da resposta
          switch (resp4){
             case 1:
                 erros++;
                 break;
             case 2:
                 erros++;
                 break;
             case 3:
                 erros++;
                 break;
             case 4:
                 acertos++;
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Alternativa inválida");
                 erros++;
        }

          //Quinta Pergunta
          JOptionPane.showMessageDialog(null,"O forte aumento dos ventos alísios das Américas em direção ao oeste do Pacífico, na região do Equador, fortaleceu o movimento das águas oceânicas, de acordo com pesquisa feita por cientistas australianos.\n" + "Se os ventos sopram com vigor particular, a água quente que se acumula começa a convergir para o interior do mar”, explica Matthew England.\n" +
    "“De certa maneira, isto contém na superfície do oceano a energia que desprende o gás de efeito estufa e o que provocou o hiato (no processo de aquecimento climático)”, completou. \n" + "Esta pausa no aquecimento da temperatura na superfície não significa que o aquecimento global parou”, destacou o cientista.\n" +
    "(G1 Natureza, 10/02/2014. Disponível em: G1.globo)\n" +
    "Com base nas informações acima apresentadas, podemos concluir que o Aquecimento Global:");
          resp5=Integer.parseInt(JOptionPane.showInputDialog("1-Está relacionado com o aquecimento atmosférico." + "\n" + "2-Ocorre pela ausência dos ventos alísios." + "\n" + "3-Integra fenômenos atmosféricos e hidrosféricos." + "\n" + "4-Não é causado pelo ser humano, apenas pela natureza."));
          //Verificação da Resposta
           switch (resp5){
             case 1:
                 erros++;
                 break;
             case 2:
                 erros++;
                 break;
             case 3:
                 acertos++;
                 break;
             case 4:
                 erros++;
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Alternativa inválida");
                 erros++;

           }

           //Demonstração de Resultados
           if(acertos==5) {
               JOptionPane.showMessageDialog(null,"Parabéns! Você acertou Todas! Excelente!");
           }
           else if (acertos==4) {
                JOptionPane.showMessageDialog(null,"Muito bem! Você acertou quatro");
           }
           else {
                JOptionPane.showMessageDialog(null,"Que pena, você acertou três ou menos, hora de melhorar os conhecimentos sobre aquecimento global!");
           }

           //Mostrar as referências
            JOptionPane.showMessageDialog(null,"Sites de onde foram tirados as questões: " + "\n" + "http://exercicios.mundoeducacao.bol.uol.com.br/exercicios-geografia/exercicios-sobre-aquecimento-global.htm#resposta-357" + "\n" + "www.aulasniap.com.br/static/media/exercicios/aquecimentoglovaleefeitoestufa.pdf");
     }  
    }
