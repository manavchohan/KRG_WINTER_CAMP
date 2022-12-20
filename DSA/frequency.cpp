// Submitted by Manav Chohan, UID: 20BCS4842
#include <bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int x, int low, int high){
   if(low <= high){
        int mid = (high + low)/2;

        if(x < arr[mid]){
            return binarySearch(arr, x, low, mid+1);
        }
        else if(x > arr[mid]){
           return binarySearch(arr, x, mid-1, high);
        }
        else{
            return mid;
        }
    }
    else{
        return -1;
    }
}
int frequency(int arr[], int n, int x){
    int m= binarySearch(arr, x, 0, n);
    if(m == -1){
        return 0;
    }
    int count = 1;
    int left = m -1;
    while(left >= 0 && arr[left]==x){
        count++, left --;
    }
    int right = m +1;
    while(right<n && arr[right]== x){
        count++, right ++;
    }
    return count;
    }

int main()
{
    int arr[] = {10, 20, 20, 20, 50, 60, 70, 70, 90, 100};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x;
    cin >> x;
    int res = frequency(arr, n, x);
    cout << "Result is " << res;
    return 0;
}