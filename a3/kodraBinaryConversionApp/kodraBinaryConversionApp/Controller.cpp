#include "pch.h"
#include "Controller.h"
#include "UserInterface.h"
#include <iostream>
#include <string>

using namespace std;

// Besian Kodra || ITDEV-154 || Assignment 3

Controller::Controller()
{
}


Controller::~Controller()
{
}

void Controller::programControl()
{
	UserInterface ui;
	do
	{
		screenInput = ui.receiveUserInput();
		asciiCode = ui.searchArray(screenInput);
		ui.convertToBinary(asciiCode);
		ui.printConversion();
	} while (screenInput != '0');
	{
		exit(0);
	}
}