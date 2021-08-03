class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mylist = new ArrayList<>();
        Arrays.sort(nums);
        getlist(nums,mylist,new ArrayList<Integer>(),0);
        return mylist;
    }
    
    public void getlist(int[] nums,List<List<Integer>> mylist,List<Integer> current,int pos){
        mylist.add(new ArrayList(current));
        for(int i=pos;i<nums.length;i++){
            if(i != pos && nums[i] == nums[i-1])
                continue;
            current.add(nums[i]);
            getlist(nums,mylist,current,i+1);
            current.remove(current.size()-1);
        }
    }
    
}
