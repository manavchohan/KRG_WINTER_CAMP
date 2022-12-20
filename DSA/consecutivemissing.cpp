#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[]= { 11,12,13,14,15,17};
    int n= sizeof(arr)/ sizeof(arr[0]);
    for(int i=0; i<n; i++){
        if(arr[i+1]-arr[i]==1){
            continue;
        }
        else{ cout<< arr[i]+1;
        break;
        }
    }
    return 0;
}