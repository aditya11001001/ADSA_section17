public static void main(String[] args) {
        int[] arr = {6,7,4,5,4};
        int splitIdx = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<arr.length; i++){
            rightSum += arr[i];
        }
        for(int i=0; i<arr.length; i++){
            leftSum += arr[i];
            rightSum -= arr[i];

            if (leftSum == rightSum){
                splitIdx = i;
                break;
            }
        }

        int[] leftArr = new int[splitIdx+1];
        int[] rightArr = new int[arr.length - leftArr.length];

        for(int i=0; i<=splitIdx; i++){
            leftArr[i] = arr[i];
        }
        for(int i=0; i<rightArr.length; i++){
            rightArr[i] = arr[splitIdx+i+1];
        }
        for(int i=0; i<leftArr.length; i++){
            System.out.print(leftArr[i]);
        }
        System.out.println();
        for(int i=0; i<rightArr.length; i++){
            System.out.print(rightArr[i]);
        }
    }
