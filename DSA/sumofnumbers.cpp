#include <bits/stdc++.h>
using namespace std;

int sum(int a){
    if (a==0){
        return a;
    }
    return ( a%10 + sum(a/10));
}

int main(){
    int a= 568;
    cout<< sum(a);
}