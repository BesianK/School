#include "pch.h"
#include "display.h"
#include <iostream>
#include "calculations.h"
// Besian Kodra || ITDEV-154 || Assignment 2
using namespace std;

calculations calc;

display::display()
{
}


display::~display()
{
}

void display::getNumber()
{
	int number;
	cout << "\n\n\t\tWelcome to Besian's Timer APP.\n\t\tLet's make a linear and a quadratic calculation.";
	cout << "\n\n\t\tPlease enter a number for the calculations and press the Enter key: ";
	cin >> number;
	calc.getNumber(number);
}

void display::displayResults()
{
	calc.linear();
	calc.quadratic();
}
void display::goodbye()
{
	cout << "\n\n\t\tThank you for using this app. Press any key to exit.\n\n\n";
}