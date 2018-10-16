#pragma once
#ifndef BUBBLESORT_H
#define BUBBLESORT_H

class BubbleSort
{
public:
	BubbleSort();
	~BubbleSort();
	void sortControl();
	void sortArray(int[], int);
	void showArray(const int[], int);
};
#endif