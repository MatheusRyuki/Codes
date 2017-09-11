/*The football federation hired you to organize the scoreboard of the tournament. 
You will receive a list with some past matches and you must sort the teams accordingly. 
A win grants 3 points, a draw 1 point and if the team lost it receives nothing.

Read carefully the regulation on how the scoreboard should be organized: First comes the team with more points. 
Then if there is a draw, the team with more wins should come first. 
If there is still a draw, the team with more goals should come first. 
At last, if none of the above sorting criterias is fulfilled, the team that comes first in the input should appear first.

Given the teams and the games, sort them and output the scoreboard. */

#include<iostream>
#include<string>
#include<stdio.h>

using namespace std;

struct partidasTimes{ //Creating struct to save matches information
  string nome;
  int pontos;
  int vitorias;
  int quantidadeGols;
};

struct partidasTimes partidas[1100];

int main(){

  string lerTimes, timeA, timeB;
  int A, B, C, golA, golB; //Declaring Variables

	cout<<"How many Tests"<<endl;	// How many times the process will repeat
  	cin >> A;
  	
  	for(int i=0;i<A;i++){
        	cout<<"how many teams are in the championship"<<endl; //Number of teams
		cin >> B;
	
		cout<<"how many matches were already played "<<endl; //Number of matches
		cin >> C;

    for (int j = 0; j < B; j++){
      cout<<"Team Name "<<(j+1)<<":"<<endl; //Putting team names
	  cin >> lerTimes;
      partidas[j].nome = lerTimes;
      partidas[j].pontos = 0;
      partidas[j].vitorias = 0;
      partidas[j].quantidadeGols = 0;
    }

    for (int h = 0; h < C; h++){
	cout<<"Match "<<h+1<<":"<<endl; //Enter the information for each game
      
      cout<<"First team"<<endl;
	  cin>> timeA; 
	  cout<<"Score of first team:"<<endl;
	  cin>> golA; 
	
      cout<<"Second team"<<endl;
	  cin>> timeB; 
	  cout<<"Score of second team:"<<endl;
	  cin>> golB; 
	  
      int vencedor;

      if (golA > golB) //Declaring the winner of the match
        vencedor = 1;
      else if (golB > golA)
        vencedor = 2;
      else
        vencedor = 0;

      for (int j = 0; j < B; j++){ //Placing points for team A if it is a winner
        if (timeA == partidas[j].nome){
          if(vencedor == 1){
            partidas[j].pontos += 3;
            partidas[j].vitorias += 1;   
          }
          else if(vencedor == 0)
            partidas[j].pontos += 1;

          partidas[j].quantidadeGols += golA; //Adding the goals to the team
        }

        if (timeB == partidas[j].nome){//Placing points for team B if it is a winner
          if(vencedor == 2){
            partidas[j].pontos += 3;
            partidas[j].vitorias += 1;   
          }
          else if(vencedor == 0)
            partidas[j].pontos += 1;

          partidas[j].quantidadeGols += golB; //Adding the goals to the team
        }
      }
    } 

    for (int j = 0; j < B; j++){ //Logic to create classification
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
	//Displaying the Overall Classification
	
	cout<<"Classification:"<<endl;
	
    for (int j = 0; j < B; j++){ 
        cout<<j+1<<"º "<<partidas[j].nome<<endl;
    }
  }   
  return 0;
}
