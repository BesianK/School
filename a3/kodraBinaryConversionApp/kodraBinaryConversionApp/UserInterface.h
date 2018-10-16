#pragma once
#ifndef USERINTERFACE_H
#define USERINTERFACE_H

// Besian Kodra || ITDEV-154 || Assignment 3

class UserInterface
{
public:
	UserInterface();
	~UserInterface();
	char receiveUserInput();
	int searchArray(char);
	void convertToBinary(int);
	void printConversion();
};

#endif