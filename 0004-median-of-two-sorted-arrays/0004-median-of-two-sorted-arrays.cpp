#include <iostream>
#include <vector>

using namespace std;
class Solution {
public:

// Define a function to find the median of two sorted arrays
double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    // Define variables to keep track of the size and indices of the arrays
    int m = nums1.size();
    int n = nums2.size();
    int i = 0;
    int j = 0;

    // Define a vector to store the merged array
    vector<int> merged;

    // Loop through both arrays, adding the smaller element from each array to the merged array
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            merged.push_back(nums1[i]);
            i++;
        }
        else {
            merged.push_back(nums2[j]);
            j++;
        }
    }

    // Add any remaining elements from the first array to the merged array
    while (i < m) {
        merged.push_back(nums1[i]);
        i++;
    }

    // Add any remaining elements from the second array to the merged array
    while (j < n) {
        merged.push_back(nums2[j]);
        j++;
    }

    // If the merged array has an odd number of elements, return the middle element
    if ((m + n) % 2 == 1) {
        return merged[(m + n) / 2];
    }

    // If the merged array has an even number of elements, return the average of the two middle elements
    else {
        return (merged[(m + n) / 2 - 1] + merged[(m + n) / 2]) / 2.0;
    }
}

int main() {
    // Create two sorted arrays
    vector<int> nums1 = {1, 3, 5, 7};
    vector<int> nums2 = {2, 4, 6, 8, 10};

    // Print the median of the two sorted arrays
    cout << "The median of the two arrays is " << findMedianSortedArrays(nums1, nums2) << endl;

    return 0;
}






};


