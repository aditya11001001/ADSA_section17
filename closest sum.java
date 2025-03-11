public static void main(String[] args) {
        int[] arr = {1,10,4,5};
        int target = 13;
        HashSet<Integer> set = new HashSet<>();
        int closest = 0;
        int minDiff = -1;

        for (int i=0; i< arr.length-2; i++){
            for (int j=i+1; j< arr.length; j++){
                for (int k=j+1; k< arr.length; k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    int diff = target - sum;
                    if(diff<0){
                        diff*=-1;
                    }
                    if (minDiff==-1 || diff<minDiff){
                        closest = sum;
                        minDiff = diff;
                    }
                }
            }
        }
        System.out.println(closest);
    }
