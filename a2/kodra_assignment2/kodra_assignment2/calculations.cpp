#include "pch.h"
#include "calculations.h"
#include <ctime>
#include <iostream>
#include <cstdlib>
#include <sys/timeb.h>
#include "display.h"
// Besian Kodra || ITDEV-154 || Assignment 2
using namespace std;

int number;

calculations::calculations()
{
}


calculations::~calculations()
{
}

int calculations::getMilliCount() //programmer defined function for getting system time
{
	timeb tb;					//returns system time
	ftime(&tb);
	int nCount = tb.millitm + (tb.time & 0xfffff) * 1000; //gets system time by using tb reference to system time
	return nCount;
}

int calculations::getMilliSpan(int nTimeStart)
{
	int nSpan = getMilliCount() - nTimeStart; //calculates time elapsed takes difference between end of the loop run less start time.
	return nSpan;
}

int calculations::linear() // No matter what numbers I ran, it only calculated that amount of calculations.
{
	cout << "\n\n\t\tStarting timer for linear calculation...";

	int start = getMilliCount();	//gets start time

	int n = number; // CODE I WANT TO TIME

	//linear  O(n)
	for (int i = 0; i < n; i++)
	{
		cout << i << endl;
	}

	int milliSecondsElapsed = getMilliSpan(start);  //uses another built in method millispan
	cout << "\n\n\t\tStart time = " << start << " milliseconds";
	cout << "\n\t\tTime Elapsed timer...";
	cout << "\n\t\tElapsed time = " << milliSecondsElapsed << " milliseconds";
	cout << "\n\t\tEnd Time Elapsed timer...";

	int end = getMilliCount();                //gets end time
	cout << "\n\t\tEnding time = " << end << " milliseconds";
	cout << endl << endl;
	return 1;
}
int calculations::quadratic() //The higher the number I put in, the exponentially longer the amount of time to run it is. 
{
	cout << "\n\n\t\tStarting timer for quadratic calculation...";

	int start = getMilliCount();	//gets start time

	int n = number; // CODE I WANT TO TIME

	//quadratic O(n^2)
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cout << i << i << j << endl;
		}
	}

	int milliSecondsElapsed = getMilliSpan(start);  //uses another built in method millispan
	cout << "\n\n\t\tStart time = " << start << " milliseconds";
	cout << "\n\t\tTime Elapsed timer...";
	cout << "\n\t\tElapsed time = " << milliSecondsElapsed << " milliseconds";
	cout << "\n\t\tEnd Time Elapsed timer...";

	int end = getMilliCount();                //gets end time
	cout << "\n\t\tEnding time = " << end << " milliseconds";
	cout << endl << endl;
	return 1;
}

void calculations::getNumber(int aNumber)
{
	number = aNumber;
}
