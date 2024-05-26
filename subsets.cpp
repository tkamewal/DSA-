#include <iostream>
#include <vector>
using namespace std;
void Subsets(const vector<int>& a, vector<int>& subset, int ind) {
for (int num:subset){
        cout <<num<<" ";
    }
    cout<<endl;
    for (int i=ind;i<a.size();i++) {
        subset.push_back(a[i]);
        Subsets(a,subset,i+1);
        subset.pop_back();
    }
}
void generateSubsets(const vector<int>& a) {
    vector<int>subset;
    Subsets(a, subset, 0);
}
int main() {
    vector<int> a = {1,2,3,4,5,6};

    cout << "All  the subsets of the array is..." << endl;
    generateSubsets(a);

    return 0;
}
