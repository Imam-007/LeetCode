class Solution {
    public boolean checkIfExist(int[] arr) {
        // List<Integer>list=new ArrayList<>();
        // for(int num:arr){
        //     list.add(num);
        // }
        // int count=0;
        // for(int num:arr){
        //     if(num==0){
        //         count++;
        //     }
        // }
        // for(int num:arr){
        //     if(num==0&&count>=2){
        //         return true;
        //     }else if(list.contains(num)&&list.contains(2*num)&&num!=0){
        //         return true;
        //     }
        // }
        // return false;


        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i!=j && arr[i]==2*arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(2*arr[i]) && map.get(2*arr[i])!=i){
                return true;
            }
        }
        return false;
    }
}