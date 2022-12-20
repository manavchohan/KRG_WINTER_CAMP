#include <bits/stdc++.h>
using namespace std;

void greaterright( int arr[][3], int m, int n, int arr2[][3]){
    for(int i= 0; i<m; i++){
        for(int j=0; j<n; j++){
            int count=0;
            for(int k =i; k< m; k++){
                for(int l=j; l<n; l++){
                    if(arr[i][j]< arr[k][l]) count++;
                }
            }
            arr2[i][j]= count;
        }
    }
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
        cout << arr2[i][j]<< " ";
        }
        cout<< endl;
    }
}

int main(){
    int arr[2][3]= {{7, 12, 6}, {6,7,8}};
  
     int arr2[2][3];
    greaterright(arr, 2, 3, arr2);
    
return 0;
}