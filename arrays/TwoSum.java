//brute force is at last, optimized to Time: O(n) and Space: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int remains = target-nums[i];
            if(map.containsKey(remains))
            {
                return new int[]{map.get(remains), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] indices = new int[2];
//         for(int i=0; i<nums.length-1; i++)
//         {
//             for(int j=i+1; j<nums.length; j++)
//             {
//                 if(nums[i]+nums[j] == target)
//                 {
//                     indices[0]=i;
//                     indices[1]=j;
//                     break;
//                 }
//             }
//         }

//         return indices;
//     }
// }
