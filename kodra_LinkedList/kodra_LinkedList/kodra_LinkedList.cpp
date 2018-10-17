// kodra_LinkedList.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include "CreateList.h"
#include <string>

using namespace std;

int main()
{
	CreateList cl;
	int userEntry;
	int position;
	string userCont = "Y";
	bool cont;
	cl.createnode(25);
	cl.createnode(50);
	cl.createnode(90);
	cl.createnode(40);
	cl.display();


	do {
		cont = true;

		cout << endl;
		cout << "Enter the node position you will insert: ";
		cin >> position;
		cout << endl;
		cout << "Enter a number to insert: ";
		cin >> userEntry;
		cl.insert_position(position, userEntry);
		cl.display();


		cout << endl;
		cout << "What position do you want to delete? Enter 0 to skip. ";
		cin >> position;
		cl.delete_position(position);
		cl.display();

		cout << endl;
		cout << "Enter Y to continue or N to quit. Y or N: ";
		cin >> userCont;
		if (userCont == "N" || userCont == "n") {
			cont = false;
		};

	} while (cont);

	return 0;
}


// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
