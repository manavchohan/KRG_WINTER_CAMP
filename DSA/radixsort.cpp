#include <bits/stdc++.h>
using namespace std;

// int countsort(int arr[], int n, int k){
//     int arr2[k];
//     int finalarr[k];
//     for(int i=1; i<=k; i++){
//         arr2[i]= 0;
//     }
//     for(int i=0; i< n; i++){
//         int ind= arr[i];
//         arr2[ind]++;
//     }
//     for(int i=1; i<=k; i++){
//         if(arr2[i]==1){
//             cout<< i<< " ";
//         }
//         else if( arr2[i]> 1){
//             while(arr2[i] != 0){
//                 cout<< i << " ";
//                 arr2[i]--;
//             }
//         }
//     }
//     return 0;
// }

int main(){
    int arr[7]= { 2,4,3,1,2,4,2};
    int n= sizeof(arr)/ sizeof(arr[0]);
    countsort(arr, n,4 );
    return 0;
}