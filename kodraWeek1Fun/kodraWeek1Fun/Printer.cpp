#include "pch.h"
#include "Printer.h"
#include <iostream>

using namespace std;

const int SIZE = 10;
int numberArray[SIZE] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

Printer::Printer()
{
}

Printer::~Printer()
{
}

void Printer::displayArrayIntro()
{
	cout << "\n\t\tHere's an array of ten numbers: ";
}

void Printer::displayArray()
{
	for (int i = 0; i < SIZE; i++)
	{
		cout << numberArray[i] << " ";
	}
}
