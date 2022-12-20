#include <bits/stdc++.h>
using namespace std;
int length(char arr[]){
    int i=0;
    while( *(arr+i) != '\0'){
        i++;
    }
    return i;
}


int main(){
    char arr[] = {'a', 'b', 'c', '\0'};
    cout<< length(arr);
    
return 0;
}