#include <iostream>

using namespace std;
void copystringsn(char arr1[], int n){
    char newarr[n];
    int i= 0;
    while( arr1[i]!= '\0'){
        newarr[i]= arr1[i];
        i++;
    }
    for(int i= 0; i< n; i++){
        cout<< newarr[i];
    }
    cout<< endl;
}

void copystrings(char arr1[], int a){
    char newarr[a];
    int i= 0;
    while( arr1[i]!= '\0'){
        newarr[i]= arr1[i];
        i++;
    }
    for(int i= 0; i< a; i++){
        cout<< newarr[i];
    }
    cout<< endl;
}

// void concat(char arr1[], char arr2[], int n, int a ){
//     char newarr[a+n];
//     int i=0;
//     while(*(arr1+i)!= '\0'){
//         newarr[i]= arr1[i];
//         i++;
//     }
//     for(int j =0; j< n; j++){
//         newarr[i]= arr2[j];
//         i++;
//     }
//     newarr[a+n]= '\0';
//     puts(newarr);

// }

// bool compare(char arr1[], char arr2[], int n){
//     for(int i=0; i< n; i++){
//         if(arr1[i]== arr2[i]){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }


int main(){
    char arr1[]={ 'm', 'a', 'n', 'a', 'v', '\0'};
    char arr2[]= { 'c', 'h', 'o', 'h', 'a', 'n', '\0'};
    int a= sizeof(arr1)/ sizeof(arr1[0]);

    int n= 5;
    // cout<< compare(arr1, arr2, n);
    // concat(arr1, arr2, n,a );
    copystrings(arr1, a);
    copystringsn(arr1, n);
    

return 0;
}