#pragma once

class CreateList
{
public:
	CreateList();
	~CreateList();
	void createnode(int);
	void insert_start(int);
	void display();
	void insert_position(int, int);
	void delete_first();
	void delete_last();
	void delete_position(int);

	//double userEntry;
	//ListNode previousPtr;
	//void doStuff();
	//void addNode(double userEntry, ListNode *previousPtr);
};
struct node
{

	/*double value;*/
	int data;
	node *next;
};

