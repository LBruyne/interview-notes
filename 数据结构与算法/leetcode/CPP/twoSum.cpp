#include <vector>
#include <map>
using namespace std;

/*
    Violent solution

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int idx1, idx2, flag = 0;
        vector<int> ans;
        for(idx1 = 0; idx1 < nums.size(); idx1++) {
            for(idx2 = idx1+1; idx2 < nums.size(); idx2++) {
                if(nums[idx1] + nums[idx2] == target) {
                    ans.push_back(idx1);
                    ans.push_back(idx2);
                    return ans;
                }
            }
        }
        return ans;
    }
};

*/

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> intMap;
        for(int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            auto iter = intMap.find(complement);
            if(iter != intMap.end()) {
                return {iter->second, i};
            }
            intMap[nums[i]] = i;
        }
        return {};
    }
};