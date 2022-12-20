#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[]= { 1,2,3,4,5};
    int s= sizeof(arr)/ sizeof(arr[0]);
    int c=0;
    int k= 5;
    while(c<k){
    int temp = arr[s-1];
    for(int i=s; i>0; i--){
        arr[i]= arr[i-1];
    }
    arr[0]= temp;
    for(int j=0; j<s; j++){
        cout<< arr[j];
    }
    cout<< endl;
    c++;
    }
return 0;
}