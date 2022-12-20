#include <bits/stdc++.h>
using namespace std;
//**********NAME: MANAV CHOHAN, UID: 20BCS4842

void printAllSubsetsRec(int arr[], int n, vector<int> v,
                        int sum)
{

    if (sum == 0) {
        for (auto x : v)
            cout << x << " ";
        cout << endl;
        return;
    }
 
    if (n == 0)
           return;

    printAllSubsetsRec(arr, n - 1, v, sum);
    v.push_back(arr[n - 1]);
    printAllSubsetsRec(arr, n - 1, v, sum - arr[n - 1]);
}
 

void printAllSubsets(int arr[], int n, int sum)
{
    vector<int> v;
    printAllSubsetsRec(arr, n, v, sum);
}
 

int main()
{
    int arr[] = { 3,7,8,12,14,5 };
    int sum = 19;
    int n = sizeof(arr) / sizeof(arr[0]);
    printAllSubsets(arr, n, sum);
    return 0;
}
   