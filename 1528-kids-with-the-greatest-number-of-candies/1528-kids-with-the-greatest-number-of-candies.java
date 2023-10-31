class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int ex) {
        int max=0;
        for(int num:can){
            max=Math.max(max,num);
        }
        ArrayList<Boolean> list=new ArrayList<>();
        for(int num:can){
            if((num+ex)>=max){
                
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}