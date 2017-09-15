/*
The Libertadores Cup is the main soccer competition among professional clubs of South America,
organized by the South American Confederation of Soccer (CONMEBOL). 
This cup is known for having a very complicated regulation, especially for the quarter finals and 
semi-final.

These stages are played roundtrip matches in the playoff system. 
Wins the team that makes the highest score accumulated in the two matches,
 with 3 points for a win and 1 point in case of a tie, both per match. In case of a tie in score, the tiebreaker criteria are:

1) goal difference (number of goals for minus the number of goals against)

2) most goals scored in the away match and

3) penalty shootout

All criteria must be applied considering the accumulated of the two matches.

Can you develop an algorithm that, given the results of the roundtrip matches, it identifies the winning team?

Input

The first line of input gives the number of test cases N (1 = N = 100). Each test case consists of two scores:
the outcome of match 1 and the outcome of the 2. The score is represented by the format M x V,
where M (1 = M = 100) is the number of goals for principal team and V (1 = V = 100) is the number of goals for the visiting team.
As for each test case there are 2 matches,
consider that Team 1 is always the principal of the first match and the visitor of the second and vice versa for Team 2.

Output

For each test case, print a line containing "Time 1" (without quotes) if Team 1 is the winner of the playoff,
" Time 2" (without quotes) if the Team 2 is the winner of the playoff and "Penaltis" (without quotes)
if you can not identify the winner in conventional time. */

#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int score[4];
    int n; //declaring variables
	
	cout<<"Number of tests"<<endl; // How many tests to do
    cin>>n; 

    for(int i=0;i<n;i++) //Whole test
    {
        for(int j=0;j<4;j+=2) //Putting the Score
        {
            cout<<"Score"<<endl;
            cin >> score[j];
            cout<<"Score"<<endl;
            cin >> score[j+1];
        }

        if((score[0] + score[3]) > (score[1] + score[2])) //Logic to say the answer
            cout << "Time 1" << endl; 
        else if((score[0] + score[3]) < (score[1] + score[2]))
            cout << "Time 2" << endl;
        else 
        {
            if(score[3] > score[1])
                cout << "Time 1" << endl;   
            else if (score[1] > score[3])
            	cout<<"Time 2"<<endl;
			else
                cout << "Penaltis" << endl;
        }
    }
    return 0;
}
