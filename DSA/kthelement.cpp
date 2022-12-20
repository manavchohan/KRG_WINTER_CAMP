#include <bits/stdc++.h>
using namespace std;

void sep(int arr[],int n,int l,int r){
    if (l==r){
        return;
    }
    if(arr[l]<0){
        sep(arr,n,l+1,r);
    }  
    else {
        if(arr[r]<0){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            sep(arr,n,l+1,r-1);
        } else {
            sep(arr,n,l,r-1);
        }
    }
}

int main(){
  

    int arr[6] = {9,-1,8,-4,10,-3};
    sep(arr,6,0,5);
    for(int i=0;i<6;i++){
        cout<<arr[i]<<endl;
    }

    

    return 0;
}