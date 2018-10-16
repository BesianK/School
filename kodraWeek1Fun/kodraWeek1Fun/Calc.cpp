#include "pch.h"
#include "Calc.h"
#include <iostream>

using namespace std;

Calc::Calc()
{
}

Calc::~Calc()
{
}

void Calc::calcControl()
{
	cout << "\n\t\tThis program accepts hours and rate, then outputs pay.\n\n";

	cout << "\t\tHow many hours did you work this pay period?\n\t\t";
	cin >> hours;

	cout << "\t\tWhat is your pay rate?\n\t\t";
	cin >> rate;

	total = calculatePay(rate, hours);
	cout << "\t\tYou have earned: $";
	cout << total << endl;
}

double Calc::calculatePay(double calcRate, double calcHours)
{
	double calcPay = calcHours * calcRate;
	return calcPay;
}
