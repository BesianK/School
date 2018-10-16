#pragma once
class Calc
{
public:
	Calc();
	~Calc();
	void calcControl();
	double calculatePay(double, double);
private:
	double hours, rate, pay, total;
};

