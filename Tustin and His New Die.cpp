/*
Tustin, Nike, Jucas and Uill will play a famous RPG game, the T & T (Tatus and Taturanas). Like any good RPG game, the dice is an extremely important part.

T & T is played with six-sided dice. Before they started the game, Tustin went to a store to buy a lucky die, because his old one was devoured by the Temogorgon.

Tustin is very selective, and he want to choose a classic dice.
A classic dice is a six-sided dice that has all the numbers from 1 to 6, and the sum of two opposite faces is always 7.

That is, if on one side we have the number 1 we would automatically have the number 6 on the other side.

Image of Classic Dice: "http://4.bp.blogspot.com/-05vr9yIANDs/T_M9mLqEomI/AAAAAAAABe0/VZTqaYc7new/s1600/Sem+t%C3%ADtulo.png"

Input

The first line of input contains a number N that indicates the number of test cases.
Each test case consists of six integers representing the value of each face of the die.
The numbers will be given in three lines, which represent the planning of the data, as in the figure above.

Output

You should display (Yes) if Tustin has purchased a classic dice, and (No) otherwise.
*/

#include <iostream>
using namespace std;

class Dice{ //declaring the class for Dice
	public:
		int Tests(int N); // Functions for Dice
		int SuperiorSide(int y);
		int InferiorSide(int d);
		void Result(int y,int d,int z,int a,int b,int c);
};

int Dice::Tests(int N){ //Number of tests
	cout<<"Number of tests"<<endl;
	cin>>N;
	return N;
}

int Dice::SuperiorSide(int y){ //The number on Superior Side
	cout<<"Put the number on Superior Side"<<endl;
	cin>>y;
	return y;
}

int Dice::InferiorSide(int d){ // The number on Inferior Side
	cout<<"Put the number on Inferior Side"<<endl;
	cin>>d;
	return d;
}

void Dice::Result(int y,int d,int z,int a,int b,int c){ //Tests to see if the die is classic
	cout<<"It was Classic Dice?"<<endl;
	
	if (y+d==7&&z+b==7&&a+c==7)
		cout<<"YES"<<endl;
	else
		cout<<"NO"<<endl;
}

int main(){
	int N,y,z,a,b,c,d;
	
	Dice d1;
	
	N=d1.Tests(N);
	
	for (int x=0;x<N;x++){
		y=d1.SuperiorSide(y);
		
		cout<<"Put the numbers on Center Side"<<endl; //Obs: Return Multiple Values, I don't understand much about this, Really, Sorry about that
		cin>>z>>a>>b>>c;
		
		d=d1.InferiorSide(d);
		
		d1.Result(y,d,z,a,b,c);
	}
	return 0;
}
