
#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;
    node(int val){
        data=val;
        next=NULL;
        
    }
}; 
// void insertionatmid(node *head,int val,int pos){
//     node* n= new node(val);
//     node* temp=head;
//     int count=1;
//     while(temp!=NULL && count!=pos){
//          temp=temp->next;
//          count++;
//     }
//     n->next=temp->next;
//     temp->next=n;

    
// }

void insertatTail(node* &head, int val){
    node* n= new node(val);
     if(head==NULL){
        head=n;
        return;
    }
    node* temp=head;
    while(temp->next !=NULL){
        temp= temp->next;
    }
    temp->next=n;
}
void deletion(node* &head, int pos){
    node* temp=head;
    int count=0;
    while(temp!=NULL && count!=pos-1){
        temp=temp->next;
        count++;
    }
    temp-> next = temp->next->next;
}
void insertatHead(node* &head, int val){
    node* n=new node(val);
    n->next=head;
    head=n;
}

void reverse(node* &head){
    node* prev = NULL;
    node* curr = head;
    node* cnext = NULL;
    while(curr!=NULL){
        cnext=curr->next;
        curr->next=prev;
        prev=curr;
        curr=cnext;
    }
    head=prev;
}

void display(node* head){
    node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"-->";
        temp= temp->next;
    }
    cout<<"Null"<< endl;
}

int main(){
    node* head=NULL;
    insertatTail(head,1);
    insertatTail(head,2);
    insertatTail(head,3);
    display(head);
    insertatHead(head,4); 
    display(head);
    reverse(head);
    display(head);
    return 0;
}
