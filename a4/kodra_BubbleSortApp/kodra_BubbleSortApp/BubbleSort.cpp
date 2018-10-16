#include "pch.h"
#include "BubbleSort.h"
#include <iostream>

using namespace std;

const int SIZE = 10;
// Array of unsorted variables
int values[SIZE] = { 99, 7, 2, 8, 3, 9, 1, 61, 33, -12 };

BubbleSort::BubbleSort()
{
}
BubbleSort::~BubbleSort()
{
}

void BubbleSort::sortControl()
{
	for (int count = 0; count < 10; count++)
	{
		cout << "Please enter one number: " << endl;
		cin >> values[count];
	}

	cout << "\n\n\tHere is the unsorted array: " << " ";
	showArray(values, SIZE);
	cout << endl;

	sortArray(values, SIZE);

	cout << "\n\n\tHere is the sorted array: " << " ";
	showArray(values, SIZE);
	cout << endl;
}

void BubbleSort::sortArray(int array[], int size)
{
	int temp;
	bool swap;

	do // loop that will continue to run for every item in the array
	{
		swap = false; // the boolean value for swaping items starts out as false

		for (int count = 0; count < (size - 1); count++) // This loop is basically going through every individual item within the 10 digit array
		{
			if (array[count] > array[count + 1]) // This is testing if a certain item in the array is greater than the one that comes after it
			{
				temp = array[count]; // Setting the temporary place for the item count
				array[count] = array[count + 1]; // since the item is greater than the one that comes after it, we are moving it up one place. We're adding one to the number it holds within the array.
				array[count + 1] = temp; // Adding one to the temporary place for the item count
				swap = true; // Swapping the item with the one that used to be after it in line.
			}
		}
	} while (swap);
}

void BubbleSort::showArray(const int array[], int size)
{
	for (int i = 0; i < size; i++)
	{
		cout << array[i] << " ";
	}
}