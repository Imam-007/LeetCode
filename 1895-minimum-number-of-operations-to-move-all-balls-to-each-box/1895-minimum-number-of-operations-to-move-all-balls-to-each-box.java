class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];

        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if(i!=j&&boxes.charAt(j)=='1'){
        //             count+=Math.abs(i-j);

        //         }
        //     }
        //     arr[i]=count;
        // }
        int ahead=0,behind=0;
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                ahead++;
                arr[0]+=i;
            }
        }
        if(boxes.charAt(0)=='1'){
            ahead--;
            behind++;
        }
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]-ahead+behind;
            if(boxes.charAt(i)=='1'){
                ahead--;
                behind++;
            }
        }
        return arr;
    }
}