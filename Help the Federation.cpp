#include<iostream>
#include<string>
#include<stdio.h>

using namespace std;

struct partidasTimes{
  string nome;
  int pontos;
  int vitorias;
  int quantidadeGols;
};

struct partidasTimes partidas[1100];

int main(){

  string lerTimes, timeA, timeB;
  int A, B, C, golA, golB;

	cout<<"How many Tests"<<endl;	
  	cin >> A;
  	
  	for(int i=0;i<A;i++){
    cout<<"how many teams are in the championship"<<endl;
	cin >> B;
	
	cout<<"how many matches were already played "<<endl;
	cin >> C;

    for (int j = 0; j < B; j++){
      cout<<"Team Name "<<(j+1)<<":"<<endl;
	  cin >> lerTimes;
      partidas[j].nome = lerTimes;
      partidas[j].pontos = 0;
      partidas[j].vitorias = 0;
      partidas[j].quantidadeGols = 0;
    }

    for (int h = 0; h < C; h++){
	cout<<"Match "<<h+1<<":"<<endl; 
      
      cout<<"First team"<<endl;
	  cin>> timeA; 
	  cout<<"Score of first team:"<<endl;
	  cin>> golA; 
	
      cout<<"Second team"<<endl;
	  cin>> timeB; 
	  cout<<"Score of second team:"<<endl;
	  cin>> golB; 
	  
      int vencedor;

      if (golA > golB)
        vencedor = 1;
      else if (golB > golA)
        vencedor = 2;
      else
        vencedor = 0;

      for (int j = 0; j < B; j++){
        if (timeA == partidas[j].nome){
          if(vencedor == 1){
            partidas[j].pontos += 3;
            partidas[j].vitorias += 1;   
          }
          else if(vencedor == 0)
            partidas[j].pontos += 1;

          partidas[j].quantidadeGols += golA;
        }

        if (timeB == partidas[j].nome){
          if(vencedor == 2){
            partidas[j].pontos += 3;
            partidas[j].vitorias += 1;   
          }
          else if(vencedor == 0)
            partidas[j].pontos += 1;

          partidas[j].quantidadeGols += golB;
        }
      }
    } 

    for (int j = 0; j < B; j++){
        for (int l = j+1; l < B; l++){
            if (partidas[j].pontos < partidas[l].pontos)
                swap(partidas[j], partidas[l]); 

            else if(partidas[j].pontos == partidas[l].pontos){
                if(partidas[j].vitorias < partidas[l].vitorias)
                    swap(partidas[j], partidas[l]);

                else if(partidas[j].vitorias == partidas[l].vitorias)
                    if(partidas[j].quantidadeGols < partidas[l].quantidadeGols)
                        swap(partidas[j], partidas[l]);
            }
        }
    }

	cout<<"Classification:"<<endl;
	
    for (int j = 0; j < B; j++){
        cout<<j+1<<"º "<<partidas[j].nome<<endl;
    }
  }   
  return 0;
}
