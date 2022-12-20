#include <bits/stdc++.h>
using namespace std;
int length(char arr[]){
    int i=0;
    while( *(arr+i) != '\0'){
        i++;
    }
    return i;
}

void reverse(char arr[], int l){
    char *start= arr;
    char *end = arr + (l-1);
    for(int i=0; i< l/2; i++){
        char temp= *end;
        *end= *start;
        *start= temp;

        start++;
        end++;
    }
    for(int i=0; i< l; i++){
        cout<< arr[i]<< " ";
    }

}

int main(){
    char arr[] = {'a', 'b', 'c', '\0'};
    int l=length(arr);
    reverse(arr, l);
return 0;
}