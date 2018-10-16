#include "pch.h"
#include "UserInterface.h"
#include <string>
#include <iostream>
#include <ctype.h>

// Besian Kodra || ITDEV-154 || Assignment 3

using namespace std;

//declarations
const int SIZE = 26;
char asciiLetter[SIZE] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', };
int numberArray[SIZE] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };
const int LENGTH = 8;
int binaryArray[LENGTH] =  { 128, 64, 32, 16, 8, 4, 2, 1 };
int displayArray[LENGTH] = { 0, 0, 0, 0, 0, 0, 0, 0 };
char userEntry;

UserInterface::UserInterface()
{
}


UserInterface::~UserInterface()
{
}

char UserInterface::receiveUserInput()
{
	cout << "Enter in a letter to convert or press 0 to exit: \n";
	cin >> userEntry;

	return (toupper(userEntry));
}

int UserInterface::searchArray(char letter)
{
	int result = 0;
	int j = 0;
	int found = 0;
	cout << "Here is your letter:  " << letter << endl;

	do
	{
		//cout << "found indicator: " << found << endl;
		//cout << "size: \n" << SIZE << endl;
		if (asciiLetter[j] == letter)
		{
			cout << "Letter Found in the ascii table \n";
			result = numberArray[j];
			found = 1;
		}
		j++;
	} while (found == 0);

	return result;
}

void UserInterface::convertToBinary(int number)
{
	cout << "Here is the ascii number of your letter:  " << number << endl;

	for (int k = 0; k < LENGTH; k++)
	{
		displayArray[k] = 0;
	}
	int i = 0;

	while (i < LENGTH)
	{
		int total = (number / binaryArray[i]);
		int remainder = number % binaryArray[i];
		if (total >= 1)
		{
			displayArray[i] = 1;
			number = remainder;
		}
		else
		{
			displayArray[i] = 0;
		}
		i++;
	}
}

void UserInterface::printConversion()
{
	cout << "Here's the binary conversion for your number: ";

	for (int i = 0; i < LENGTH; i++)
	{
		cout << displayArray[i];
	}
	cout << endl;
}


