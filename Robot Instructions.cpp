/*
Você possui um robô na origem do eixo x. O robô receberá algumas instruções. 
Sua tarefa é predizer sua posição depois de executar todas as instruções.

LEFT: move uma unidade para a esquerda (diminui p em 1, onde p é a posição do robô antes de mover)
RIGHT: move uma unidade para a direita (incrementa p em 1)
STOP: Stay in the same place

Entrada

A primeira linha contém o número de casos de testes T (T <= 100). Cada caso de teste inicia com um inteiro N ( 1 <= n <= 100), o número de instruções. 
Cada uma das n linhas seguintes contém uma instrução.

Saída

Para cada caso de teste, imprima a posição final do robô. 
Note que após processar cada caso de teste, o robô deve ter sua posição inicial resetada para a origem.
*/

#include <iostream>
using namespace std;

class Robot { // creating the class for the robot	
	public:
		int Tests(int x);
		int Instruction(int o);
		int Question(int m,int n);
};

int Robot::Tests(int x){ // Know how many tests will be done
	cout<<"Number of tests"<<endl;
	cin>>x;
	return x;
};

int Robot::Instruction(int o){ // Know how many statements will be made per test
	cout<<"Number of instructions"<<endl;
	cin>>o;
	return o;
};

int Robot::Question(int m,int n){ // Put the instruction
	
	string answer;
	
	for (int z=0;z<m;z++) { // Verification of posted instruction
	
	cout<<"Enter the instruction"<<endl;
	cin>>answer; 
	
	if(answer=="LEFT") 
		n--;
	
	else if(answer=="RIGHT") 
		n++;
	
	else if(answer=="STOP")
		cout<<"The robot did not move."<<endl;
}
	
	return n;
	
}


int main () {
	int T,N,P; // declaring the variables
	
Robot r1;
T=r1.Tests(T);	
N=r1.Instruction(N);
//Program Procedures

for(int x=0;x<T;x++){
	
	P=r1.Question(N,P);
	cout<<"The robot is in position "<<P<<endl; // Saying the position of the robot
	P=0; // Returning to the starting position after each test
}

	return 0;
}
