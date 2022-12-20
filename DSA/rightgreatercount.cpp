#include <bits/stdc++.h>
using namespace std;

void greaterright(int arr[], int n, int arr2[]){
    
    for(int i= 0; i<n; i++){
        int count= 0;
        for(int j=i+1; j<n; j++){
            if(arr[i]< arr[j]){
                count++;
            }
        }
        arr2[i]= count;
    }
    for(int i=0; i<n; i++){
        cout << arr2[i];
    }
}

int main(){
    int arr[]= {7, 12, 6, 4, 13, 5};
    int n = sizeof(arr)/ sizeof(arr[0]);
    int arr2[n];
    greaterright(arr, n, arr2);
return 0;
}