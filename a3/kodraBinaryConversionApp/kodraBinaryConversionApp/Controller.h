#pragma once

// Besian Kodra || ITDEV-154 || Assignment 3

class Controller
{
public:
	Controller();
	~Controller();
	void programControl();

private:
	char screenInput = ' ';
	int asciiCode;
};